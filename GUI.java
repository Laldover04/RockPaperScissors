import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
    int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;

    public GUI() {
        frame = new JFrame();

        rockButton = new JButton("Rock");
        rockButton.addActionListener(this);
        paperButton = new JButton("Paper");
        paperButton.addActionListener(this);
        scissorsButton = new JButton("Scissors");
        scissorsButton.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(rockButton);
        panel.add(paperButton);
        panel.add(scissorsButton);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("number of clicks:" + count);
    }

};
