package Arrays;
import java.util.Random;

public class ArrayDeUmaDimencao {
    public static void main(String[] args) {
        //criando array
        int[] array = new int[50];
        preenche(array);
        imprimir(array);
    }

    public static void preenche(int[] array) {
        Random ram = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ram.nextInt(100);

        }

    }
    public static void imprimir(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}