import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI implements ActionListener {
    private int count = 0;
    private int windowWidth = 600;
    private int windowHeight = 400;

    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorButton;
    private JLabel passwordLabel;
    private JLabel matchResult;
    private JLabel arnoldLabel;
    private JLabel score;
    private JPasswordField passwordText;

    JTextField userText;

    public GUI() {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Rock Paper Scissors!");
        label.setBounds(windowWidth / 3, 0, 200, 25);
        panel.add(label);

        // userText = new JTextField(20);
        // userText.setBounds(100, 30, 165, 25);
        // panel.add(userText);

        // passwordLabel = new JLabel("Password");
        // passwordLabel.setBounds(10, 60, 80, 25);
        // panel.add(passwordLabel);

        // passwordText = new JPasswordField();
        // passwordText.setBounds(100, 60, 165, 25);
        // panel.add(passwordText);

        rockButton = new JButton("rock");
        rockButton.setBounds(windowWidth / 2 - 155, 100, 90, 25);
        rockButton.addActionListener(this);
        panel.add(rockButton);

        paperButton = new JButton("paper");
        paperButton.setBounds(windowWidth / 2 - 55, 100, 90, 25);
        paperButton.addActionListener(this);
        panel.add(paperButton);

        scissorButton = new JButton("scissors");
        scissorButton.setBounds(windowWidth / 2 + 45, 100, 90, 25);
        scissorButton.addActionListener(this);
        panel.add(scissorButton);

        matchResult = new JLabel("Good Luck!");
        matchResult.setBounds(windowWidth / 2 - 110, 160, 300, 25);
        panel.add(matchResult);

        arnoldLabel = new JLabel("Arnold: ");
        arnoldLabel.setBounds(windowWidth / 2 - 185, 160, 80, 25);
        arnoldLabel.setFont(new Font("serif", Font.BOLD, 18));
        panel.add(arnoldLabel);

        score = new JLabel("score 0 - 0");
        score.setBounds(windowWidth / 2 - 40, 20, 100, 25);
        panel.add(score);

        JTextArea gameLog = new JTextArea(30, 30);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Computer decides to cheat
        if (e.getSource() == rockButton) {
            matchResult.setText("I play paper! You Lose!");
        } else if (e.getSource() == paperButton) {
            matchResult.setText("I play scissors! You Lose!");
        } else if (e.getSource() == scissorButton) {
            matchResult.setText("I play rock! You Lose!");
        }
        count++;
        score.setText("score 0 - " + count);
    }

    private void logMatch(String result) {

    }

    public static void main(String[] args) {
        new GUI();
    }
};
