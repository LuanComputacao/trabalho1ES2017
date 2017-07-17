package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * 
 */
class FisicaTest {
    @Test
    void velocidadeMedia() {
        assertEquals(10, Fisica.velocidadeMedia(10, 60));
    }

    @Test
    void velocidadeMedia_calcula_movimento_retrogrado() {
        assertEquals(-10, Fisica.velocidadeMedia(-10, 60));
    }

    @Test
    void velocidadeTeamp_nao_aceita_tempo_negativo() {
        try {
            Fisica.velocidadeMedia(10, -60);
            fail("Deve lançar uma exceção");
        } catch (RuntimeException ex) {
            assertEquals("Tempo deve ser maior que 0(zero)", ex.getMessage());
        }
    }
}