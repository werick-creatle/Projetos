package Arrays;
import java.util.Random;

public class ArrayComTresDimensoes {
    public static void main(String[] args) {
        // Array tridimensional
        int[][][] array = new int[4][3][2]; // 4 "camadas", 3 linhas, 2 colunas
        preencher(array);
        imprimir(array);
    }

    public static void preencher(int[][][] array) {
        Random rm = new Random();
        for (int x = 0; x < array.length; x++) {           // percorre as camadas
            for (int y = 0; y < array[x].length; y++) {    // percorre as linhas
                for (int z = 0; z < array[x][y].length; z++) { // percorre as colunas
                    array[x][y][z] = rm.nextInt(100);
                }
            }
        }
    }

    public static void imprimir(int[][][] array) {
        for (int x = 0; x < array.length; x++) {
            System.out.println("Camada " + x + ":");
            for (int y = 0; y < array[x].length; y++) {
                for (int z = 0; z < array[x][y].length; z++) {
                    System.out.print(array[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println(); // linha extra entre camadas
        }
    }
}
