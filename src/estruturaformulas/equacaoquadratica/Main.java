package estruturaformulas.equacaoquadratica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Equações do 2º Grau");
        System.out.println();

        System.out.print("Digite o coeficiente A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double C = scanner.nextDouble();

        try {
            Equacao eq = new Equacao(A,B,C);
            System.out.println("\n" + eq);
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
