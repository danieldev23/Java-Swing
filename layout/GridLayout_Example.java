package layout;
import javax.swing.*;
import java.awt.*;

public class GridLayout_Example extends JFrame{
    public GridLayout_Example() {
        this.setTitle("GridLayout_Example");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null); // Set center location

        // Set Layout
        GridLayout gl = new GridLayout();
        GridLayout gl1 = new GridLayout(4, 4);
        GridLayout gl2 = new GridLayout(4,4 , 25, 25);

        this.setLayout(gl1);

        // Create Button Component
        JButton btnOne = new JButton("One");
        JButton btnTwo = new JButton( "Two");
        JButton btnThree = new JButton("Three");
        JButton btnFour = new JButton("Four");



        // Add Components
        this.add(btnOne);
        this.add(btnTwo);
        this.add(btnThree);
        this.add(btnFour);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new GridLayout_Example();

    }
}
