package videolocadora;

public class Locadora {
    private int qtdDVDs;
    private float precoLocacao;

    public Locadora() { }

    public Locadora(int qtdDVDs, float precoLocacao) {
        this.qtdDVDs = qtdDVDs;
        this.precoLocacao = precoLocacao;
    }

    public int getQtdDVDs() {
        return qtdDVDs;
    }

    public void setQtdDVDs(int qtdDVDs) {
        this.qtdDVDs = qtdDVDs;
    }

    public float getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(float precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
}
