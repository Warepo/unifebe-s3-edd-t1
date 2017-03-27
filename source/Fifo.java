public class Fifo {
    // First-In First-Out

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

    public boolean insert(int num, String name) {

        int aux = (this.end + 1) % this.length;

        if (aux != this.begin) {

            this.end = aux;
            this.lista_int[aux] = num;
            this.lista_string[aux] = name;

            if (this.begin < 0) {
                this.begin = 0;
            }

            return true;
        }

        return false;
    }

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

    public void show() {

        if (this.begin == -1) {
            System.out.println("Fila Vazia!");
            return;
        }

        int aux = -1;

        do {

            ++aux;

            System.out.println("\n ID = " + this.lista_int[aux]);
            System.out.println("\n NOME = " + this.lista_string[aux]);
            System.out.println("\n\n --------------------------------" );

        } while (aux < this.end);
    }
    public void show_in(int num) {
        int aux, nr;

        if (this.begin == -1) {
            System.out.println("\nFila Vazia");
            return;
        }

        aux = this.begin;

        do{
          aux++;

          if(this.lista_int[aux] == num){
            System.out.println(" Nome: "+this.lista_string[aux]);
          }

        }while (aux < this.end);
    }
}
