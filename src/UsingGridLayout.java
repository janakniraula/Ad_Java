import javax.swing.*;
import java.awt.*;

public class UsingGridLayout {



    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(2, 2, 5, 5));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.setVisible(true);
    }

    ;
}
