package CriacaoDeArrays;

import java.util.Random;

public class ArrayDeDuasDimensoes {
    public static void main(String[] args) {
        //Array bidimencional
        int[][] array = new int[5][3];
        preencher(array);
        imprimir(array);
    }

    public static void preencher(int[][] array) {
        Random rm = new Random();
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = rm.nextInt(100);
            }
        }
    }

    public static void imprimir(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(array[x][y] + " ");

            }
            System.out.println();
        }
    }
}
