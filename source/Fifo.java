public class Fifo {

    private int fila[];
    private int end;
    private int begin;
    private int length;

    Fifo(String[] agrs) {

        this.length = agrs.length > 1 && agrs[0] != null ? args[0] : 20;
        this.fila = new int[this.length];

        this.end = -1;
        this.begin = -1;

    }

    public boolean inserir(int num) {

        int aux = (this.end + 1) % this.length;

        if (aux != this.begin) {

            this.end = aux;
            this.fila[aux] = num;

            if (this.begin < 0) {
                this.begin = 0;
            }

            return true;
        }

        return false;
    }

    public int retirar() {

        int volta = -999;

        if (this.begin >= 0) {

            volta = this.fila[this.begin];

            if (this.begin == this.end) {
                this.begin = -1;
                this.end = -1;
            } else {
                this.begin = (this.begin + 1) % this.length;
            }
        }

        return volta;
    }

    public void detonar() {
        this.begin = -1;
        this.end = -1;
    }

    public void mostrar() {
        int aux;

        if (this.begin == -1) {
            System.out.println("\nFila Vazia");
            return;
        }

        System.out.print("\nVeja a Fila");

        aux = this.begin;

        System.out.print(" " + this.fila[aux]);
        
        while (aux != this.end) {
            aux = (aux + 1) % this.length;
            System.out.print(" " + this.fila[aux]);
        }
    }
}
