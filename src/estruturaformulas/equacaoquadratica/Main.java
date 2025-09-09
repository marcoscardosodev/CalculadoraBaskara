package estruturaformulas.equacaoquadratica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean coeficenteValido = false;
        Equacao eq = null;

        while (!coeficenteValido) {
            System.out.println("Calculadora de Equações do 2º Grau");
            System.out.println();

            System.out.print("Digite o coeficiente A: ");
            double A = scanner.nextDouble();

            System.out.print("Digite o coeficiente B: ");
            double B = scanner.nextDouble();

            System.out.print("Digite o coeficiente C: ");
            double C = scanner.nextDouble();

            try {
                eq = new Equacao(A, B, C);
                coeficenteValido = true;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.\n");
            }


        }

        System.out.println("\nEquação gerada com sucesso!");
        System.out.println(eq);

        System.out.println("\nDeseja ver o gráfico? (s/n)");
        String resposta = scanner.next();
        if(resposta.equalsIgnoreCase("s")){
            GraficoParabola.mostrarGrafico(eq);
        }

        scanner.close();
    }
}
