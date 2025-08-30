package estruturaformulas.equacaoquadratica;

public class Main {
    public static void main(String[] args) {
        Equacao equacao = new Equacao(1, -3, 2);

        System.out.println(equacao.getDelta());
        System.out.println(equacao.getXVertice());
        System.out.println(equacao.getYVertice());
    }
}
