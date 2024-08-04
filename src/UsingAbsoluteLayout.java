import javax.swing.*;

public class UsingAbsoluteLayout {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        JLabel L1 = new JLabel("Name:");
        L1.setBounds(20,20,80,25);
        jf.add(L1);

        JTextField t1 = new JTextField();
        t1.setBounds( 110, 20, 160, 25);
        jf.add(t1);

        JLabel L2 = new JLabel("Age:");
        L2.setBounds(20,55, 80, 25);
        jf.add(L2);

        JTextField t2 = new JTextField();
        t2.setBounds( 110, 55, 60, 25);
        jf.add(t2);

        JLabel L3 = new JLabel("Address:");
        L3.setBounds(20,90, 80, 25);
        jf.add(L3);

        JTextField t3 = new JTextField();
        t3.setBounds( 110, 90, 160, 25);
        jf.add(t3);

        JButton B1 = new JButton("Submit");
        B1.setBounds(188, 125, 80, 25);
        jf.add(B1);

        jf.setVisible(true);
    }
    
}
