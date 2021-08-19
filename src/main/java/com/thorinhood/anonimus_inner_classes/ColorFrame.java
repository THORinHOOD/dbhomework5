package com.thorinhood.anonimus_inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public ColorFrame(int counter) throws HeadlessException {
        AtomicLong atomicCounter = new AtomicLong(counter);

        setSize(500,500);
        JButton button = new JButton("click me to be red");


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(atomicCounter.getAndAdd(1));
            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(10);
    }
}

