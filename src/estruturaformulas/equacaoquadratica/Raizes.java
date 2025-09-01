package estruturaformulas.equacaoquadratica;

public class Raizes {
    private double x1;
    private double x2;

    public Raizes(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    public String toString(){
        if(x1 == x2){
            return "Raiz unica: X = " + x1;
        }else{
            return "X1 = " + x1 + ", X2 = " + x2;
        }
    }
}
