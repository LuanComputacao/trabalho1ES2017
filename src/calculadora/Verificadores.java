package calculadora;

/**
 * Verificações matemáticas
 * @author LuanComputacao
 */
public class Verificadores {

    /**
     * Verifica se um número é par
     * @param numero Número à ser verificado
     * @return 
     */
    public static boolean par(int numero) {
        if(numero == 0) throw new RuntimeException("Número neutro");
        return (numero % 2 == 0);
    }
}
