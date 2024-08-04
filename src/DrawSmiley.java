import javax.swing.*;
import java.awt.*;

public class DrawSmiley extends JPanel {
    @Override
    public void paint (Graphics g) {

        // Set color for the face
        g.setColor(Color.YELLOW);
        // Draw the face (a circle)
        g.fillOval(100, 100, 200, 200);

        // Set color for the eyes
        g.setColor(Color.BLACK);
        // Draw the eyes (two smaller circles)
        g.fillOval(140, 150, 30, 30);
        g.fillOval(230, 150, 30, 30);

        // Set color for the mouth
        g.setColor(Color.WHITE);
        // Draw the mouth (an arc)
        g.fillArc(150, 180, 100, 80, 180, 180);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new DrawSmiley());
        jf.setVisible(true);
    }
}
