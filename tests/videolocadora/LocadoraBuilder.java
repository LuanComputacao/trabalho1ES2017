package videolocadora;

/**
 *
 */
public class LocadoraBuilder {
    Locadora locadora = new Locadora();

    public LocadoraBuilder() {
        this.locadora = new Locadora();
    }

    public LocadoraBuilder comDados(int qtdDVD, float precoLocacao) {
        locadora.setQtdDVDs(qtdDVD);
        locadora.setPrecoLocacao(precoLocacao);
        return this;
    }

    public Locadora build() {
        return locadora;
    }
}
