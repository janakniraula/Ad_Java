import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class UsingBorderLayout {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
        JButton b4 = new JButton("four");
        JButton b5 = new JButton("five");

        //BorderLayout bL = new BorderLayout();
        BorderLayout bL = new BorderLayout(5,5);

        jf.setLayout(bL);
        jf.add(b1, BorderLayout.NORTH);
        jf.add(b2, BorderLayout.SOUTH);
        jf.add(b3, BorderLayout.WEST);
        jf.add(b4, BorderLayout.EAST);
        jf.add(b5, BorderLayout.CENTER);
        jf.setVisible(true);
    }
}
