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
        this.B = B;
        this.C = C;

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
        return (B * B) - 4 * A * C;
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
        double delta = getDelta();
        if(delta < 0){
            return null;

        }else if(delta == 0 ){
            double x = -B / (2 * A);
            return new Raizes(x, x);

        }else{
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            return new Raizes(x1, x2);
        }

    }

    public String getEquacaoFormatada(){
        StringBuilder sb = new StringBuilder();

        if(A == 0 ){
            sb.append("X²");

        }else if(A == -1){
            sb.append("-X²");
        }else{
            sb.append(A).append("X²");
        }

        if(B != 0){
            if(B > 0){
               sb.append(" + ");
            }else{
                sb.append(" - ");
            }
            double absB = Math.abs(B);
            if(absB == 1 ){
                sb.append("X");
            }else{
                sb.append(absB).append("X");
            }
        }

        if(C != 0){
            if(C > 0){
                sb.append(" + ");
            }else{
                sb.append(" - ");
            }
            sb.append(Math.abs(C));
        }
        sb.append(" = 0");
        return sb.toString();
    }
}

