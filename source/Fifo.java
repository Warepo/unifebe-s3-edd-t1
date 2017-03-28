/**
* A FIFO (First-In First-Out) list "interface".
* @author odahcam
* @author anologicon
*/
public class Fifo {

    private int lista_int[];
    private String lista_string[];
    private int end;
    private int begin;
    private int length;

    public Fifo() {

        // this.length = args.length > 1 && args[0] != null ? args[0] : 20;
        this.length = 20;
        this.lista_int = new int[this.length];
        this.lista_string = new String[this.length];

        this.end = -1;
        this.begin = -1;

    }

    /**
    * Adds an employee to the list.
    * @method insert
    * @param {int} id : The employee ID number.
    * @param {String} name : The employee name.
    * @return {boolean} Returns true on success and false on failure.
    */
    public boolean insert(int id, String name) {

        int aux = (this.end + 1) % this.length;

        if (aux != this.begin) {

            this.end = aux;
            this.lista_int[aux] = id;
            this.lista_string[aux] = name;

            if (this.begin < 0) {
                this.begin = 0;
            }

            return true;
        }

        return false;
    }

    /**
    * @method remove
    * @return {boolean} Returns true on success and false on failure.
    */
    public boolean remove() {

        boolean output = false;

        if (this.begin >= 0) {

            if (this.begin == this.end) {
                this.begin = -1;
                this.end = -1;
            } else {
                this.begin = (this.begin + 1) % this.length;
            }

            output = true;
        }

        return output;
    }

    public void destroy() {
        this.begin = -1;
        this.end = -1;
    }

    /**
    * Show the list items.
    * @return {void} Returns nothing.
    */
    public void show() {

        if (this.begin == -1) {
            System.out.println("Fila Vazia!");
            return;
        }

        int aux = -1;

        System.out.println("\n╔══ Lista de funcionários.");

        do {

            ++aux;

            System.out.println("╠╦═ " + this.lista_int[aux]);
            System.out.println("║╚═ " + this.lista_string[aux]);

        } while (aux < this.end);

        System.out.println("╚═══════════════════════════");
    }

    /**
    * Gets an employee name by it's index in the list.
    * @method getByIndex
    * @param {int} index : The employee index in list.
    * @return {String} Returns the emplyee name.
    */
    public String getByID(int id) {

        String output = "Fila Vazia!";

        if (this.begin != -1) {

            int aux = -1;

            do {
                ++aux;

                if (this.lista_int[aux] == id) {
                    output = "Nome: "+this.lista_string[aux];
                    break;
                }

            } while (aux < this.end);

        }

        return output;
    }

    /**
    * Finds the emplyee position by it's ID.
    * @param {int} id : the emplyee ID
    * @return {String} Returns the emplyee name.
    */
    public int getPositionByID(int id)
    {
        int output = -1;

        if (this.begin != -1) {

            int aux = -1;

            do {
                ++aux;

                if (this.lista_int[aux] == id) {
                    output = 20;
                    break;
                }

<<<<<<< HEAD
        } while (aux < this.end);
        return "";
=======
            } while (aux < this.end);
        }

        return output;
>>>>>>> 9e5edcf03416e89585414f6bb7c35cd29fcae208
    }
}
