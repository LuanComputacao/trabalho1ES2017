package calculadora;

/**
 * C&aacute;lculos geom&eacute;tricos
 */
public class Geometria {

    /**
     * Calcula o perimetro de uma &aacute;rea ret&acirc;ngulo
     *
     * @param base Base do ret&acirc;ngulo
     * @param altura Altura do ret&acirc;ngulo
     * @return perimetro
     */
    public static double calculaPerimetroRetangulo(double base, double altura) {
        if (base < 0) throw new RuntimeException("A base deve ser positiva.");
        if (altura < 0) throw new RuntimeException("A altura deve ser positiva.");
        return (2 * base) + (2 * altura);
    }

    /**
     * Calcuala a &aacute;rea de um ret&acirc;ngulo
     *
     * @param base Base do ret&acirc;ngulo
     * @param altura Altura do ret&acirc;ngulo
     * @return &Aacute;rea do ret&acirc;ngulo
     */
    public static double calculaAreaRetangulo(double base, double altura) {
        if (base < 0) throw new RuntimeException("A base deve ser positiva.");
        if (altura < 0) throw new RuntimeException("A altura deve ser positiva.");
        return Math.abs(base) * Math.abs(altura);
    }

    /**
     * Calcula a &aacute;rea de uma circunfer&ecirc;ncia
     *
     * @param raio Raio do circulo
     * @return &Aacute;rea da circunfer&ecirc;ncia
     */
    public static double calculaAreaCircunferencia(double raio) {
        if (raio < 0) throw new RuntimeException("O raio deve ser positivo");
        return Math.PI * Math.pow(raio, 2);
    }

    /**
     * Calcula a &aacute;rea de um triangulo
     *
     * @param base Base do ret&acirc;ngulo
     * @param altura Altura, entre base e extremo oposto, do tri&acirc;ngulo
     * @return
     */
    public static double calculaAreaTriangulo(double base, double altura) {
        if (altura < 0) throw new RuntimeException("A altura deve ser positiva.");
        if (base < 0) throw new RuntimeException("A base deve ser positiva.");
        return (base * altura) / 2;
    }
}
