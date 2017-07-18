package videolocadora;

/**
 * Classe para calcular as projeções de vendas de serviços
 *
 * @author LuanComputacao
 */
public class Projecoes {

    private Locadora locadora = new Locadora();


    /**
     * Construtor
     *
     * @param locadora
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
     * @return Faturamento anual por loca&ccedil;&otilde;es
     */
    public String faturamentoAnual(String moeda) {
        return this.valorMoeda(this.faturamentoAnual(), moeda);
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
     * @return valor do faturamento
     */
    public String faturamentoPorMultas(String moeda) {
        return this.valorMoeda(this.faturamentoPorMultas(), moeda);
    }

    /**
     * Formata em tipo moeda
     *
     * @param valor Valor para ser formatado
     * @param codigo C&oacute;digo da moeda do pa&iacute;s
     * @return Valor formatado em tipo de moeda
     */
    private String valorMoeda(float valor, String codigo) {
        codigo = "BRL";
        String valorMoeda = "";
        String moeda;
        switch (codigo) {
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
