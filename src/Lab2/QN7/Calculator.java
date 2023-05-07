package Lab2.QN7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    // GUI components
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonReset;

    // Variables to hold operands and operator
    private double num1 = 0.0;
    private double num2 = 0.0;
    private char operator = ' ';

    public Calculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        textField = new JTextField(10);
        textField.setEditable(false);
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonReset = new JButton("C");
        JPanel panel = new JPanel(new GridLayout(4, 4));
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonAdd);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonSubtract);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMultiply);
        panel.add(button0);
        panel.add(buttonEquals);
        panel.add(buttonReset);
        panel.add(buttonDivide);
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonReset.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button == button0) {
            textField.setText(textField.getText() + "0");
        } else if (button == button1) {
            textField.setText(textField.getText() + "1");
        } else if (button == button2) {
            textField.setText(textField.getText() + "2");
        } else if (button == button3) {
            textField.setText(textField.getText() + "3");
        } else if (button == button4) {
            textField.setText(textField.getText() + "4");
        } else if (button == button5) {
            textField.setText(textField.getText() + "5");
        } else if (button == button6) {
            textField.setText(textField.getText() + "6");
        } else if (button == button7) {
            textField.setText(textField.getText() + "7");
        } else if (button == button8) {
            textField.setText(textField.getText() + "8");
        } else if (button == button9) {
            textField.setText(textField.getText() + "9");
        } else if (button == buttonAdd) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (button == buttonSubtract) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (button == buttonMultiply) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (button == buttonDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        } else if (button == buttonEquals) {
            num2 = Double.parseDouble(textField.getText());
            double result = 0.0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(Double.toString(result));
        } else if (button == buttonReset) {
            num1 = 0.0;
            num2 = 0.0;
            operator = ' ';
            textField.setText("");
        }
    }
}
