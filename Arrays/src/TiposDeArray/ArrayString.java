package TiposDeArray;

public class ArrayString {
    public static void main(String[] args) {
        String[] PrimeiroNome = new String[10];

        // Preenchendo o array com 10 nomes
        PrimeiroNome[0] = "Ana";
        PrimeiroNome[1] = "Bruno";
        PrimeiroNome[2] = "Carlos";
        PrimeiroNome[3] = "Daniela";
        PrimeiroNome[4] = "Eduardo";
        PrimeiroNome[5] = "Fernanda";
        PrimeiroNome[6] = "Gustavo";
        PrimeiroNome[7] = "Helena";
        PrimeiroNome[8] = "Igor";
        PrimeiroNome[9] = "Juliana";

        // Imprimindo os nomes
        System.out.println("Nomes cadastrados:");
        for (int i = 0; i < PrimeiroNome.length; i++) {
            System.out.println((i + 1) + ". " + PrimeiroNome[i]);
        }
    }
}
