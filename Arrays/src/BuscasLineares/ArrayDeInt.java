package BuscasLineares;

import java.util.Scanner;

public class ArrayDeInt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Digite o número a ser procurado: ");
        Scanner sc = new Scanner(System.in);
        int numeroBuscado = sc.nextInt();

        buscarNumero(array, numeroBuscado);
    }

    public static void buscarNumero(int[] array, int numeroBuscado) {
        //variavel para esibir apenas a mensagem quenado acabar a busca
        boolean encontrou = false;
        for (int i = 0; i < array.length; i++) {
            // variavel para receber número do indice a cada repetiçao
            int elemento = array[i];
            if (elemento == numeroBuscado) {
                System.out.println("Valor encontrado no indice: " + i);
                encontrou = true;
                //finalizando o loop quando encontrar o valor
                break;
            }

        }
        if (!encontrou) {
            System.out.println("o Array não tem esse valor digitado");
        }
    }
}
