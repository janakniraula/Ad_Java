import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingInnerClass {
    JFrame jf;
    JButton b1;
    UsingInnerClass(){
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        b1 = new JButton("Hello");

        b1.addActionListener(new hello());

        jf.add(b1);
        jf.setVisible(true);
    }

    class hello implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hello World");
        }
    }

    public static void main(String[] args) {
        UsingInnerClass hi = new UsingInnerClass();
    }
}