import java.util.Scanner; // leitura em CLI (Command Line Interface)

/**
* @author odahcam
* @author anologicon
*/
public class UseFifo {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        Fifo list = new Fifo();
        int choice, id, position;
        String name;

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
                name = io.next();

                System.out.print("\n");

                if (list.push(id, name)) {
                    System.out.println("Funcionário inserido com sucesso!");
                } else {
                    System.out.println("Fifo cheia - Overflow.");
                }

                System.out.print("\n");

                break;

                // 2. Retirar
                case 2:

                if (list.pop() == false) {
                    System.out.println("Fifo vazia.");
                } else {
                    System.out.println("Funcionário removido.");
                }
                System.out.println("");

                break;

                // 3. Ver Lista
                case 3:
                System.out.println("Veja a lista: ");

                list.show();

                break;

                // 4. Onde Está
                case 4:
                System.out.print("Digite a matrícula do funcionário:");
                id = io.nextInt();
                System.out.println();

                position = list.getPositionByID(id);
                if (position > 0) {
                    System.out.println("Posição: " + list.getPositionByID(id) + "°\n");
                } else {
                    System.out.println("Funcionário não encontrado.\n");
                }

                break;

                // 5. Quem é
                case 5:
                System.out.print("Digite a matrícula do funcionário:");
                id = io.nextInt();
                name = list.getNameByID(id);

                if (name != "") {
                    System.out.println("Nome: " + list.getNameByID(id) + "\n");
                } else {
                    System.out.println("Funcionário não encontrado.\n");
                }

                break;

                // 6. Cabeça
                case 6:
                System.out.print("O cabeça da lista é: ");
                System.out.println(list.getHEAD() + "\n");

                break;

                // 7. Detonar
                case 7:
                list.destroy();
                break;

                // 8. Quantos
                case 8:
                System.out.println("A lista possui " + list.count() + " funcionários.\n");
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
