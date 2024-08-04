/* WAP to draw a text "Welcome" in a
 black background with red color and font Algerian
 */

import javax.swing.*;
import java.awt.*;

public class DrawingText extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        g.setColor(Color.white);
        g.setFont(new Font("Algerian", Font.BOLD, 28));
        g.drawString("Welcome", 50, 50);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new DrawingText());
        jf.setVisible(true);
    }
}
