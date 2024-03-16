package com.ccc.code.GUI.MainPassword.ResetMainPassword;

import com.ccc.code.Encryption.Decrypt;
import com.ccc.code.Encryption.Encrypt;
import com.ccc.code.GUI.CreatePassword.PasswordSuccessScreen;
import com.ccc.code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetPasswordScreen {

    public static JTextField oldPwdField, newPwdField;
    public static JLabel label;

    public ResetPasswordScreen(){

        Container cont = Main.frame.getContentPane();
        cont.removeAll();
        cont.setLayout(null);

        oldPwdField = new JTextField();
        oldPwdField.setBounds(200, 260, 150, 40);
        oldPwdField.setForeground(Color.GRAY);
        oldPwdField.setToolTipText("Old Password");
        cont.add(oldPwdField);

        newPwdField = new JTextField();
        newPwdField.setBounds(400, 260, 150, 40);
        newPwdField.setForeground(Color.GRAY);
        newPwdField.setToolTipText("New Password");
        cont.add(newPwdField);

        JButton resetPasswordButton = new JButton("Reset Password");
        resetPasswordButton.setSize(250, 40);
        resetPasswordButton.setLocation(250, 450);
        cont.add(resetPasswordButton);

        label = new JLabel("");
        label.setSize(300, 30);
        label.setLocation(250, 80);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        cont.add(label);

        Main.frame.repaint();

        resetPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetPassword();
            }
        } );

    }

    public static void resetPassword(){

        String oldPwd = oldPwdField.getText();
        String newPwd = newPwdField.getText();

        if(!oldPwd.equals("") && !newPwd.equals("")){

            String unencryptedPwd = Decrypt.convertMainEncryptionToPasswordFromFile("Main");

            if(oldPwd.equals(unencryptedPwd)){
                ResetPassword.resetPwd(newPwd);
                new ResetSuccessScreen();
            }else{
                label.setText("Wrong Password!");
            }

        }else{

            label.setText("Please fill all the boxes!");
            Main.frame.repaint();

        }

    }

}
