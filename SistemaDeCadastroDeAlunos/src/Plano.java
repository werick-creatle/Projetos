public class Plano {
    private String nomeAluno;
    private String tipoPlano;
    private double valor;
    private String situacao;

    public Plano(String nomeAluno, String tipoPlano, double valor, String situacao) {
        this.nomeAluno = nomeAluno;
        this.tipoPlano = tipoPlano;
        this.valor = valor;
        this.situacao = situacao;
    }

    // Getters e Setters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno: " + nomeAluno +
                " | Plano: " + tipoPlano +
                " | Valor: R$" + valor +
                " | Situação: " + situacao;
    }
}
