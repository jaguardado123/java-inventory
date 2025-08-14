package com.example;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Car Inventory");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Make
        JLabel makeLabel = new JLabel("Make:");
        JTextField makeField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(makeLabel, gbc);
        gbc.gridx = 1;
        panel.add(makeField, gbc);

        // Model
        JLabel modelLabel = new JLabel("Model:");
        JTextField modelField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(modelLabel, gbc);
        gbc.gridx = 1;
        panel.add(modelField, gbc);

        // Year
        JLabel yearLabel = new JLabel("Year:");
        JTextField yearField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(yearLabel, gbc);
        gbc.gridx = 1;
        panel.add(yearField, gbc);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String make = makeField.getText();
                String model = modelField.getText();
                int year = Integer.parseInt(yearField.getText());
                Car car = new Car(make, model, year);
                car.text();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}