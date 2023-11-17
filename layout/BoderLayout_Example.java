package layout;
import javax.swing.*;
import java.awt.*;

public class BoderLayout_Example extends JFrame{
    public BoderLayout_Example() {
        this.setTitle("BorderLayout_Example");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null); // Set center location

        // Set Layout
        BorderLayout bl = new BorderLayout();
        BorderLayout bl1 = new BorderLayout(15, 15);

        this.setLayout(bl1);

        // Create Button Component
        JButton btnOne = new JButton("One");
        JButton btnTwo = new JButton( "Two");
        JButton btnThree = new JButton("Three");
        JButton btnFour = new JButton("Four");
        JButton btnFive = new JButton("Five");



        // Add Components
        this.add(btnOne, BorderLayout.NORTH);
        this.add(btnTwo, BorderLayout.SOUTH);
        this.add(btnThree, BorderLayout.WEST);
        this.add(btnFour, BorderLayout.EAST);
        this.add(btnFive, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new BoderLayout_Example();

    }
}
