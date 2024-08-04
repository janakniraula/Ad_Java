import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingFIleDialog implements ActionListener {
    JFrame jf;
    JButton btn , btn2;

    UsingFIleDialog() {
        jf =new JFrame();
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn = new JButton("open File");
        jf.add(btn);
        btn2 = new JButton("Save File");
        jf.add(btn2);
        btn.addActionListener(this);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        UsingFIleDialog obj = new UsingFIleDialog();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jf);
    }
}
