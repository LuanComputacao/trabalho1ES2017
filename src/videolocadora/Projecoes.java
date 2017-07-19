package videolocadora;

/**
 * Classe para calcular as projeções de vendas de serviços
 */
public class Projecoes {

    private Locadora locadora = new Locadora();


    /**
     * Construtor
     *
     * @param locadora Objeto locadora
     */
    public Projecoes(Locadora locadora) {
        this.locadora = locadora;
    }

    /**
     * Calcula faturamento anual da locadora
     *
     * @return Faturamento anual por loca&ccedil;&otilde;es
     */
    public float faturamentoAnual() {
        return (12 * (float) (this.locadora.getQtdDVDs()) / 3) * this.locadora.getPrecoLocacao();
    }

    /**
     * Calcula faturamento anual da locadora
     *
     * @param codigoMoeda C&oacute;digo do formato da moeda  Real do Brasil: BRL
     * @return Faturamento anual por loca&ccedil;&otilde;es
     */
    public String faturamentoAnual(String codigoMoeda) {
        return this.valorMoeda(this.faturamentoAnual(), codigoMoeda);
    }

    /**
     * Faturamento anual proveniente de multas
     *
     * @return valor do faturamento
     */
    public float faturamentoPorMultas() {
        return (float) (this.faturamentoAnual() * 0.1);
    }

    /**
     * Faturamento anual proveniente de multas
     *
     * @param codigoMoeda C&oacute;digo do formato da moeda  Real do Brasil: BRL
     * @return valor do faturamento
     */
    public String faturamentoPorMultas(String codigoMoeda) {
        return this.valorMoeda(this.faturamentoPorMultas(), codigoMoeda);
    }

    /**
     * Formata em tipo moeda
     *
     * @param valor Valor para ser formatado
     * @param codigoMoeda C&oacute;digo da moeda do pa&iacute;s
     * @return Valor formatado em tipo de moeda
     */
    private String valorMoeda(float valor, String codigoMoeda) {
        String valorMoeda;
        String moeda;
        switch (codigoMoeda) {
            case "BRL":
                moeda = "R$";
                break;
            case "USD":
                moeda = "$";
                break;
            default:
                moeda = "_$";
        }
        valorMoeda = String.format("%s%.2f", moeda, valor);
        return valorMoeda;
    }
}
