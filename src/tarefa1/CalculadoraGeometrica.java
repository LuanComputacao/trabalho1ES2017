package tarefa1;

import java.util.Scanner;

/**
 * Programa para calculo de área de figuras geométricas. Apresenta opções para 
 * o usuário escolher a figura a ser utilizada para cálculo
 * @author LuanComputacao
 */
public class CalculadoraGeometrica {
    
    /**
     * Método principal
     * @param args Argumentos
     */
    public static void main(String[] args) {
        double result = 0;


        double altura;
        double base;
        String figura = null;
        double raio;
        Scanner scn = new Scanner(System.in);
        int opcao;
        opcao = 1;

        while (opcao > 0) {
            System.out.println("Calculadora");
            System.out.println("Escolha a forma para calcular a área");
            System.out.println("\n1 - Retangulo \n2 - Triangulo \n3 - Circulo");
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    figura = "retangulo";
                    System.out.println("Digite a medida da base");
                    base = scn.nextDouble();
                    System.out.println("Digite a medida do altura");
                    altura = scn.nextDouble();
                    result = calculadora.Geometria.calculaAreaRetangulo(base, altura);
                    break;
                case 2:
                    figura = "triangulo";
                    System.out.println("Digite a base");
                    base = scn.nextDouble();
                    System.out.println("Digite a altura");
                    altura = scn.nextDouble();
                    result = calculadora.Geometria.calculaAreaTriangulo(base, altura);
                    break;
                case 3:
                    figura = "circulo";
                    System.out.println("Digite a base");
                    raio = scn.nextDouble();
                    result = calculadora.Geometria.calculaAreaCircunferencia(raio);
                    break;
            }

            if (opcao > 0) {
                System.out.println("A área do " + figura + " é " + result + '.');
            }
        }
    }
}
