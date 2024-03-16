package com.ccc.code.GUI.FindPassword;

import com.ccc.code.Encryption.Decrypt;
import com.ccc.code.Encryption.Encrypt;
import com.ccc.code.GUI.CreatePassword.CreatePasswordScreen;
import com.ccc.code.GUI.CreatePassword.PasswordSuccessScreen;
import com.ccc.code.GUI.MainPassword.ResetMainPassword.ResetPasswordScreen;
import com.ccc.code.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;


public class FindPasswordScreen {

    private static JButton mainButton;
    private static JButton createPwdButton;
    private static JButton findPwdButton;
    private static javax.swing.JButton doneButton;
    private static javax.swing.JLabel resultLabel;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private static javax.swing.JTextField nameTextField;
    public FindPasswordScreen(){

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
        resultLabel = new javax.swing.JLabel();

        jPanel1.setMaximumSize(new java.awt.Dimension(144, 334));
        jPanel1.setMinimumSize(new java.awt.Dimension(144, 334));
        jPanel1.setName("");

        doneButton.setFont(new Font("arial", 2, 20));
        resultLabel.setFont(new Font("arial",2, 26));
        nameTextField.setFont(new Font("arial",2, 20));

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
        doneButton.setText("Find Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(166, 166, 166)
                                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(179, 179, 179)
                                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(537, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
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
                findPassword();
            }
        } );

        Main.frame.repaint();

    }

    public static void findPassword(){

        String name = nameTextField.getText();

        if(!name.equals("")){

            String pwd = Decrypt.convertEncryptionToPasswordFromFile(name);
            if(pwd.equals("Password not found")){
                resultLabel.setText(pwd);
            }else{
                int length = pwd.length();
                while (length > 10){
                    pwd = pwd.substring(0, 10) + "\n" + pwd.substring(10);
                    length -= 10;
                    System.out.println(pwd);
                }
                resultLabel.setText("Password: \n" + pwd);
            }

        }else{

            resultLabel.setText("Please fill all the boxes!");
            Main.frame.repaint();

        }

    }

    public static void returnToMain(){

        Main.drawGUI();

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
