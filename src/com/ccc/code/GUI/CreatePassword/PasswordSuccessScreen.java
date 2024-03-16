package com.ccc.code.GUI.CreatePassword;

import com.ccc.code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordSuccessScreen {

    public static JButton backButton;
    public static JLabel label;

    public PasswordSuccessScreen(){

        Container cont = Main.frame.getContentPane();
        cont.removeAll();
        cont.setLayout(null);

        backButton = new JButton("Back to Main");
        backButton.setSize(250, 40);
        backButton.setLocation(250, 450);
        cont.add(backButton);

        label = new JLabel("Password Setup Success!");
        label.setSize(350, 30);
        label.setLocation(230, 80);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        cont.add(label);

        Main.frame.repaint();

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnToMain();
            }
        } );

    }

    public static void returnToMain(){

        Main.drawGUI();

    }

}
