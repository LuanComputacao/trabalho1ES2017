package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by luan on 02/07/17.
 */
class FisicaTest {
    @Test
    void velocidadeTest() {
        assertEquals(10, Fisica.velocidade(10, 60));
    }

    @Test
    void velocidadeNegativaTest() {
        assertEquals(-10, Fisica.velocidade(-10, 60));
    }

    @Test
    void velocidadeTeampoNegativoTest() {
        try {
            Fisica.velocidade(10, -60);
            fail("Deve lançar uma exceção");
        } catch (RuntimeException ex) {
            assertEquals("Tempo deve ser maior que 0(zero)", ex.getMessage());
        }
    }
}