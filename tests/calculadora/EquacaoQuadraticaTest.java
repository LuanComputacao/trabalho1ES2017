package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by luan on 01/07/17.
 */
class EquacaoQuadraticaTest {

    @Test
    void calcula1() {
        double raizes[] = EquacaoQuadratica.calcula(1, 0, -9);
        assertEquals(3, raizes[0]);
        assertEquals(-3, raizes[1]);
    }

    @Test
    void calcula2() {
        double raizes[] = EquacaoQuadratica.calcula(1, -9, 0);
        assertEquals(9, raizes[0]);
        assertEquals(0, raizes[1]);
    }

    @Test
    void calcula3() {
        double raizes[] = EquacaoQuadratica.calcula(3, -7, 2);
        assertEquals(2, raizes[0]);
        assertEquals(0.333, raizes[1], 0.001);
    }

    @Test
    void calcula4() {
        double raizes[] = EquacaoQuadratica.calcula(-1, 4, -4);
        assertEquals(2, raizes[0]);
        assertEquals(2, raizes[1]);
    }

    @Test
    void calcula5() {
        double raizes[] = EquacaoQuadratica.calcula(3, -1, -2);
        assertEquals(3, raizes[0]);
        assertEquals(2, raizes[1]);
    }
}