package jpanel;

import javax.swing.*;
import java.awt.*;

public class MyCaculator extends JFrame {
    public MyCaculator() {
        this.setTitle("My Caculator");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jtextField = new JTextField(50);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new BorderLayout());
        jp1.add(jtextField, BorderLayout.CENTER);

        JButton jb0 = new JButton("0");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb_cong = new JButton("+");
        JButton jb_tru = new JButton("-");
        JButton jb_nhan = new JButton("*");
        JButton jb_chia = new JButton("/");
        JButton jb_bang = new JButton("=");

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(5, 3));
        jp2.add(jb0);
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        jp2.add(jb7);
        jp2.add(jb8);
        jp2.add(jb9);
        jp2.add(jb_cong);
        jp2.add(jb_tru);
        jp2.add(jb_nhan);
        jp2.add(jb_chia);
        jp2.add(jb_bang);

        this.setLayout(new BorderLayout());
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.CENTER);



        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyCaculator();
    }
}
