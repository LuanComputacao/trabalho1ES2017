package calculadora;

/**
 * Verificações matemáticas
 * @author LuanComputacao
 */
public class Verificadores {

    /**
     * Verifica se um n&uacute;mero &eacute; par
     * @param numero N&uacute;mero &agrave; ser verificado
     * @return True se o n&uacute;mero for p
     * ar
     */
    public static boolean par(int numero) {
        if(numero == 0) throw new RuntimeException("Número neutro");
        return (numero % 2 == 0);
    }
}
