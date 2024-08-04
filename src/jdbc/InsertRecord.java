package jdbc;

import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newsummit";
        String username = "root";
        String password = "";
        try{
            //connect to the database
            Connection con = DriverManager.getConnection(url, username, password);
            //create sql query and execute it
//            String sql = "insert into student(id, name, faculty) values(102, 'Janak', 'BCA')";
//            String sql ="insert into student(id, name, faculty) values(201, 'Rajeeb', 'BCA'), (202, 'Ravi', 'BCA')";
//            String sql = "update student set faculty = 'BBA' where id =101";
            String sql = "delete from student where id = 202";
                    Statement st = con.createStatement();
            st.execute(sql);

            //close the connection
            con.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
