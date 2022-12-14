package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MousePrank extends JFrame implements ActionListener {
    MousePrank() {
        super("Message");
        setSize(420, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BorderLayout border = new BorderLayout();
        setLayout(border);
        JLabel msg = new JLabel("Click 'OK' to close this program");
        add(BorderLayout.NORTH, msg);
        PrankPanel prank = new PrankPanel();
        prank.ok.addActionListener(this);
        add(BorderLayout.CENTER, prank);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }

    public Insets getInsets() {
        return new Insets(40, 10, 10, 10);
    }
}
