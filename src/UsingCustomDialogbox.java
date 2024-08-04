import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingCustomDialogbox implements ActionListener {
    JFrame jf;
    JButton btn , btn2;

    UsingCustomDialogbox() {
        jf =new JFrame();
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn = new JButton("About Us");
        jf.add(btn);
        btn.addActionListener(this);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        UsingCustomDialogbox obj = new UsingCustomDialogbox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog jd = new JDialog(jf);
        jd.setSize(200,200);
        jd.setLayout(new FlowLayout());
        JLabel msg = new JLabel("Contact us at: wwww@gmail.com");
        jd.add(msg);
        jd.setVisible(true);
    }
}
