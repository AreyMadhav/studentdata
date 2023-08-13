package com.studentdata.student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDetailsGUI extends JFrame {
    private JTextField nameField, rollField, ageField, marksField;
    private JTextArea displayArea;

    public StudentDetailsGUI() {
        super("Student Details");

        nameField = new JTextField(20);
        rollField = new JTextField(20);
        ageField = new JTextField(20);
        marksField = new JTextField(20);
        displayArea = new JTextArea(5, 30);
        displayArea.setEditable(false);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int roll = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                float marks = Float.parseFloat(marksField.getText());

                String details = "Your details:\n" +
                                 "Name: " + name + "\n" +
                                 "Roll number: MRIIRS-" + roll + "\n" +
                                 "Age: " + age + "\n" +
                                 "Marks: " + marks + "\n";

                displayArea.setText(details);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Roll number:"));
        panel.add(rollField);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);
        panel.add(new JLabel("Marks:"));
        panel.add(marksField);
        panel.add(new JLabel(""));
        panel.add(submitButton);
        panel.add(new JLabel("Details:"));
        panel.add(new JScrollPane(displayArea));

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentDetailsGUI();
            }
        });
    }
}
