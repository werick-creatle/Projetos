package ArrayComMenu;

import java.util.Random;
import java.util.Scanner;

public class Metodos {
    public static Random rd = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void preencherComNumrosAleatoriosAte100(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
    }

    public static void preencherComNumerosPredefinidos(int[] array, int n1, int n2) {
        for (int i = 1; i < array.length; i++) {
            array[i] = rd.nextInt(n2 - n1) + n1;
        }
    }

    public static void imprimirArrayDeUmaDimencao(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            //Verificação para tirar virgula do ultimo indice
            if (i < array.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }

    public static void preencherManualmente(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

    }

    public static void bubbleSort(int[] array) {
        int tamanho = array.length;
        boolean trocou;

        for (int i = 0; i < tamanho - 1; i++) {
            trocou = false;

            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int variavelParaTroca = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = variavelParaTroca;

                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
    }
}
