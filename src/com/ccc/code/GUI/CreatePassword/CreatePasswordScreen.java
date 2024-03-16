package com.ccc.code.GUI.CreatePassword;

import com.ccc.code.Encryption.Encrypt;
import com.ccc.code.GUI.FindPassword.FindPasswordScreen;
import com.ccc.code.GUI.MainPassword.ResetMainPassword.ResetPasswordScreen;
import com.ccc.code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class CreatePasswordScreen {

    public static JTextField nameField, pwdField;
    public static JLabel label;

    private static JButton mainButton;
    private static JButton createPwdButton;
    private static JButton findPwdButton;
    private static JLabel nameLabel;
    private static JLabel pwdLabel;
    private static JPanel jPanel1;
    private static JPanel jPanel2;
    private static JTextField nameTextField;
    private static JPasswordField pwdTextField;
    private static JButton doneButton;

    public CreatePasswordScreen(){

        Container cont = Main.frame.getContentPane();
        cont.removeAll();
        cont.setLayout(null);

        jPanel1 = new javax.swing.JPanel();
        mainButton = new javax.swing.JButton();
        createPwdButton = new javax.swing.JButton();
        findPwdButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        doneButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JPasswordField();

        jPanel1.setMaximumSize(new java.awt.Dimension(144, 334));
        jPanel1.setMinimumSize(new java.awt.Dimension(144, 334));
        jPanel1.setName("");

        nameTextField.setFont(new Font("arial", 2, 20));
        pwdTextField.setFont(new Font("arial", 2, 20));

        mainButton.setBackground(new java.awt.Color(242, 242, 242));
        mainButton.setBorder(null);
        mainButton.setIcon(new ImageIcon("C:\\Code Files\\PasswordManager\\GUI\\HomeButton.png")); // NOI18N
        mainButton.setText("Home");
        mainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainButtonPressed();
            }
        } );
        mainButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                JButton j = (JButton) e.getSource();
                Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
                Main.frame.setCursor(cursor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                JButton j = (JButton) e.getSource();
                Cursor cursor = new Cursor(Cursor.DEFAULT_CURSOR);
                Main.frame.setCursor(cursor);
            }
        });

        createPwdButton.setBackground(new java.awt.Color(242, 242, 242));
        createPwdButton.setBorder(null);
        createPwdButton.setIcon(new ImageIcon("C:\\Code Files\\PasswordManager\\GUI\\HomeButton.png")); // NOI18N
        createPwdButton.setText("Create Password");
        createPwdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createButtonPressed();
            }
        } );
        createPwdButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                JButton j = (JButton) e.getSource();
                Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
                Main.frame.setCursor(cursor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                JButton j = (JButton) e.getSource();
                Cursor cursor = new Cursor(Cursor.DEFAULT_CURSOR);
                Main.frame.setCursor(cursor);
            }
        });

        findPwdButton.setBackground(new java.awt.Color(242, 242, 242));
        findPwdButton.setBorder(null);
        findPwdButton.setIcon(new ImageIcon("C:\\Code Files\\PasswordManager\\GUI\\HomeButton.png")); // NOI18N
        findPwdButton.setText("Find Password");
        findPwdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                findButtonPressed();
            }
        } );
        findPwdButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                JButton j = (JButton) e.getSource();
                Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
                Main.frame.setCursor(cursor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                JButton j = (JButton) e.getSource();
                Cursor cursor = new Cursor(Cursor.DEFAULT_CURSOR);
                Main.frame.setCursor(cursor);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mainButton)
                                        .addComponent(createPwdButton)
                                        .addComponent(findPwdButton))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(mainButton)
                                .addGap(40, 40, 40)
                                .addComponent(createPwdButton)
                                .addGap(42, 42, 42)
                                .addComponent(findPwdButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(346, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(346, 0));

        doneButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        doneButton.setText("Create Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(569, 569, 569))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Main.frame.getContentPane());
        Main.frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        doneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createPassword();
            }
        } );

    }

    public static void createPassword(){

        String name = nameTextField.getText();
        String pwd = pwdTextField.getText();

        if(!name.equals("") && !pwd.equals("")){

            Encrypt.convertPasswordToEncryptionAndWriteToFile(pwd, name);
            new PasswordSuccessScreen();

        }else{

            label.setText("Please fill all the boxes!");
            Main.frame.repaint();

        }

    }

    public static void mainButtonPressed(){

        Main.drawGUI();

    }

    public static void createButtonPressed(){

        new CreatePasswordScreen();

    }

    public static void findButtonPressed(){

        new FindPasswordScreen();

    }

    public static void resetPasswordPressed(){

        new ResetPasswordScreen();

    }

}
