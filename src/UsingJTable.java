import javax.swing.*;
import java.awt.*;

public class UsingJTable {
    JFrame jf;
    JTable tb;

    UsingJTable(){
        jf =new JFrame();
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object [] [] data = {{101, "Ram", "BCA"},
                {102, "Hari", "BBA"}};

        String []cols = {"ID", "NAME", "FACULTY"};
        tb = new JTable(data,cols);
        JScrollPane jp = new JScrollPane(tb);
        jf.add(jp);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        UsingJTable obj = new UsingJTable();
    }
}
