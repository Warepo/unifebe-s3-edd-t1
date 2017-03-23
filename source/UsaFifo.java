package t1;

import javax.swing.JOptionPane;

public class UsaFifo {

    public static void main(String[] args) {
        String input;
        int aux, choice;
        Fifo list = new Fifo();

        do {
            input = JOptionPane.showInputDialog("Menu\n"
                    + "\t1. Inserir\n"
                    + "\t2. Retirar\n"
                    + "\t3. Mostrar\n"
                    + "\t4. Destuir\n"
                    + "\t5. Vazar\n"
                    + "Digite sua opção: ");

            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:

                    input = JOptionPane.showInputDialog("\n\nInforme a idade: ");
                    aux = Integer.parseInt(input);

                    if (list.inserir(aux)) {
                        System.out.println("\nIdade inserida com sucesso");
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
                case 4:
                    list.detonar();
            }
        } while (choice != 5);
    }
}
