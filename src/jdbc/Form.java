package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Form implements ActionListener {
    JFrame jf;
    JLabel L1, L2, L3;
    JTextField t1, t2;
    JComboBox cb;
    JButton b1, b2, b3;

    Form() {
        jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        L3 = new JLabel("Id:");
        jf.add(L3);
        t1 = new JTextField(30);
        jf.add(t1);
        L1 = new JLabel("Name:");
        jf.add(L1);
        t2 = new JTextField(30);
        jf.add(t2);
        L2 = new JLabel("Faculty");
        jf.add(L2);
        String[] fac = {"BCA", "BBA", "BIM", "CSIT"};
        cb = new JComboBox(fac);
        jf.add(cb);
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        jf.add(b1);
        b2 = new JButton("Delete");
        b2.addActionListener(this);
        jf.add(b2);
        b3 = new JButton("Show Record");
        b3.addActionListener(this);
        jf.add(b3);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        Form obj = new Form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int id = Integer.parseInt(t1.getText());
            String name = t2.getText();
            String faculty = cb.getSelectedItem().toString();

            String url = "jdbc:mysql://localhost:3306/newsummit";
            String username = "root";
            String password = "";
            try {
                //load db driver

                Class.forName("com.mysql.jdbc.Driver");
                //connect to database
                Connection con = DriverManager.getConnection(url, username, password);

                String sqll = "insert into student (id,name,faculty) values(?,?,?)";


                PreparedStatement st = con.prepareStatement(sqll);
                st.setInt(1, id);
                st.setString(2, name);
                st.setString(3, faculty);
                // st.execute(sql);
                st.execute();
                //close the connection
                con.close();
                JOptionPane.showMessageDialog(null, "Record Saved");

            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (e.getSource() == b2) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (confirm == 0) {
                String url = "jdbc:mysql://localhost:3306/newsummit";
                String username = "root";
                String password = "";
                int id = Integer.parseInt(t1.getText());

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url, username, password);

                    String sql = "delete from student where id=?";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setInt(1, id);
                    st.execute();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    con.close();

                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }

        } else if (e.getSource() == b3) {
            String url = "jdbc:mysql://localhost:3306/newsummit";
            String username = "root";
            String password = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, username, password);
                String sql = "select * from student";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String columns[] = {"ID", "NAME", "FACULTY"};
                Object[][] data = new Object[100][3];
                int row = 0;
                while (rs.next()) {
                    data[row][0] = rs.getString("id");
                    data[row][1] = rs.getString("name");
                    data[row][2] = rs.getString("faculty");
                    row++;
                }
                JTable table = new JTable(data, columns);
                JScrollPane jp = new JScrollPane(table);
                jf.add(jp);
                jf.setVisible(true);
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
    }
}