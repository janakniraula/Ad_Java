import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.function.ToDoubleBiFunction;

public class UsingToggleButton implements ItemListener {
    JFrame jf;
    JToggleButton tb;

    UsingToggleButton() {
        jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UsingToggleButton();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}