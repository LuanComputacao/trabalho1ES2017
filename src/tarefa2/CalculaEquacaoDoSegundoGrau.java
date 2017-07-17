package tarefa2;

import calculadora.EquacaoQuadratica;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa para realizar o cálculo das raízes reais de uma equação do segundo
 * grau
 * @author LuanComputacao
 */
public class CalculaEquacaoDoSegundoGrau {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        
        int opcao = 'y';
        int termoA;
        int termoB;
        int termoC;
        double[] result;
        
        while(opcao == 'y'){
            System.out.println("Calcula as raizes reais de uma equação do segundo grau");
            System.out.println("Constante do termo quadrático (ax²)");
            termoA = sn.nextInt();
            System.out.println("Constante do termo de primeiro grau(ax)");
            termoB = sn.nextInt();
            System.out.println("Constante da equação");
            termoC = sn.nextInt();
            try{
                result = EquacaoQuadratica.calcula(termoA, termoB, termoC);
                System.out.println("As raizes são");
                System.out.println(Arrays.toString(result));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("\nQuer calcular as raizes para outra função?(y/n)");
            opcao = sn.next().charAt(0);
            if(opcao == 'y' || opcao == 'Y'){
                opcao = 'y';
            }
        }
    }
}
