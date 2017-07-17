package videolocadora;

import java.util.Date;

/**
 * Classe para calcular as projeções de vendas de serviços
 * @author LuanComputacao
 */
public class Projecoes {

    private Locadora locadora = new Locadora();
    private Date data = new Date();

    /**
     * Construtor
     *
     * @param locadora
     *
     */
    public Projecoes(Locadora locadora) {
        this.locadora = locadora;
    }

    /**
     * Calcula faturamento anual da locadora
     *
     * @return Faturamento anual por loca&ccedil;&otilde;es
     */
    public float faturamentoAnual(){
        return (12 * (float)(this.locadora.getQtdDVDs()/3)) * this.locadora.getPrecoLocacao();
    }

    /**
     * Faturamento anual proveniente de multas
     *
     * @return valor do faturamento
     */
    public float faturamentoPorMultas(){
        return  (float) (this.faturamentoAnual() * 0.1);
    }
    
    /**
     * Formata em tipo moeda
     *
     * @param valor
     * @param codigo C&oacute;digo da moeda do pa&iacute;s
     * @return
     */
    public String valorMoeda(float valor, String codigo){
        codigo = "BRL";
        String valorMoeda = "";
        switch(codigo){
            case "BRL": valorMoeda = "R$" + String.valueOf(valor);
            break;
        }
        
        return valorMoeda;
    }
}
