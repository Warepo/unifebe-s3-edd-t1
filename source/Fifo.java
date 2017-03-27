/**
* A FIFO (First-In First-Out) list "interface".
* @author odahcam
* @author anologicon
*/
public class Fifo {

    private int lista_int[];
    private String lista_string[];
    private int ending;
    private int beginning;
    private int length;

    public Fifo() {

        // this.length = args.length > 1 && args[0] != null ? args[0] : 20;
        this.length = 20;
        this.lista_int = new int[this.length];
        this.lista_string = new String[this.length];

        this.ending = -1;
        this.beginning = -1;

    }

    /**
    * Adds an employee to the list.
    * @method insert
    * @param {int} id : The employee ID number.
    * @param {String} name : The employee name.
    * @return {boolean} Returns true on success and false on failure.
    */
    public boolean insert(int id, String name) {

        int aux = (this.ending + 1) % this.length;

        if (aux != this.beginning) {

            this.ending = aux;
            this.lista_int[aux] = id;
            this.lista_string[aux] = name;

            if (this.beginning < 0) {
                this.beginning = 0;
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

        if (this.beginning >= 0) {

            if (this.beginning == this.ending) {
                this.beginning = -1;
                this.ending = -1;
            } else {
                this.beginning = (this.beginning + 1) % this.length;
            }

            output = true;
        }

        return output;
    }

    public void destroy() {
        this.beginning = -1;
        this.ending = -1;
    }

    /**
    * Show the list items.
    * @return {void} Returns nothing.
    */
    public void show() {

        if (this.beginning == -1) {
            System.out.println("Fila Vazia!");
            return;
        }

        int aux = -1;

        System.out.println("\n╔══ Lista de funcionários.");

        do {

            ++aux;

            System.out.println("╠╦═ " + this.lista_int[aux]);
            System.out.println("║╚═ " + this.lista_string[aux]);

        } while (aux < this.ending);

        System.out.println("╚═══════════════════════════");
    }

    /**
    * Gets an employee name by it's index in the list.
    * @method getNameByID
    * @param {int} index : The employee index in list.
    * @return {String} Returns the emplyee name.
    */
    public String getNameByID(int id) {

        String output = "Fila Vazia!";

        if (this.beginning != -1) {

            output = "Não encontrado!";

            int aux = -1;

            do {
                ++aux;

                if (this.lista_int[aux] == id) {
                    output = this.lista_string[aux];
                    break;
                }

            } while (aux < this.ending);

        }

        return output;
    }

    /**
    * Finds the emplyee index by it's ID.
    * @method getIndexByID
    * @param {int} id : the emplyee ID
    * @return {String} Returns the emplyee index.
    */
    public int getIndexByID(int id)
    {
        int output = -1;

        if (this.beginning != -1) {

            int aux = -1;

            do {
                ++aux;

                if (this.lista_int[aux] == id) {
                    output = aux;
                }

            } while (aux < this.ending);
        }

        return output;
    }

    /**
    * Finds the emplyee position by it's ID.
    * @method getPositionByID
    * @param {int} id : the emplyee ID
    * @return {String} Returns the emplyee position.
    */
    public int getPositionByID(int id)
    {
        int position = -1;
        int index = this.getIndexByID(id);

        if (index != -1) {

            int aux = -1;

            do {
                ++aux;

                if (this.lista_int[aux] == id) {
                    position = aux - this.beginning;
                    position = position < 0 ? aux + this.ending : position + 1;
                    break;
                }

<<<<<<< HEAD
            } while (aux < this.ending);
        }

        return position;
=======
<<<<<<< HEAD
        } while (aux < this.end);
        return "";
=======
            } while (aux < this.end);
        }

        return output;
>>>>>>> 9e5edcf03416e89585414f6bb7c35cd29fcae208
>>>>>>> 09b5ad5ac963304c9fd9d0c6bc19ee46a889b7d0
    }
}
