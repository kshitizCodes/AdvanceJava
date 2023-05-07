package Lab2.QN8;

import javax.swing.*;

public class DialogBoxesExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Boxes Example");
        
        JButton showMessageBtn = new JButton("Show Message Dialog");
        showMessageBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "This is a message dialog.");
        });
        JButton showConfirmBtn = new JButton("Show Confirm Dialog");
        showConfirmBtn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(frame, "Do you want to continue?");
            if (result == JOptionPane.YES_OPTION) {
                System.out.println("User clicked Yes.");
            } else if (result == JOptionPane.NO_OPTION) {
                System.out.println("User clicked No.");
            } else {
                System.out.println("User clicked Cancel.");
            }
        });

        JButton showInputBtn = new JButton("Show Input Dialog");
        showInputBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter your name:");
            System.out.println("User entered: " + input);
        });

        JPanel panel = new JPanel();
        panel.add(showMessageBtn);
        panel.add(showConfirmBtn);
        panel.add(showInputBtn);
        frame.add(panel);

        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}