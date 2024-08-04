import javax.swing.*;
import java.awt.*;

public class DrawNepalflag extends JPanel {

    @Override
    public void paint(Graphics g){
        Polygon p = new Polygon();

        g.setColor(Color.red);
        p.addPoint(50, 50);
        p.addPoint(400, 300);
        p.addPoint(50, 300);
        p.addPoint(400,550);
        p.addPoint(50, 550);
        g.fillPolygon(p);

        g.setColor(Color.blue);
        g.drawPolygon(p);
        g.drawLine(50, 550, 50, 700);

        g.setColor(Color.white);
        g.fillArc(100, 170, 100, 80, 180, 180);
        g.fillOval(100, 420, 70, 70);

    }
    public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setSize(700,700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new DrawNepalflag());
        jf.setVisible(true);
    }


}