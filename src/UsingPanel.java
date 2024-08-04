import javax.swing.*;
import java.awt.*;
public class UsingPanel {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
        JButton b4 = new JButton("four");
        JButton b5 = new JButton("five");

        BorderLayout bL = new BorderLayout(5,5);

        jf.setLayout(bL);
        JPanel p1 = new JPanel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        jf.add(p1, BorderLayout.SOUTH);
        jf.add(b5, BorderLayout.CENTER);
        jf.setVisible(true);
    }

}
