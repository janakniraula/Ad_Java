import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageDialog {
    JTextField t1;
    JFrame jf;
    JButton b1;
    JOptionPane o1;

    MessageDialog(){
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        b1 = new JButton("check");
        t1 = new JTextField(15);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                if( a % 2 == 0){
                    JOptionPane.showMessageDialog(null, "Even");
                }else{
                    JOptionPane.showMessageDialog(null, "Odd");
                }
            }
        });

        jf.add(t1);
        jf.add(b1);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        MessageDialog ob = new MessageDialog();
    }
}
