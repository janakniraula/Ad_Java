/* WAP to draw a line.
 */

import javax.swing.*;
import java.awt.*;

public class DrawingShape extends JPanel {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(100, 200, 200, 200);
        g.drawRect(10, 20, 300, 200);
        g.drawOval(10, 20, 50,50);
        g.fillOval(10, 20, 50, 50);
        g.drawArc(100, 100, 200, 100, 90, 90 );

    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new DrawingShape());
        jf.setVisible(true);
    }
}
