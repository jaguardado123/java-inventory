package com.example;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    // Creating an empty 600 x 400 px window.
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Car Inventory");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}