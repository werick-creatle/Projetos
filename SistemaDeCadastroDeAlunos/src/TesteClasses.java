
import javax.swing.JOptionPane;

public class TesteClasses {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(100); // criei um vetor com paracidade de 100 cadastros acho q já é o bastante para esse porjeto
        int opcao;

        do {
            JOptionPane.showMessageDialog(
                    null,
                    " Bem-vindo ao Sistema de Cadastro de Planos da Academia!\n\n" +
                            " Este sistema foi desenvolvido para auxiliar personal trainers no\n" +
                            " gerenciamento dos planos de seus alunos.\n\n" +
                            " Agora é só escolher uma das opções no menu principal e começar!"
            );


            String menu = "===== MENU ACADEMIA =====\n\n" +
                    "1 - Cadastrar Plano\n" +
                    "2 - Pesquisar Plano\n" +
                    "3 - Alterar Plano\n" +
                    "4 - Excluir Plano\n" +
                    "5 - Listar Planos\n" +
                    "0 - Sair\n\n" +
                    "Escolha uma opção:";

            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break; // se cancelar, sai sem cadatrar ninguem
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1: // Cadastrar os usuarios
                    String nome = JOptionPane.showInputDialog("Nome do Aluno:");
                    String tipo = JOptionPane.showInputDialog("Tipo de Plano (Mensal/Trimestral/Semestral/Anual):");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Plano:"));
                    String situacao = JOptionPane.showInputDialog("Situação (Ativo/Inativo):");

                    Plano novo = new Plano(nome, tipo, valor, situacao);
                    if (vetor.adicionar(novo)) {
                        JOptionPane.showMessageDialog(null, "Plano cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: limite de planos atingido!");
                    }
                    break;

                case 2: // Pesquisar planos
                    String busca = JOptionPane.showInputDialog("Digite o nome do aluno:");
                    int pos = vetor.buscar(busca);
                    //Verificação para saber se tem algum plano cadastrado
                    if (pos >= 0) {
                        JOptionPane.showMessageDialog(null, "Encontrado: \n" + vetor.getPlano(pos));
                        //Se n tiver nenhum aluno cadastrado exibe isso
                    } else {
                        JOptionPane.showMessageDialog(null, "Plano não encontrado.");
                    }
                    break;

                case 3: // Alterar o plano do usuario
                    String alt = JOptionPane.showInputDialog("Nome do aluno para alterar o plano:");
                    int posAlt = vetor.buscar(alt);
                    if (posAlt >= 0) {
                        Plano planoAlt = vetor.getPlano(posAlt);
                        planoAlt.setTipoPlano(JOptionPane.showInputDialog("Novo tipo de plano:", planoAlt.getTipoPlano()));
                        planoAlt.setValor(Double.parseDouble(JOptionPane.showInputDialog("Novo valor:", planoAlt.getValor())));
                        planoAlt.setSituacao(JOptionPane.showInputDialog("Nova situação (Ativo/Inativo):", planoAlt.getSituacao()));
                        JOptionPane.showMessageDialog(null, "Plano alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Plano não encontrado.");
                    }
                    break;

                case 4: // Excluir plano
                    String exc = JOptionPane.showInputDialog("Nome do aluno para excluir:");
                    if (vetor.remover(exc)) {
                        JOptionPane.showMessageDialog(null, "Plano excluído com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Plano não encontrado.");
                    }
                    break;

                case 5: // Listar os planos
                    if (vetor.getTamanho() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum plano cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder("Planos cadastrados:\n\n");
                        for (int i = 0; i < vetor.getTamanho(); i++) {
                            lista.append(vetor.getPlano(i)).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(
                            null,
                            "Obrigado por usar meu programa! 👍\n" +
                                    "Espero que tenha cumprido todos os requisitos solicitados.\n" +
                                    "Finalizando ..."
                    );

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}
