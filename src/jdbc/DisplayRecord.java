package jdbc;

import java.sql.*;

public class DisplayRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newsummit";
        String username = "root";
        String password = "";
        try{
            //connect to the database
            Connection con = DriverManager.getConnection(url, username, password);
            //create sql query and execute it
            String sql = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString("id") + " " +
                        rs.getString("name")+ " " +
                        rs.getString("faculty"));
            }

            //close the connection
            con.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
