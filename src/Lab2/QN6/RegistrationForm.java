package Lab2.QN6;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {

        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        panel.add(genderLabel);
        panel.add(genderPanel);

        JLabel interestsLabel = new JLabel("Interests:");
        JCheckBox sportsBox = new JCheckBox("Sports");
        JCheckBox musicBox = new JCheckBox("Music");
        JCheckBox travelBox = new JCheckBox("Travel");
        JPanel interestsPanel = new JPanel();
        interestsPanel.add(sportsBox);
        interestsPanel.add(musicBox);
        interestsPanel.add(travelBox);
        panel.add(interestsLabel);
        panel.add(interestsPanel);

        JLabel photoLabel = new JLabel(new ImageIcon("profile.png"));
        panel.add(photoLabel);

        String[] countries = {"USA", "Canada", "Mexico", "Brazil", "UK", "France", "Germany", "China", "Japan", "Australia"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        panel.add(countryBox);

        JLabel aboutLabel = new JLabel("About:");
        JTextArea aboutArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(aboutArea);
        panel.add(aboutLabel);
        panel.add(scrollPane);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
