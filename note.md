## MDI (Multiple Document Interface) Application
- JFrame --> main window/frame
- JInterface --> child window/frame
   * setCloseable(true) is used to display "X" button.
   * A JInternalFrame always opens in a special container called "DesktopPane" which must be added to the main frame (JFrame).

## Working with graphics
- To work with  graphics, we must extend a Jpanel/canvas in our class and override
  * public void paint(Graphics g)
  or 
  * public void paintComponent (Graphics g)

- Graphics is a clas inside java.awt package which provides different methods to draw.
   For example: drawString(), drawLine(), drawRect() drawoval(), etc.


- To Draw Line
  * drawLine(int x1, int y1, int x2, int y2)
  * gdrawLine(10,10,100,10);

- To draw oval/circle
  * drawOval (int x, int y, int w, int h)
  * filloval (int x, int y, int w, int h)

- To Draw Arc
  * drawArc(int x, int y, int w, int h, int startangle, int int endangle)
  * Startangle --> always positive
  * endangle --> can be positive/negative

-To Draw a polygon
  * Polygon p = new Polygon();

Toggle button
- It is a special type of button which contains 2 distinct steps: on and off

## JDBC API (Java Database Connectivuty Application programmng Interface)
  * A JDBC is a collection of classes and interfaces under java.sl packages that can be used to connect Java applicaions to the database and communication.

- Classes under JDBC API
1. DriverManager  &rarr; used to establish connection to the database
2. SQLExecution &rarr; represents the exception caused if there is error in sql queries.
3. ClassNotFoundException &rarr; represents the exception cauesd if no suitable databse driver is found.

- Interfaces under JDBC API
1. connection &rarr; used to hold conection to the databse
2. Statement
3. PreparedStatement
 &rarr; Both are used to execute sql queries. However, preparedStatement helps to prevent SQL Injection attack.
4. CallableStatement &rarr; used to execute stored procedures.
5. ResultSet &rarr; used to hld the data rom database table into computer's main memory.
6. ResultSetMetaData &rarr; used to get additional information from ResultSet object like name of columns, number of columns.

- Steps for JDBC
1. Load the databse driver.
  e.g. class.forName("drivername"); //throws ClassNotFOundException
2. Make connection to the databse
   e.g. Connection con = DriverManager.getConnection("url"); //throws SQLException
3. Create sql query and execute it.
   e.g. String sql = "insert into ....";
   Statement st = conn.createStatement();
   st.execute(sql); //throws SQLExecution
4. Close the connection to the databse
   e.g. conn.close(); //throws SQLException

```
mysql -u root

create database newsummit;

use newsummit;

create table student (id int primary key, name varchar(10), faculty varchar(40));

select * from student;

insert into student(id, name , faculty) values (101, 'Ram', 'BCA');
```