package videolocadora;

/**
 * Contrutor de Locadoras
 */
public class LocadoraBuilder {
    private Locadora locadora = new Locadora();

    /**
     * Constroi uma locadora
     */
    public LocadoraBuilder() {
        this.locadora = new Locadora();
    }


    /**
     * Constroi uma locadora com dados
     *
     * @param qtdDVD       Quantidade de DVDs
     * @param precoLocacao Preço da locação de um DVD
     * @return LocadoraBuilder
     */
    public LocadoraBuilder comDados(int qtdDVD, float precoLocacao) {
        locadora.setQtdDVDs(qtdDVD);
        locadora.setPrecoLocacao(precoLocacao);
        return this;
    }

    /**
     * Retorna a instância de locadora criada
     *
     * @return Locadora
     */
    public Locadora build() {
        return locadora;
    }
}
