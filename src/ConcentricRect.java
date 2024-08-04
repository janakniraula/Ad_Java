import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ConcentricRect extends JPanel implements ActionListener {

    int r = 0, gr=0, b=0;

    Timer t = null;
    int x=50, y=50, w= 300, h=300;


    ConcentricRect(){
        t = new Timer(1000, this);
        t.start();
    }

    public void paint(Graphics g) {
//        super.paint(g);
        Color c = new Color(r,gr,b);
        g.setColor(c);
        Random rd = new Random();
        r = rd.nextInt(255);
        gr = rd.nextInt(255);
        b = rd.nextInt(255);

//        for (int i = 0; i <= 5; i++) {
//            int inset = i * 20;
//            g.drawRect(50 + inset, 50 + inset, 300 - 2 * inset, 300 - 2 * inset);
//        }
//        int w = 300, h=200, x=50, y=50;
//        for (int i = 1; i <= 5; i++) {
//            g.setColor(Color.red);
//            x+=10;
//            y+=10;
//            w-=20;
//            h-=20;
//        }
        g.fillOval(x, y, w, h);
    }


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new ConcentricRect());
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

        if (w>10)
        {
            w-=20;
            h-=20;
            x+=10;
            y+=10;
        }
        else {
            t.stop();
        }
    }
}
