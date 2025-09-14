package CriacaoDeArrays;
import java.util.Random;
public class ArrayDeQuatroDimensoes {
    public static void main(String[] args) {
        int[][][][] array = new int[5][3][4][7];
        preencher(array);
        imprimir(array);
    }

    public static void preencher(int[][][][] mat) {
        Random ran = new Random();
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat[a].length; b++) {
                for (int c = 0; c < mat[a][b].length; c++) {
                    for (int d = 0; d < mat[a][b][c].length; d++) {
                        mat[a][b][c][d] = ran.nextInt(100);
                    }
                }
            }
        }
    }
    public static void imprimir ( int[][][][] mat){
        for (int a = 0; a < mat.length; a++) {
            System.out.println("Array " + (a + 1) + ":");
            for (int b = 0; b < mat[a].length; b++) {
                for (int c = 0; c < mat[a][b].length; c++) {
                    for (int d = 0; d < mat[a][b][c].length; d++) {
                        System.out.printf("%02d ", mat[a][b][c][d]);
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
            }
        }
    }
}

