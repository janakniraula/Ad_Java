import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsingEventHandeling implements ActionListener {

    JFrame jf;
    JButton b1;
    JTextField t1;
    UsingEventHandeling(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        t1= new JTextField(30);
        b1= new JButton("Search");
        b1.addActionListener(this);

        jf.add(t1);
        jf.add(b1);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        UsingEventHandeling ob = new UsingEventHandeling();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t1.setText("You have clicked the button");

    }
}
