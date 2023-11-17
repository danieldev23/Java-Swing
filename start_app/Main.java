package start_app;

import javax.swing.*;
import java.awt.*;
//import java.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create JFramw with Name
        JFrame f = new JFrame("Java GUI with Java Swing");

        f.setSize(600, 400);
        // Enable hide
        f.setVisible(true);
        f.setLocation(50, 50);
   // Exit program when close the windows
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

