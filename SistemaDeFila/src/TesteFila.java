import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variaveis
        int proximaSenha = 1;
        int opcao = -1;

        JOptionPane.showMessageDialog(null,
                "Seja bem-vindo ao Sistema de Gerenciamento de Filas de Atendimento.\n\n" +
                        "Este sistema organiza o atendimento de pacientes, contemplando tanto casos normais quanto prioritários.\n" +
                        "Solicitamos que sejam inseridos apenas números inteiros.\n" +
                        "Clique em OK para prosseguir com a operação."

        );

        Fila<Paciente> fila = new Fila<>();

        System.out.println("--- SISTEMA DE CONTROLE DE FILA DE ATENDIMENTO ---");

        do {
            System.out.println("\n========= MENU DE OPÇÕES =========");
            System.out.println("1. Solicitar Senha (NORMAL)");
            System.out.println("2. Solicitar Senha (PRIORIDADE)");
            System.out.println("3. Listar todas as senhas na fila");
            System.out.println("4. Espiar (Ver próximo a ser chamado)");
            System.out.println("5. Chamar próximo paciente (remover)");
            System.out.println("0. Sair do sistema\n");

            System.out.print("Digite sua opção: ");


            try {

                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        Paciente normal = new Paciente(proximaSenha++, false);
                        fila.enfileirar(normal);
                        System.out.println(">> SENHA GERADA: " + normal);
                        break;

                    case 2:
                        Paciente prioritario = new Paciente(proximaSenha++, true);
                        fila.enfileirar(prioritario);
                        System.out.println(">> SENHA GERADA: " + prioritario);
                        break;

                    case 3:
                        if (fila.quantidadePacientes() == 0) {
                            System.out.println("Fila vazia");
                        } else {
                            System.out.println("================================================================================================================================================================================");
                            System.out.println(fila);
                            System.out.println("================================================================================================================================================================================");
                        }
                        break;

                    case 4:
                        Paciente proximo = fila.espiarProximoComRegra();
                        if (proximo != null) {
                            System.out.println(">> Próximo a ser chamado (sem remover): " + proximo);
                        } else {
                            System.out.println(">> A fila está vazia.");
                        }
                        break;

                    case 5:
                        Paciente chamado = fila.chamarProximo();
                        if (chamado != null) {
                            System.out.println(">> CHAMANDO AGORA: " + chamado);
                        } else {
                            System.out.println(">> A fila está vazia.");
                        }
                        break;

                    case 0:
                        //JOptionPane.showMessageDialog(null, "Finalizando...");
                        System.out.println("Finalizando...");
                        break;
                }
            } catch (InputMismatchException e) {

                System.out.println(">> [ERRO]: Por favor, digite apenas um número inteiro válido.");
                sc.nextLine();
            }
        } while (opcao != 0);
        sc.close();
    }
}
