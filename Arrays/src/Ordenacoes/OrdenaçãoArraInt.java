package Ordenacoes;

import java.util.Arrays;

public class OrdenaçãoArraInt {
    public static void main(String[] args) {
        int[] array = {5, 4, 8, 6, 8, 1};

        System.out.println(Arrays.toString(array));
        ordenar(array);
        System.out.println(Arrays.toString(array));

    }


    public static void ordenar(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean troca = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int trocas = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = trocas;
                    troca = true;

                }
            }
            if (!troca) {
                break;
            }
        }
    }
}
