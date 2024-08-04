package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FormDatabase implements ActionListener {
    JFrame jf;
    JLabel L1, L2, L3;
    JTextField t1, t2;
    JComboBox<String> cb;
    JButton b1;

    FormDatabase() {
        jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        L1 = new JLabel("ID:");
        jf.add(L1);
        t1 = new JTextField(30);
        jf.add(t1);
        L2 = new JLabel("Name:");
        jf.add(L2);
        t2 = new JTextField(30);
        jf.add(t2);
        L3 = new JLabel("Faculty"); // Corrected this line
        jf.add(L3);
        String[] fac = {"BCA", "BBA", "BIM", "CSIT"};
        cb = new JComboBox<>(fac);
        jf.add(cb);

        b1 = new JButton("Submit");
        b1.addActionListener(this);
        jf.add(b1);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        FormDatabase obj = new FormDatabase();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id =  Integer.parseInt(t1.getText());
        String name =  t2.getText();
        String  faculty =  cb.getSelectedItem().toString();
        String url = "jdbc:mysql://localhost:3306/newsummit";
        String username = "root";
        String password = "";
        try {
            //connect to the database
            Connection con = DriverManager.getConnection(url, username, password);
            //create sql query and execute it

            String sql = "insert into student(id, name, faculty) values(?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, faculty);
            st.execute();

            //close the connection
            con.close();
            JOptionPane.showMessageDialog(null,"Record Saved");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
