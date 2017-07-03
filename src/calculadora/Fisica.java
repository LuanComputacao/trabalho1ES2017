package calculadora;

/**
 * Created by luan on 02/07/17.
 */
public class Fisica {
    /**
     * @param distancia em Km
     * @param tempo     em minutos
     * @return velocidade em Km/h
     */
    public static double velocidade(double distancia, double tempo) {
        if (tempo <= 0) throw new RuntimeException("Tempo deve ser maior que 0(zero)");
        return (distancia) / (tempo / 60);
    }
}
