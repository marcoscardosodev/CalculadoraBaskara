package estruturaformulas.equacaoquadratica;

import java.util.Scanner;

public class CalculoEquacao {
    public static void main(String[] args) {


        double [][] equacoes = {
                {1,-8,7},
                {1,2,1},
                {2,-4,-6},
                {1,0,1}
        };
        for (int i = 0; i < equacoes.length; i++ ){
            double A = equacoes[i][0];
            double B = equacoes[i][1];
            double C = equacoes[i][2];

            Equacao eq = new Equacao(A,B,C);

            System.out.println("\nEquação " + (i + 1) + ": " + A + "x² + " + B + "x + " + C + " = 0");
            System.out.println("Delta: " + eq.getDelta());

            Vertice v = eq.getVertice();
            System.out.println("Vértice: " + v);

            Raizes r = eq.getRaizes();
            if(r == null){
                System.out.println("Raízes: Não possui raízes rais");
            }else{
                System.out.println("Raízes: " + r);
            }

        }
    }
}
