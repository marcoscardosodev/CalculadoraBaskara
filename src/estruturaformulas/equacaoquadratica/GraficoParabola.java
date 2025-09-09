package estruturaformulas.equacaoquadratica;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraficoParabola extends JFrame{

    private Equacao equacao;
    private ArrayList<Point> pontos;

    public GraficoParabola (Equacao equacao){

        this.equacao = equacao;
        this.pontos = new ArrayList<>();

        setTitle("Grafico Parabola");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        calcularPontos();
    }
    private void calcularPontos(){
        double xVertice = equacao.getXVertice();

        double inicio = xVertice - 5;
        double fim = xVertice + 5;
        double passo = (fim - inicio) / 200;

        for (double x = inicio; x <= fim; x += passo){
            double y = (equacao.getA() * x * x) + (equacao.getB() * x) + equacao.getC();
            pontos.add(new Point((int) (x * 50), (int) (y * -50)));

        }
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;


        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        g2d.translate(centroX, centroY);

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawLine(-centroX, 0, centroX, 0);
        g2d.drawLine(-centroY, 0, centroY, 0);

        g2d.setColor(Color.BLUE);
        for (int i = 0; i < pontos.size() -1; i++){
            Point p1 = pontos.get(i);
            Point p2 = pontos.get(i + 1);
            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
        }

        g2d.setColor(Color.RED);
        int xv = (int) (equacao.getXVertice() * 50);
        int yv = (int) (equacao.getYVertice() * -50);
        g2d.fillOval(xv - 5, yv - 5, 10, 10);
        g2d.drawString("Vertice", xv + 10, yv);

        Raizes raizes = equacao.getRaizes();
        if (raizes != null){
            g2d.setColor(Color.GREEN);
            int x1 = (int) (raizes.getX1() * 50);
            g2d.fillOval(x1 - 5, 0 - 5, 10, 10);
            g2d.drawString("Raiz x1", x1 + 10, 15);

            if (raizes.getX1() != raizes.getX2()){
                int x2 = (int) (raizes.getX2() * 50);
                g2d.fillOval(x2 - 5, 0 - 5, 10, 10);
                g2d.drawString("Raiz x2", x2 + 10, 15);
            }
        }
    }

    public static void mostrarGrafico(Equacao equacao){
        SwingUtilities.invokeLater(() ->{
            GraficoParabola grafico = new GraficoParabola(equacao);
            grafico.setVisible(true);
        });
    }
}

