package calculadora;

/**
 * Cálculos geométricos
 */
public class Geometria {

    /**
     * Calcula o perimetro de uma área retangular
     *
     * @param base
     * @param altura
     * @return
     */
    public static double calculaPerimetroRetangulo(double base, double altura) {
        if (base < 0) throw new RuntimeException("A base deve ser positiva.");
        if (altura < 0) throw new RuntimeException("A altura deve ser positiva.");
        return (2 * base) + (2 * altura);
    }

    /**
     * Calcuala a área de um retangolo
     *
     * @param base
     * @param altura
     * @return
     */
    public static double calculaAreaRetangulo(double base, double altura) {
        if (base < 0) throw new RuntimeException("A base deve ser positiva.");
        if (altura < 0) throw new RuntimeException("A altura deve ser positiva.");
        return Math.abs(base) * Math.abs(altura);
    }

    /**
     * Calcula a área de uma circunferência
     *
     * @param raio raio do circulo
     * @return
     */
    public static double calculaAreaCircunferencia(double raio) {
        if (raio < 0) throw new RuntimeException("O raio deve ser positivo");
        return Math.PI * Math.pow(raio, 2);
    }

    /**
     * Calcula a área de um triangulo
     *
     * @param base
     * @param altura
     * @return
     */
    public static double calculaAreaTriangulo(double base, double altura) {
        if (altura < 0) throw new RuntimeException("A altura deve ser positiva.");
        if (base < 0) throw new RuntimeException("A base deve ser positiva.");
        return (base * altura) / 2;
    }
}
