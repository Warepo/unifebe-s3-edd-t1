import java.util.Scanner; // leitura em CLI (Command Line Interface)

/**
* @author odahcam
* @author anologicon
*/
public class UseFifo {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        Fifo list = new Fifo();
        int choice, id;

        do {
            System.out.println("╔═══════════════════");
            System.out.println("║ Menu");
            System.out.println("╠══ 1. Inserir");
            System.out.println("╠══ 2. Retirar");
            System.out.println("╠══ 3. Ver lista");
            System.out.println("╠══ 4. Onde Está");
            System.out.println("╠══ 5. Quem é");
            System.out.println("╠══ 6. Cabeça");
            System.out.println("╠══ 7. Detonar");
            System.out.println("╠══ 8. Quantos");
            System.out.println("╠══ 9. Vazar");
            System.out.print("╚═ Digite o número da ação desejada: ");

            choice = io.nextInt();

            System.out.print("\n\n");

            switch (choice) {
                // 1. Inserir
                case 1:
                System.out.print("Informe a matrícula: ");
                id = io.nextInt();

                System.out.print("Informe o nome: ");
                String name = io.next();

                System.out.print("\n");

                if (list.insert(id, name)) {
                    System.out.println("Funcionário inserido com sucesso!");
                } else {
                    System.out.println("Fifo cheia - Overflow.");
                }

                System.out.print("\n");

                break;

                // 2. Retirar
                case 2:

                if (list.remove() == false) {
                    System.out.println("Fifo vazia.");
                } else {
                    System.out.println("Funcionário removido.");
                }

                break;

                // 3. Ver Lista
                case 3:
                System.out.println("Veja a lista: ");

                list.show();

                break;

                // 4. Onde Está
                case 4:
                System.out.println("Digite a matrícula do funcionário:");
                id = io.nextInt();

                System.out.println(list.getPositionByID(id));

                break;

                // 5. Quem é
                case 5:
                System.out.println("Digite a matrícula do funcionário:");
                id = io.nextInt();
                System.out.println(list.getByID(id));

                break;

                // 6. Cabeça
                case 6:
                break;

                // 7. Detonar
                case 7:
                list.destroy();
                break;

                // 8. Quantos
                case 8:
                break;

                // 9. Vazar
                case 9:
                break;

                // Não entendido
                default:
                System.out.println("Não foi possível identificar sua escolha, por favor, escolha novamente:\n");
                break;
            }

        } while (choice != 9);

    }
}
