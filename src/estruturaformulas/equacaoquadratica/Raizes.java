package estruturaformulas.equacaoquadratica;

public class Raizes {
    private double x1;
    private double x2;
    private boolean complexas;

    public Raizes(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.complexas = false;
    }

    public Raizes(double parteReal, double parteImaginaria, boolean isComplex ){
        this.x1 = parteReal;
        this.x2 = parteImaginaria;
        this.complexas = true;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    public String toString(){
        if(complexas){
            return String.format("X1 = %.2f + %.2fi | X2 = %.2f - %.2fi", x1, x2, x1, x2);
        }else if (x1 == x2){
            return "Raiz única: X = " + x1;
        }else{
            return "X1 = " + x1 + ", X2 = " + x2;
        }
    }
}
