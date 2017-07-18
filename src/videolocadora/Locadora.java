package videolocadora;

public class Locadora {
    private int qtdDVDs;
    private float precoLocacao;

    public Locadora() {
    }

    public Locadora(int qtdDVDs, float precoLocacao) {
        this.setQtdDVDs(qtdDVDs);
        this.setPrecoLocacao(precoLocacao);
    }

    public int getQtdDVDs() {
        return qtdDVDs;
    }

    public void setQtdDVDs(int qtdDVDs) {
        if (qtdDVDs > 0) {
            this.qtdDVDs = qtdDVDs;
        } else {
            throw new IllegalArgumentException("A quantidade de DVDs não deve ser negativa");
        }
    }

    public float getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(float precoLocacao) {
        if (precoLocacao > 0) {
            this.precoLocacao = precoLocacao;
        } else {
            throw new IllegalArgumentException("O valor da locação não deve ser negativa");
        }
    }
}
