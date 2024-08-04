import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor implements ActionListener {
    JFrame jf;
    JMenu file;
    JMenuBar mb;
    JMenuItem newFile, exit, open, save;
    JTextArea ta;

    TextEditor(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic('F');
        newFile = new JMenuItem("New");
        newFile.setMnemonic('n');
        exit = new JMenuItem("Exit");
        exit.setMnemonic('x');
        open = new JMenuItem("Open");
        open.setMnemonic('o');
        save = new JMenuItem("Save");
        save.setMnemonic('s');
        ta = new JTextArea();

        file.add(newFile);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);
        mb.add(file);
        JScrollPane jp = new JScrollPane(ta);
        jf.add(jp);
        jf.setJMenuBar(mb);
        exit.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        newFile.addActionListener(this);
        jf.setVisible(true);


        //set shortcuts
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
    }

    public static void main(String[] args) {
        TextEditor obj = new TextEditor();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
            System.exit(0);
        }else if(e.getSource()==newFile){
            new TextEditor();
        } else if (e.getSource()==open) {
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(jf);
            String filename = jfc.getSelectedFile().toString();
            String text = "";
            try
            {
                FileReader fr = new FileReader(filename);
                int ch;
                while((ch = fr.read())!=-1)
                {
                    text += (char)ch;
                }
                fr.close();
                ta.setText(text);
            }
            catch(Exception ex)
            {
                System.out.print(ex);
            }
        } else if (e.getSource()==save) {
            String text = ta.getText();
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(jf);
            String filename = jfc.getSelectedFile().toString();
            try
            {
                FileWriter fw = new FileWriter(filename);
                fw.write(text);
                fw.close();
            }
            catch (Exception ex){
                System.out.print(ex);
            }
        }
    }
}