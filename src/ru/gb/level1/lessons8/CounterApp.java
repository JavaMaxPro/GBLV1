package ru.gb.level1.lessons8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;
    private int step = 1;

    public CounterApp(int initialValue) {
        setBounds(500, 500, 640, 320);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton clearButton = new JButton("clear");
        clearButton.setFont(font);
        add(clearButton, BorderLayout.SOUTH);

        JTextField textLabel = new JTextField("Step");
        textLabel.setFont(font);
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textLabel,BorderLayout.NORTH);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value-=step;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value+=step;
                counterValueView.setText(String.valueOf(value));
            }
        });

        textLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                step= Integer.parseInt(textLabel.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }

}
