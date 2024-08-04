import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsingJDialogBox implements ActionListener {
    JFrame jf;
    JDialog jd;
    JButton btn;

    UsingJDialogBox() {
        jf =new JFrame();
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn = new JButton("Choose Color");
        jf.add(btn);
        btn.addActionListener(this);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        UsingJDialogBox obj = new UsingJDialogBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color c =JColorChooser.showDialog(null, "Choose Colors", Color.yellow);
        jf.getContentPane().setBackground(c);
    }

//    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Message");
//        JOptionPane.showInputDialog(null, "who are you?");
//        JOptionPane.showConfirmDialog(null, "Are you sure?");
//        int choice = JOptionPane.showConfirmDialog(null, "Are you sure?");
//        System.out.println(choice);
//
//    }
}
