package videolocadora;

/**
 * Locadora de DVDs
 */
public class Locadora {
    private int qtdDVDs;
    private float precoLocacao;

    /**
     * Contrutor
     */
    public Locadora() {
    }

    /**
     * Construtor com par&acirc;metros
     *
     * @param qtdDVDs      Quantidade de DVDs
     * @param precoLocacao Preço dos DVDs
     */
    public Locadora(int qtdDVDs, float precoLocacao) {
        this.setQtdDVDs(qtdDVDs);
        this.setPrecoLocacao(precoLocacao);
    }

    /**
     * Retorna quantidade de DVDs
     *
     * @return N&uacute;mero de DVDs| Exception
     */
    public int getQtdDVDs() {
        return qtdDVDs;
    }


    /**
     * Configura a quantidade de DVDs na Locadora
     *
     * @param qtdDVDs Quantidade de DVDs
     */
    public void setQtdDVDs(int qtdDVDs) {
        if (qtdDVDs > 0) {
            this.qtdDVDs = qtdDVDs;
        } else {
            throw new IllegalArgumentException("A quantidade de DVDs não deve ser negativa");
        }
    }

    /**
     * Retorna o pre&ccedil;o da loca&ccedil;&atilde;o de um DVD
     *
     * @return Pre&ccedil;o do DVD
     */
    public float getPrecoLocacao() {
        return precoLocacao;
    }


    /**
     * Configura o pre&ccedil;o da loca&ccedil;&atilde;o de um DVD
     *
     * @param precoLocacao Pre&ccedil;o do DVD
     */
    public void setPrecoLocacao(float precoLocacao) {
        if (precoLocacao > 0) {
            this.precoLocacao = precoLocacao;
        } else {
            throw new IllegalArgumentException("O valor da locação não deve ser negativa");
        }
    }
}
