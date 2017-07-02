package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Testes para a classe Geometria
 */
class GeometriaTest {
    @Test
    void calculaAreaRetangulo() {
        assertEquals(4, Geometria.calculaAreaRetangulo(2, 2));
    }

    @Test
    void calculaAreaRetanguloComCasasDecimais() {
        assertEquals(6.25, Geometria.calculaAreaRetangulo(2.5, 2.5));
    }

    @Test
    void calculaAreaRetanguloNumerosNegativos() {
        try {
            Geometria.calculaAreaRetangulo(-2, 2);
            fail("Deveria ter lançado a exceção.");
        } catch (RuntimeException ex) {
            assertEquals("Um dos lados negativo.", ex.getMessage());
        }
    }


    @Test
    void calculaAreaCircunferencia() {
        assertEquals(12.56, Geometria.calculaAreaCircunferencia(2), 0.01);
    }

    @Test
    void calculaAreaCircunferenciaComCasasDecimais() {
        assertEquals(19.63, Geometria.calculaAreaCircunferencia(2.5), 0.01);
    }

    @Test
    void calculaAreaCircunferenciaComRaioNegativo() {
        try {
            Geometria.calculaAreaCircunferencia(-2);
            fail("Deveria ter lançado a exceção");
        } catch (RuntimeException ex) {
            assertEquals("O raio deve ser positivo", ex.getMessage());
        }
    }

    @Test
    void calculaAreaTriangulo() {
        assertEquals(2, Geometria.calculaAreaTriangulo(2, 2));
    }

    @Test
    void calculaAreaTrianguloComCasasDecimais() {
        assertEquals(3.125, Geometria.calculaAreaTriangulo(2.5, 2.5));
    }

    @Test
    void calculaAreaTrianguloComBaseNegativa() {
        try{
            Geometria.calculaAreaTriangulo(-2, 2);
            fail("Deveria ter lançado a exceção");
        } catch (RuntimeException ex){
            assertEquals("A base deve ser positiva.", ex.getMessage());
        }
    }

    @Test
    void calculaAreaTrianguloComAlturaNegativa() {
        try{
            Geometria.calculaAreaTriangulo(2, -2);
            fail("Deveria ter lançado a exceção");
        } catch (RuntimeException ex){
            assertEquals("A altura deve ser positiva.", ex.getMessage());
        }
    }
}