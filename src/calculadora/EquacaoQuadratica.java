package calculadora;

/**
 * Realiza cáuculos para equações quadráticas
 */
public class EquacaoQuadratica {


    /**
     * Calcula a raiz real de uma equação quadrática
     * 
     * @param a Constante do termo quadrático (ax²)
     * @param b Constante do termo de expoente unitário (ax)
     * @param c constante da equação
     * @return [raiz para raiz quadrada de delta negativo,
     *          raiz para raiz quadrada de delta positivo]
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