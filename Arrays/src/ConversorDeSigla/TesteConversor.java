package ConversorDeSigla;

import java.util.Scanner;

public class TesteConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Arrays de siglas e n44omes dos estados
        String[] siglas = {
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
                "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
                "RS", "RO", "RR", "SC", "SP", "SE", "TO"
        };

        String[] nomes = {
                "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
                "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
                "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
                "São Paulo", "Sergipe", "Tocantins"
        };
//        String siglaBusca = " ";
        int opcao = 0;
        int opc2 =0;


        do {
            System.out.println("===== Menu de opções =====\n");
            System.out.println("1 - Pesquisar nome do estado");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Digite a sigla do estado");
                String siglaBusca = sc.nextLine();
                ConversorDeSiglas.Busca(siglaBusca, siglas, nomes);
                System.out.println("\n");
                System.out.println("Deseja finalizar o progama ?\n");
                System.out.println("1 - Não");
                System.out.println("0 - Sim");

                opcao = sc.nextInt();
                if (opcao == 0){
                    System.out.println("Finalizando progama...");
                }

            }else {
                System.out.println("Finalizando progama...");
            }



        } while (opcao != 0);


    }
}
