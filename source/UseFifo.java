import java.util.Scanner; // leitura em CLI (Command Line Interface)

public class UseFifo {

  public static void main(String[] args) {
    Scanner io = new Scanner(System.in);

    Fifo list = new Fifo();
    int choice;

    do {
      System.out.print("\n╔═══════════════════\n"
        + "║ Menu\n"
        + "╠ \t1. Inserir\n"
        + "╠ \t2. Retirar\n"
        + "╠ \t3. Ver lista\n"
        + "╠ \t4. Onde Está\n"
        + "╠ \t5. Quem é\n"
        + "╠ \t6. Cabeça\n"
        + "╠ \t7. Detonar\n"
        + "╠ \t8. Quantos\n"
        + "╠ \t9. Vazar\n"
        + "╚ Digite o número da ação desejada: ");

      choice = io.nextInt();

      System.out.print("\n\n");

      switch (choice) {
        // 1. Inserir
        case 1:
          System.out.print("Informe a matrícula: ");
          int id = io.nextInt();
          System.out.println();

          System.out.print("Informe o nome: ");
          String name = io.next();
          System.out.print("\n");

          if (list.insert(id, name)) {
            System.out.println("Funcionário inserido com sucesso!");
          } else {
            System.out.println("Fifo cheia - Overflow.");
          }

          break;
          
        // 2. Retirar
        case 2:

          if (list.remove() === false) {
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
          System.out.println("Digite a matrícula do funcionario:");
          id = io.nextInt();

          list.show_in(id);

          break;

        // 5. Quem é
        case 5:
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
