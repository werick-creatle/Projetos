
public class Fila<T> {
    private Object[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;
    private int prioritariosAtendidosCount = 0; // Contador para a regra 3:1

    public Fila(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    public Fila() {
        this(10);
    }

    //Metodos
    public void enfileirar(T elemento) {
        Paciente novoPaciente = (Paciente) elemento;
        if (novoPaciente.isPrioritario()) {
            int pos = encontraPosicaoPrioritario();
            adicionaNaPosicao(pos, elemento);
        } else {
            if (this.tamanho == this.elementos.length) {
                throw new RuntimeException("Fila cheia!");
            }
            this.elementos[this.fim] = elemento;
            this.fim = (this.fim + 1) % this.elementos.length;
            this.tamanho++;
        }
    }

    public int quantidadePacientes() {
        return this.tamanho;
    }

    private void adicionaNaPosicao(int posicao, T elemento) {
        if (this.tamanho == this.elementos.length) {
            throw new RuntimeException("Fila cheia!");
        }
        for (int i = this.tamanho; i > posicao; i--) {
            int indiceAnterior = (this.inicio + i - 1) % this.elementos.length;
            int indiceAtual = (this.inicio + i) % this.elementos.length;
            this.elementos[indiceAtual] = this.elementos[indiceAnterior];
        }
        int indiceInsercao = (this.inicio + posicao) % this.elementos.length;
        this.elementos[indiceInsercao] = elemento;
        this.tamanho++;
        this.fim = (this.fim + 1) % this.elementos.length;
    }

    private int encontraPosicaoPrioritario() {
        int contadorPrioritarios = 0;
        for (int i = 0; i < this.tamanho; i++) {
            int indiceReal = (this.inicio + i) % this.elementos.length;
            Paciente p = (Paciente) this.elementos[indiceReal];
            if (p != null && p.isPrioritario()) {
                contadorPrioritarios++;
            } else {
                break;
            }
        }
        return contadorPrioritarios;
    }

    public T desenfileirar() {
        if (this.tamanho == 0) return null;
        T elementoRemovido = (T) this.elementos[this.inicio];
        this.elementos[this.inicio] = null;
        this.inicio = (this.inicio + 1) % this.elementos.length;
        this.tamanho--;
        return elementoRemovido;
    }

    public Paciente chamarProximo() {
        if (this.tamanho == 0) return null;

        if (this.prioritariosAtendidosCount >= 3) {
            Paciente pacienteNormal = buscaEChamaNormal();
            if (pacienteNormal != null) {
                this.prioritariosAtendidosCount = 0;
                return pacienteNormal;
            }
        }

        Paciente proximo = (Paciente) this.espiar();
        if (proximo.isPrioritario()) {
            this.prioritariosAtendidosCount++;
            return (Paciente) this.desenfileirar();
        } else {
            this.prioritariosAtendidosCount = 0;
            return (Paciente) this.desenfileirar();
        }
    }

    private Paciente buscaEChamaNormal() {
        for (int i = 0; i < this.tamanho; i++) {
            int indiceReal = (this.inicio + i) % this.elementos.length;
            Paciente p = (Paciente) this.elementos[indiceReal];
            if (p != null && !p.isPrioritario()) {
                return removeDaPosicao(i);
            }
        }
        return null;
    }

    private Paciente removeDaPosicao(int posicaoLogica) {
        int indiceRealRemover = (this.inicio + posicaoLogica) % this.elementos.length;
        Paciente pacienteRemovido = (Paciente) this.elementos[indiceRealRemover];

        for (int i = posicaoLogica; i < this.tamanho - 1; i++) {
            int indiceAtual = (this.inicio + i) % this.elementos.length;
            int proximoIndice = (this.inicio + i + 1) % this.elementos.length;
            this.elementos[indiceAtual] = this.elementos[proximoIndice];
        }

        this.tamanho--;
        this.fim = (this.fim - 1 + this.elementos.length) % this.elementos.length;
        this.elementos[this.fim] = null;

        return pacienteRemovido;
    }

    public T espiar() {
        if (this.tamanho == 0) return null;
        return (T) this.elementos[this.inicio];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            int indiceReal = (this.inicio + i) % this.elementos.length;
            s.append(this.elementos[indiceReal]);
            if (i < this.tamanho - 1) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }

    public Paciente espiarProximoComRegra() {
        if (this.tamanho == 0) return null;

        // Se o contador já atingiu 3, o próximo seria um normal
        if (this.prioritariosAtendidosCount >= 3) {
            // Procura o primeiro normal na fila
            for (int i = 0; i < this.tamanho; i++) {
                int indiceReal = (this.inicio + i) % this.elementos.length;
                Paciente p = (Paciente) this.elementos[indiceReal];
                if (p != null && !p.isPrioritario()) {
                    return p; // Retorna o primeiro normal que encontrar
                }
            }
        }

        // Se a regra não se aplica ou se não encontrou um normal, o próximo é o primeiro da fila
        return (Paciente) this.espiar();
    }
}
