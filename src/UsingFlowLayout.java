import javax.swing.*;
import java.awt.*;
public class UsingFlowLayout
{
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");

        FlowLayout fL = new FlowLayout(FlowLayout.LEFT,15,15);

        jf.setLayout(fL);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.setVisible(true);
    }
}