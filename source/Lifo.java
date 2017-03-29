/**
* A LIFO (Last-In First-Out) list "interface".
* @author odahcam
* @author anologicon
*/
public class Lifo {

    private int list_int[];
    private String list_string[];
    private int ending;
    private int beginning;
    private int length;

    public Lifo() {

        // this.length = args.length > 1 && args[0] != null ? args[0] : 20;
        this.length = 20;
        this.list_int = new int[this.length];
        this.list_string = new String[this.length];

        this.beginning = -1;
        this.ending = -1;

    }

    /**
    * @method remove
    * @return {boolean} Returns true on success and false on failure.
    */
    public boolean remove() {

        boolean output = false;

        if (this.beginning > -1) {

            if (this.beginning != this.ending) {
                // if Fifo
                // this.beginning = (this.beginning + 1) % this.length;
                // elseif Lifo
                --this.ending;
                // endif
            } else {
                output = this.destroy();
            }

            output = true;
        }

        return output;
    }

}
