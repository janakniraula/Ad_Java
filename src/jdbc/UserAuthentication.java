package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserAuthentication implements ActionListener {
    JFrame jf;
    JLabel L1, L2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    UserAuthentication() {
        jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        L1 = new JLabel("Username:");
        jf.add(L1);
        t1 = new JTextField(30);
        jf.add(t1);
        L2 = new JLabel("Password");
        jf.add(L2);
        t2 = new JPasswordField(30);
        jf.add(t2);

        b1 = new JButton("Login");
        b1.addActionListener(this);
        jf.add(b1);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new UserAuthentication();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "jdbc:mysql://localhost:3306/newsummit";
        String dbUsername = "root";
        String dbPassword = "";
        String u = t1.getText();
        String p = new String(t2.getPassword());

        try {
            // Connect to the database
            Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Use prepared statement to prevent SQL injection
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u);
            ps.setString(2, p);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                new Form();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }

            // Close the resources
            rs.close();
            ps.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}