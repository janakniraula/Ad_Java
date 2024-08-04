import javax.swing.*;
import java.awt.*;

public class DrawPolygon extends JPanel {
    public void paint(Graphics g) {
        super.paintComponent(g);

        Polygon p = new Polygon();

        p.addPoint(200, 150);
        p.addPoint(200, 350);
        p.addPoint(300, 300);
        g.drawPolygon(p);

    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new DrawPolygon());
        jf.setVisible(true);
    }
}
