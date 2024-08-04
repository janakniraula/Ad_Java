import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventHandler extends MouseAdapter {
    JFrame jf;
    MouseEventHandler(){
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.addMouseListener(this);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        MouseEventHandler obj = new MouseEventHandler();

    }

    public void mouseEntered(MouseEvent e)
    {
        jf.getContentPane().setBackground(Color.red);
    }

    public void mouseExited(MouseEvent e){
        jf.getContentPane().setBackground(Color.blue);
    }
}
