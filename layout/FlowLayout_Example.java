package layout;
import javax.swing.*;
import java.awt.*;

public class FlowLayout_Example extends JFrame{
    public FlowLayout_Example () {
        this.setTitle("FlowLayout_Example");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null); // Set center location

        // Set Layout
        FlowLayout fl = new FlowLayout();
        FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER, 50, 50);

        this.setLayout(fl1);
        JButton btnOne = new JButton("One");
        JButton btnTwo = new JButton("Two");
        JButton btnThree = new JButton("Three");



        // Add Components
        this.add(btnOne);
        this.add(btnTwo);
        this.add(btnThree);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new FlowLayout_Example();

    }
}
