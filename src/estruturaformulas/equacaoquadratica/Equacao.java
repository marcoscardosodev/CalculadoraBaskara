package estruturaformulas.equacaoquadratica;

public class Equacao {

    private double A;
    private double B;
    private double C;

    public Equacao(double A, double B, double C){
        if(A == 0 ){
            throw new IllegalArgumentException("O coefiente 'A' não pode ser igual a zero");

        }
        this.A = A;
        this.B = A;
        this.C = A;

    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public double getDelta(){
        return (B * B) - (4 * A * C);
    }
    public double getXVertice(){
        return -B / (2 * A);
    }
    public double getYVertice(){
        return - getDelta() / (4 * A);
    }
    public String getConcavidade(){
        return (A > 0) ? "Concavidade para cima U" : "Concavidade para baixo (n)";
    }

    public Vertice getVertice(){
        double xv = - B / (2 * A);
        double yv = - getDelta() / (4 * A);
        return new Vertice(xv, yv);
    }

    public Raizes getRaizes(){

    }
}
