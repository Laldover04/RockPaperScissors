
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class testTemp {
    private int windowWidth = 600;
    private int windowHeight = 400;

    private JFrame frame;
    private JPanel panel;

    JTextField userText;

    public testTemp() {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hiiii");
        frame.add(label);

        JTextArea gameLog = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(gameLog);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new testTemp();
    }
};
