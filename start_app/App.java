package start_app;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{
    public App () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void show(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
//        this.setLocation(600, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        App f = new App();
        f.show("Java Simple", 920, 720);
        f.setLayout(new FlowLayout());
        JButton btnOne = new JButton("Login");
        f.add(btnOne);
//        f
    }
}
