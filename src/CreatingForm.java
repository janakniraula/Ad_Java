import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreatingForm implements ActionListener {
    JFrame jf;
    JLabel L1, L2, L3, L4, L5;
    JTextField tf;
    JComboBox cb;
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JList mylist;
    JButton b1;

    CreatingForm() {
        jf = new JFrame();
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        L1 = new JLabel("Name:");
        jf.add(L1);
        tf = new JTextField(30);
        jf.add(tf);
        L2 = new JLabel("Faculty");
        jf.add(L2);
        String[] fac ={"BCA", "BBA", "BIM", "CSIT"};
        cb = new JComboBox(fac);
        jf.add(cb);
        L3 = new JLabel("Gender");
        jf.add(L3);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        jf.add(r1);
        jf.add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        L4 = new JLabel("Hobbies");
        jf.add(L4);
        c1 = new JCheckBox("Reading");
        c2 = new JCheckBox("Travelling");
        jf.add(c1);
        jf.add(c2);
        L5 = new JLabel("Languages");
        jf.add(L5);
        String[] lang = {"Nepali", "English", "Newari", "Hindi"};
        mylist = new JList(lang);
        JScrollPane jp = new JScrollPane(mylist);
        jf.add(jp);
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        jf.add(b1);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        CreatingForm obj = new CreatingForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        String faculty = cb.getSelectedItem()+"";
        String gender="";
        if(r1.isSelected())
            gender = "Male";
        else
            gender = "Female";

        String hobbies ="";
        if(c1.isSelected())
            hobbies = "Reading";
        if (c2.isSelected())
            hobbies = "Travelling";

        String language = mylist.getSelectedValue()+"";
        System.out.println(name);
        System.out.println(gender);
        System.out.println(faculty);
        System.out.println(hobbies);
        System.out.println(language);

    }
}
