package com.ccc.code.Encryption;

import java.io.*;
import java.util.ArrayList;

public class Encrypt {

    public static ArrayList<Character> alphabet = new ArrayList<>();

    private static void initialiseList(){

        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

    }

    private static String convertCharToEncryption(char c){

        FileInputReader fr = new FileInputReader();
        fr.initialiseList();

        String encryption = "";

        if(c == 'a'){
            encryption = fr.getList().get(0);
        }else if(c == 'b'){
            encryption = fr.getList().get(1);
        }else if(c == 'c'){
            encryption = fr.getList().get(2);
        }else if(c == 'd'){
            encryption = fr.getList().get(3);
        }else if(c == 'e'){
            encryption = fr.getList().get(4);
        }else if(c == 'f'){
            encryption = fr.getList().get(5);
        }else if(c == 'g'){
            encryption = fr.getList().get(6);
        }else if(c == 'h'){
            encryption = fr.getList().get(7);
        }else if(c == 'i'){
            encryption = fr.getList().get(8);
        }else if(c == 'j'){
            encryption = fr.getList().get(9);
        }else if(c == 'k'){
            encryption = fr.getList().get(10);
        }else if(c == 'l'){
            encryption = fr.getList().get(11);
        }else if(c == 'm'){
            encryption = fr.getList().get(12);
        }else if(c == 'n'){
            encryption = fr.getList().get(13);
        }else if(c == 'o'){
            encryption = fr.getList().get(14);
        }else if(c == 'p'){
            encryption = fr.getList().get(15);
        }else if(c == 'q'){
            encryption = fr.getList().get(16);
        }else if(c == 'r'){
            encryption = fr.getList().get(17);
        }else if(c == 's'){
            encryption = fr.getList().get(18);
        }else if(c == 't'){
            encryption = fr.getList().get(19);
        }else if(c == 'u'){
            encryption = fr.getList().get(20);
        }else if(c == 'v'){
            encryption = fr.getList().get(21);
        }else if(c == 'w'){
            encryption = fr.getList().get(22);
        }else if(c == 'x'){
            encryption = fr.getList().get(23);
        }else if(c == 'y'){
            encryption = fr.getList().get(24);
        }else if(c == 'z'){
            encryption = fr.getList().get(25);
        }

        return encryption;

    }

    private static String convertPasswordToEncryption(String pwd){

        String encryptedPwd = "";

        String unencryptedPwd = Decrypt.convertMainEncryptionToPasswordFromFile("Main");
        int currentPos = 0;

        initialiseList();

        for(int i = 0; i < pwd.length(); i++) {

            char currentChar = pwd.charAt(i);

            int normalPwdIndex = alphabet.indexOf(currentChar);

            int mainPwdIndex = alphabet.indexOf(unencryptedPwd.charAt(currentPos))+1;

            int newIndex = normalPwdIndex + mainPwdIndex;

            while (newIndex >= alphabet.size()){
                newIndex -= alphabet.size();
            }

            char newChar = alphabet.get(newIndex);

            encryptedPwd += convertCharToEncryption(newChar);

            currentPos++;
            if(currentPos >= unencryptedPwd.length()) currentPos = 0;

        }

        return encryptedPwd;

    }

    private static String convertMainPasswordToEncryption(String pwd){

        String encryptedPwd = "";

        for(int i = 0; i < pwd.length(); i++) {

            char currentChar = pwd.charAt(i);
            encryptedPwd += convertCharToEncryption(currentChar);

        }

        return encryptedPwd;

    }

    public static void convertPasswordToEncryptionAndWriteToFile(String pwd, String fileName) {

        String encryption = convertPasswordToEncryption(pwd);

        writeToFile(encryption, fileName);

    }

    public static void convertMainPasswordToEncryptionAndWriteToFile(String pwd, String fileName) {

        String encryption = convertMainPasswordToEncryption(pwd);

        writeToFile(encryption, fileName);

    }


    public static void writeToFile(String text, String fileName) {

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Passwords\\" + fileName + ".txt"));
            writer.write(text);

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
