import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program_1 {
    JFrame jf;
    JButton b1,b2;
    JTextField t1;

    Program_1() { // Constructor
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        t1 = new JTextField(15);
        b1 = new JButton("OK");
        b2 = new JButton("Clear");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("You clicked the button");
                jf.getContentPane().setBackground(new Color(123455));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                jf.getContentPane().setBackground(Color.white);
            }
        });


        jf.add(t1);
        jf.add(b1);
        jf.add(b2);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        Program_1 ob = new Program_1();
    }
}