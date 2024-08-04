import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MDIApp implements ActionListener {
    JFrame jf;
    JMenuBar mb;
    JMenu file;
    JMenuItem neww;
    JDesktopPane desktop;

    MDIApp() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        mb = new JMenuBar();
        file = new JMenu("File");
        neww = new JMenuItem("New");
        file.add(neww);
        mb.add(file);
        jf.setJMenuBar(mb);
        neww.addActionListener(this);
        desktop=new JDesktopPane();
        jf.add(desktop);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MDIApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JInternalFrame jif = new JInternalFrame();
        jif.setSize(300,300);
        jif.setClosable(true);
        desktop.add(jif);
        jif.setVisible(true);
    }

}
