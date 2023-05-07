package Lab3.QN2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcUI extends JFrame {
    JTextField num1, num2, result;
    JButton button;

    CalcUI() {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        add(num1);
        add(num2);
        button = new JButton("Add");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(String.valueOf(Double.parseDouble(num1.getText()) +
                        Double.parseDouble(num2.getText())));
            }
        });
        add(button);
        result = new JTextField(5);
        add(result);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new CalcUI();
    }
}
