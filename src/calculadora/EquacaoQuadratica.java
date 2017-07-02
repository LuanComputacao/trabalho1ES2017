package calculadora;

/**
 * Cálculos para equações quadráticas
 */
public class EquacaoQuadratica {


    /**
     * Calcula a raiz real de uma equação quadrática
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double[] calcula(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        double raizes[] = new double[2];
        if (delta < 0) {
            throw new RuntimeException("Raiz imaginária");
        } else {
            raizes[0] = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            raizes[1] = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            return raizes;
        }
    }

}