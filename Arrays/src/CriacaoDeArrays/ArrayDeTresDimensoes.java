package CriacaoDeArrays;

import java.util.Random;

public class ArrayDeTresDimensoes {
    public static void main(String[] args) {
        int[][][] array = new int[5][3][4]; // 3 dimensões
        preencher(array);
        imprimir(array);
    }

    public static void preencher(int[][][] mat) {
        Random ran = new Random();
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat[a].length; b++) {
                for (int c = 0; c < mat[a][b].length; c++) {
                    mat[a][b][c] = ran.nextInt(100); // valores de 0 a 99
                }
            }
        }
    }

    public static void imprimir(int[][][] mat) {
        for (int a = 0; a < mat.length; a++) {
            System.out.println("Array " + (a + 1) + ":");
            for (int b = 0; b < mat[a].length; b++) {
                for (int c = 0; c < mat[a][b].length; c++) {
                    System.out.printf("%02d ", mat[a][b][c]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
