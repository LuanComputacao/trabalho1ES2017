package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class VerificadoresTest {

    @Test
    void par(){
        assertEquals(true, Verificadores.par(2));
    }

    @Test
    void parNumeroImapar(){
        assertEquals(false, Verificadores.par(3));
    }

    @Test
    void parZero(){
        try {
            Verificadores.par(0);
            fail("Deve lançar uma exceção");
        } catch (RuntimeException ex){
            assertEquals("Número neutro", ex.getMessage());
        }
    }
}