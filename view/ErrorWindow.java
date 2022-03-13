package com.mdhasnainali.calculator.view;

import javax.swing.*;
import java.awt.*;

public class ErrorWindow {
    public ErrorWindow(String message){
        JFrame frame = new JFrame("Error Message");
        JLabel label = new JLabel(message);
        JButton button = new JButton("OK");

        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setForeground(Color.RED);
        button.addActionListener(e -> frame.dispose());

        frame.add(label, BorderLayout.CENTER);
        frame.add(button,BorderLayout.SOUTH);


        frame.setVisible(true);
    }
}
