package calculadora;

public class Verificadores {

    public static boolean par(int numero) {
        if(numero == 0) throw new RuntimeException("Número neutro");
        return (numero % 2 == 0);
    }
}
