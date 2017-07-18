package videolocadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author LuanComputacao
 */
class ProjecoesTest {

    private Projecoes projecao;

    @BeforeEach
    void inicializa() {
        this.projecao = new Projecoes(new LocadoraBuilder().comDados(100, 10).build());
    }

    @Test
    void faturamentoAnual() {
        assertEquals(4000, projecao.faturamentoAnual());
    }

    @Test
    void faturamentoAnual_com_identificacao_de_moeda() {
        assertEquals("R$4000,00", projecao.faturamentoAnual("BRL"));
    }

    @Test
    void faturamentoPorMultas() {
        assertEquals(400, projecao.faturamentoPorMultas());
    }

    @Test
    void faturamentoPorMultas_com_identificacao_de_moeda_brl() {
        assertEquals("R$400,00", projecao.faturamentoPorMultas("BRL"));
    }

}
