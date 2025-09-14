package BuscasLineares;
import java.util.Scanner;

public class ArrayDeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        String[] estados = {"AC","BA","CE","DF","AM","AP","PB","RN","MS","SP"};

        do {
            System.out.println("===== Menu ====\n");
            System.out.println("1 - Pesquisar estado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            switch (opcao){
                case 1:
                    System.out.print("Digite a sigla do estado que deseja buscar: ");
                    String sigla = sc.nextLine();
                    buscaEstado(estados, sigla);
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void buscaEstado(String[] estados, String siglaBuscar) {
        boolean encontrou = false;

        for (String estado : estados) {
            if (estado.equalsIgnoreCase(siglaBuscar)) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("Estado encontrado!");
        } else {
            System.out.println("Estado não encontrado!");
        }
    }
}
