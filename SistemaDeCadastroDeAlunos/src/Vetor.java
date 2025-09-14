
public class Vetor {
    private Plano[] planos;
    private int tamanho;

    public Vetor(int capacidade) {
        planos = new Plano[capacidade];
        tamanho = 0;
    }

    public boolean adicionar(Plano plano) {
        if (tamanho < planos.length) {
            planos[tamanho] = plano;
            tamanho++; // incrementa corretamente
            return true;
        } else {
            return false;
        }
    }

    public int buscar(String nomeAluno) {
        for (int i = 0; i < tamanho; i++) {
            if (planos[i].getNomeAluno().equalsIgnoreCase(nomeAluno)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(String nomeAluno) {
        int posicao = buscar(nomeAluno);
        if (posicao >= 0) {
            for (int i = posicao; i < tamanho - 1; i++) {
                planos[i] = planos[i + 1];
            }
            planos[tamanho - 1] = null;
            tamanho--;
            return true;
        }
        return false;
    }

    public Plano getPlano(int pos) {
        if (pos >= 0 && pos < tamanho) {
            return planos[pos];
        }
        return null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setPlanos(Plano[] planos) {
        this.planos = planos;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}