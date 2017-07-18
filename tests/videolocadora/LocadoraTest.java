package videolocadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocadoraTest {

    @Test
    void Construtor() {
        Locadora locadoraExpected = new Locadora();
        locadoraExpected.setQtdDVDs(100);
        locadoraExpected.setPrecoLocacao(10);

        Locadora locadora = new Locadora(100, 10);

        assertEquals(locadoraExpected.getQtdDVDs(), locadora.getQtdDVDs());
        assertEquals(locadoraExpected.getPrecoLocacao(), locadora.getPrecoLocacao());
    }

    @Test
    void Construtor_nao_deve_aceitar_qtdDVDs_negativa() {
        try {
            Locadora locadora = new Locadora(-100, 10);
        } catch (IllegalArgumentException ex) {
            assertEquals("A quantidade de DVDs não deve ser negativa", ex.getMessage());
        }
    }

    @Test
    void Construtor_nao_deve_aceitar_preco_de_locacao_negativa() {
        try {
            Locadora locadora = new Locadora(100, -10);
        } catch (IllegalArgumentException ex) {
            assertEquals("O valor da locação não deve ser negativa", ex.getMessage());
        }
    }
}
