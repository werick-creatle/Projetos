public class Paciente {
    private int numeroSenha;
    private boolean prioritario;

    public Paciente(int numeroSenha, boolean prioritario) {
        this.numeroSenha = numeroSenha;
        this.prioritario = prioritario;
    }

    public int getNumeroSenha() {
        return numeroSenha;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    @Override
    public String toString() {
        if (prioritario) {
            return "Senha" + numeroSenha + " -PRIORIDADE";
        }
        return "Senha "+numeroSenha + "-NORMAL";
    }
}