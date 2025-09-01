package estruturaformulas.equacaoquadratica;

public class Vertice {
    private double xv;
    private double yv;

    public Vertice(double xv, double yv) {
        this.xv = xv;
        this.yv = yv;
    }

    public double getXv() {
        return xv;
    }

    public double getYv() {
        return yv;
    }
    public String toString(){
        return "(" + xv + ", " + yv + ")";
    }
}
