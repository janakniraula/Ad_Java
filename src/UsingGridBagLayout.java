import javax.swing.*;
import java.awt.*;

public class UsingGridBagLayout {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gL = new GridBagLayout();
        jf.setLayout(gL);
        GridBagConstraints gbc = new GridBagConstraints();
        JButton b1 = new JButton("1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gL.setConstraints(b1, gbc);
        jf.add(b1);

        JButton b2 = new JButton("2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gL.setConstraints(b2, gbc);
        jf.add(b2);

        JButton b3 = new JButton("3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx=2;
        gbc.ipady=20;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gL.setConstraints(b3, gbc);
        jf.add(b3);

        JButton b4 = new JButton("4");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx=2;
        gbc.ipady=2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gL.setConstraints(b4, gbc);
        jf.add(b4);

        jf.setVisible(true);

    }

    ;
}