package calculadora;

/**
 * Realiza cálculos de Física Cinética
 */
public class Fisica {
    /**
     * Calcula a velocidade média
     * 
     * @param distancia em Km
     * @param tempo     em minutos
     * @return velocidade em Km/h
     */
    public static double velocidadeMedia(double distancia, double tempo) {
        if (tempo <= 0) throw new RuntimeException("Tempo deve ser maior que 0(zero)");
        return (distancia) / (tempo / 60);
    }
}
