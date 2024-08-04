import java.awt.event.*;  // Importing AWT event classes
import java.awt.*;        // Importing AWT classes
import javax.swing.*;     // Importing Swing classes

public class EventHandlingExample {
    JFrame jf;    // Declaring a JFrame object
    JButton b1;   // Declaring a JButton object
    JTextField t1; // Declaring a JTextField object

    EventHandlingExample() { // Constructor
        jf = new JFrame();   // Creating a new JFrame
        jf.setSize(400, 400); // Setting the size of the frame to 400x400 pixels
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation
        jf.setLayout(new FlowLayout()); // Setting the layout of the frame to FlowLayout

        t1 = new JTextField(15); // Creating a new JTextField with 15 columns
        b1 = new JButton("OK");  // Creating a new JButton with label "OK"

        // Registering the button to an action listener
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // Overriding the actionPerformed method
                t1.setText("You clicked the button"); // Setting the text of the text field when button is clicked
            }
        });

        jf.add(t1); // Adding the text field to the frame
        jf.add(b1); // Adding the button to the frame
        jf.setVisible(true); // Making the frame visible
    }

    public static void main(String[] args) { // Main method
        EventHandlingExample ob = new EventHandlingExample(); // Creating an instance of EventHandlingExample
    }
}


// Event Handling:  When the user interacts with the GUI components, an event is occured.
//To handle event, a model is used which is called Event Delegation Model (Delegeation Event Model)

//Event Delegation Model:  It is an approach of handling events in java which is based on these 3 comcepts:
// A). Event Source: It is the component that generated the evnet. For example: a button is event source when it is clicked.

//B). Event:  It is an objecct that describes the state change in event source. For example: ActionEvent, KeyEvent etc.

//C). Event Listener:  It si an object that is notified when an event is occured in the evnet source. After getting notifed, event listener does the further processing.

//NOTE: Each event source must be registerd to the respective event listener.

// Event Listerners are the interface which contain the abstract methods that we must override for further processing.