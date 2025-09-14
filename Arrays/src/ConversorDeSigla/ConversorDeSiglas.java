package ConversorDeSigla;

public class ConversorDeSiglas {
    public static void Busca(String n, String[] siglas, String[] nomes) {
        boolean encontrou = false;
        for (int i = 0; i < siglas.length; i++) {
            if (siglas[i].equalsIgnoreCase(n)) {
                System.out.println("Estado: " + nomes[i]);
                System.out.println(" ");
                encontrou = true;
                break;
            }
        }
            if (!encontrou){
                System.out.println("Sigla invalida");
            }
    }
}
