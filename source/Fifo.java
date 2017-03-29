/**
* A FIFO (First-In First-Out) list "interface".
* @author odahcam
* @author anologicon
*/
public class Fifo {

    private int list_int[];
    private String list_string[];
    private int ending;
    private int beginning;
    private int length;

    public Fifo()
    {
        // this.length = args.length > 1 && args[0] != null ? args[0] : 20;
        this.length = 6;
        this.list_int = new int[this.length];
        this.list_string = new String[this.length];

        this.beginning = -1;
        this.ending = -1;
    }

    /**
    * Adds an employee to the list.
    * @method insert
    * @param {int} id : The employee ID number.
    * @param {String} name : The employee name.
    * @return {boolean} Returns true on success and false on failure.
    */
    public boolean insert(int id, String name)
    {
        int nextIndex = (this.ending + 1) % this.length;

        if (nextIndex != this.beginning) {

            this.ending = nextIndex;
            this.list_int[nextIndex] = id;
            this.list_string[nextIndex] = name;

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
    public boolean remove()
    {
        boolean output = false;

        if (this.beginning > -1) {

            if (this.beginning != this.ending) {
                this.beginning = (this.beginning + 1) % this.length;
            } else {
                output = this.destroy();
            }

            output = true;
        }

        return output;
    }

    /**
    * @return {boolean} Returns true on success.
    */
    public boolean destroy()
    {
        this.beginning = -1;
        this.ending = -1;

        return true;
    }

    /**
    * Show the list items.
    * @return {void} Returns nothing.
    */
    public void show()
    {
        if (this.beginning == -1) {
            System.out.println("Fila Vazia!\n");
        } else {

            System.out.println("\n╔══ Lista de funcionários [" + this.beginning + ", " + this.ending + "].");

            // define chave pré execução
            int i = this.beginning - 1;

            // executa
            do {

                // incrementa
                i = ++i % this.length;

                // exibe
                System.out.println("╠╦═ " + this.list_int[i]);
                System.out.println("║╚═ " + this.list_string[i]);

                // testa se é o último
            } while (i != this.ending);

            System.out.println("╚════");
        }

    }

    /**
    * Finds the emplyee index by it's ID.
    * @method getIndexByID
    * @return {String} Returns the ID and name of an employee.
    */
    public String getHEAD()
    {
        String head = "Ainda não há registros.";

        if (this.beginning != -1) {
            head = "#" + this.list_int[this.beginning] + " - " + this.list_string[this.beginning];
        }

        return head;
    }

    /**
    * Finds the emplyee index by it's ID.
    * @method getIndexByID
    * @param {int} id : the emplyee ID
    * @return {String} Returns the emplyee index.
    */
    public int getIndexByID(int id)
    {
        int index = -1;

        if (this.beginning != -1) {

            int i = this.beginning;

            do {

                ++i;

                if (this.list_int[i] == id) {
                    index = i;
                }

            } while (i != this.ending);

        }

        return index;
    }

    /**
    * Gets an employee name by it's index in the list.
    * @method getNameByID
    * @param {int} index : The employee index in list.
    * @return {String} Returns the emplyee name.
    */
    public String getNameByID(int id)
    {
        int index = this.getIndexByID(id);
        return index < 0 ? "" : this.list_string[index];
    }

    /**
    * Finds the emplyee position by it's ID.
    * @method getPositionByID
    * @param {int} id : the emplyee ID
    * @return {int} Returns the emplyee position.
    */
    public int getPositionByID(int id)
    {
        int index = this.getIndexByID(id);
        int position;

        if (index > -1) {
            position = index - this.beginning;
            position += position < 0 ? this.length : 1;
        } else {
            position = 0;
        }

        return position;
    }

    /**
    * @return {int} Returns the list items quantity.
    */
    public int count()
    {
         return this.ending < this.beginning
            ? this.length - this.beginning + this.ending + 1
            : this.ending - this.beginning;
    }
}
