import t1.Fifo;

import java.util.Scanner;

public class UsaFifo {

    public static void main(String[] args) {
        String name;
        int aux, choice, age;
        Fifo list = new Fifo();
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Menu\n"
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

            choice = read.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("\n\nInforme número do colaborador: ");
                    aux = read.nextInt();
                    System.out.println("\n\nInforme o nome do colaborador");
                    name = read.nextLine();

                    if (list.inserir(aux,name)) {
                        System.out.println("\nDados do colaborador "+name+" foram inseridos com sucesso");
                    } else {
                        System.out.println("\nFifo cheia - Overflow");
                    }

                    break;
                case 2:
                    aux = list.retirar();

                    if (aux == -999) {
                        System.out.println("\nFifo vazia");
                    } else {
                        System.out.println("nRetirada idade " + aux);
                    }

                    break;
                case 3:
                    System.out.println("\n Veja a list: ");
                    list.mostrar();
                    break;
                case 7:
                    list.detonar();
            }
        } while (choice != 9);
    }
}
