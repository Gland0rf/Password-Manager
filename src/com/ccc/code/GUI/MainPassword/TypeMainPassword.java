package com.ccc.code.GUI.MainPassword;

import com.ccc.code.Encryption.Decrypt;
import com.ccc.code.Encryption.Encrypt;
import com.ccc.code.GUI.CreatePassword.PasswordSuccessScreen;
import com.ccc.code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypeMainPassword {

    public static JTextField pwdField;
    public static JLabel label;

    public TypeMainPassword(){

        Container cont = Main.frame.getContentPane();
        cont.removeAll();
        cont.setLayout(null);

        pwdField = new JTextField();
        pwdField.setBounds(250, 260, 150, 40);
        pwdField.setForeground(Color.GRAY);
        pwdField.setToolTipText("Password");
        cont.add(pwdField);

        JButton createPasswordButton = new JButton("Login");
        createPasswordButton.setSize(250, 40);
        createPasswordButton.setLocation(250, 450);
        cont.add(createPasswordButton);

        label = new JLabel("");
        label.setSize(300, 30);
        label.setLocation(250, 80);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        cont.add(label);

        Main.frame.repaint();

        createPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkMainPassword();
            }
        } );

    }

    public static void checkMainPassword(){

        String pwd = pwdField.getText();

        if(!pwd.equals("")){

            String unencryptedPwd = Decrypt.convertMainEncryptionToPasswordFromFile("Main");
            System.out.println(unencryptedPwd);

            if(pwd.equals(unencryptedPwd)){
                Main.drawGUI();
            }else{
                label.setText("Wrong Password!");
            }

        }else{

            label.setText("Please fill the box!");
            Main.frame.repaint();

        }

    }

}
