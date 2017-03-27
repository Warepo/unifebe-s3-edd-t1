import lister.Fifo;
import java.util.Scanner; // leitura em CLI (Command Line Interface)

public class UseFifo {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        Fifo list = new Fifo();
        int choice;

        do {
            System.out.print("Menu\n"
                + "\t1. Inserir\n"
                + "\t2. Retirar\n"
                + "\t3. Mostrar\n"
                + "\t4. Onde Está\n"
                + "\t5. Quem é\n"
                + "\t6. Cabeça\n"
                + "\t7. Detonar\n"
                + "\t8. Quantos\n"
                + "\t9. Vazar\n"
                + "Digite sua opção: ");

            choice = io.nextInt();

            System.out.print("\n\n");

            switch (choice) {
                case 1:

                    System.out.print("Informe a matrícula: ");

                    int id = io.nextInt();

                    System.out.println();

                    System.out.print("Informe o nome: ");

                    String name = io.next();

                    System.out.print("\n\n");

                    if (list.inserir(id, name)) {
                        System.out.println("Idade inserida com sucesso");
                    } else {
                        System.out.println("Fifo cheia - Overflow");
                    }

                    break;
                case 2:

                    if (list.retirar() == false) {
                        System.out.println("Fifo vazia.");
                    } else {
                        System.out.println("Retirado valor.");
                    }

                    break;
                case 3:
                    System.out.println("Veja a lista: ");
                    list.mostrar();
                    break;
                case 7:
                    list.detonar();
            }
        } while (choice != 9);
    }
}
