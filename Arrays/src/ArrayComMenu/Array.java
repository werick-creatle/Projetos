package ArrayComMenu;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);
    public static Random rd = new Random();

    public static void main(String[] args) {
        System.out.print("Ola digite o tamanho do array:");
        int tamanho = sc.nextInt();

        int[] array = new int[tamanho];


        System.out.println("Escolha uma das opções");
        System.out.println("1- preencher com números da sua escolha");
        System.out.println("2- preencher com números aleatórios ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            Metodos.preencherManualmente(array);
            System.out.println("\n====Array====");
            Metodos.imprimirArrayDeUmaDimencao(array);
            System.out.println(" ");
            System.out.println("Quer ordenar esse array ? ");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            int opc3 = sc.nextInt();
            if (opc3 == 1) {
                Metodos.bubbleSort(array);
                Metodos.imprimirArrayDeUmaDimencao(array);
            }
        } else if (opcao == 2) {
            System.out.println("Escolha uma das opções");
            System.out.println("1- Adicionar filtro para números");
            System.out.println("2- Não adicionar filtro");
            int opcao1 = sc.nextInt();

            if (opcao1 == 1) {
                System.out.print("Digite o menor número que podemos usar para preencher o array:");
                int menorN = sc.nextInt();
                System.out.print("Digite o maior número:");
                int maiorN = sc.nextInt();
                Metodos.preencherComNumerosPredefinidos(array, menorN, maiorN);
                Metodos.imprimirArrayDeUmaDimencao(array);
                System.out.println(" ");
                System.out.println("Quer ordenar esse array ? ");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                int opc3 = sc.nextInt();
                if (opc3 == 1) {
                    Metodos.bubbleSort(array);
                    Metodos.imprimirArrayDeUmaDimencao(array);
                }


            } else if (opcao1 == 2) {
                Metodos.preencherComNumrosAleatoriosAte100(array);
                System.out.println("\n====Array====");
                Metodos.imprimirArrayDeUmaDimencao(array);
                System.out.println(" ");
                System.out.println("Quer ordenar esse array ? ");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                int opc3 = sc.nextInt();
                if (opc3 == 1) {
                    Metodos.bubbleSort(array);
                    Metodos.imprimirArrayDeUmaDimencao(array);
                }
            } else {
                System.out.println("[ERRO] Opção invalida");
            }
        } else {
            System.out.println("[ERRO] Opção invalida");

        }
        System.out.println(" ");
        System.out.println("Programa finalizando...");

    }


}
