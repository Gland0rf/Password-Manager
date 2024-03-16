package com.ccc.code.Encryption;

import java.io.*;
import java.util.ArrayList;

public class Decrypt {
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

    private static void initialiseStringList(){

        FileInputReader reader = new FileInputReader();
        reader.initialiseList();

    }

    private static char convertEncryptionToChar(String encrypted){

        FileInputReader reader = new FileInputReader();
        reader.initialiseList();
        ArrayList<String> encryptionAlphabet = reader.encryptedAlphabet;
        char output = ' ';

        if(encrypted.equals(encryptionAlphabet.get(0))){
            output = 'a';
        }else if(encrypted.equals(encryptionAlphabet.get(1))){
            output = 'b';
        }else if(encrypted.equals(encryptionAlphabet.get(2))){
            output = 'c';
        }else if(encrypted.equals(encryptionAlphabet.get(3))){
            output = 'd';
        }else if(encrypted.equals(encryptionAlphabet.get(4))){
            output = 'e';
        }else if(encrypted.equals(encryptionAlphabet.get(5))){
            output = 'f';
        }else if(encrypted.equals(encryptionAlphabet.get(6))){
            output = 'g';
        }else if(encrypted.equals(encryptionAlphabet.get(7))){
            output = 'h';
        }else if(encrypted.equals(encryptionAlphabet.get(8))){
            output = 'i';
        }else if(encrypted.equals(encryptionAlphabet.get(9))){
            output = 'j';
        }else if(encrypted.equals(encryptionAlphabet.get(10))){
            output = 'k';
        }else if(encrypted.equals(encryptionAlphabet.get(11))){
            output = 'l';
        }else if(encrypted.equals(encryptionAlphabet.get(12))){
            output = 'm';
        }else if(encrypted.equals(encryptionAlphabet.get(13))){
            output = 'n';
        }else if(encrypted.equals(encryptionAlphabet.get(14))){
            output = 'o';
        }else if(encrypted.equals(encryptionAlphabet.get(15))){
            output = 'p';
        }else if(encrypted.equals(encryptionAlphabet.get(16))){
            output = 'q';
        }else if(encrypted.equals(encryptionAlphabet.get(17))){
            output = 'r';
        }else if(encrypted.equals(encryptionAlphabet.get(18))){
            output = 's';
        }else if(encrypted.equals(encryptionAlphabet.get(19))){
            output = 't';
        }else if(encrypted.equals(encryptionAlphabet.get(20))){
            output = 'u';
        }else if(encrypted.equals(encryptionAlphabet.get(21))){
            output = 'v';
        }else if(encrypted.equals(encryptionAlphabet.get(22))){
            output = 'w';
        }else if(encrypted.equals(encryptionAlphabet.get(23))){
            output = 'x';
        }else if(encrypted.equals(encryptionAlphabet.get(24))){
            output = 'y';
        }else if(encrypted.equals(encryptionAlphabet.get(25))){
            output = 'z';
        }

        return output;

    }


    private static String convertEncryptionToPassword(String pwd){

        FileInputReader reader = new FileInputReader();
        reader.initialiseList();
        ArrayList<String> encryptionAlphabet = reader.encryptedAlphabet;

        String decryptedPwd = "";

        String unencryptedPwd = Decrypt.convertMainEncryptionToPasswordFromFile("Main");
        int currentPos = 0;

        initialiseList();

        initialiseStringList();

        for(int i = 0; i < pwd.length(); i += 4) {

            String currentString = pwd.substring(i, i+4);
            //68hk

            int normalPwdIndex = encryptionAlphabet.indexOf(currentString);

            int mainPwdIndex = alphabet.indexOf(unencryptedPwd.charAt(currentPos))+1;

            int newIndex = normalPwdIndex - mainPwdIndex;

            while (newIndex < 0){
                newIndex += encryptionAlphabet.size();
            }

            String newString = encryptionAlphabet.get(newIndex);

            decryptedPwd += convertEncryptionToChar(newString);

            currentPos++;
            if(currentPos >= unencryptedPwd.length()) currentPos = 0;

        }

        return decryptedPwd;

    }

    private static String convertMainEncryptionToPassword(String pwd){

        String decryptedPwd = "";


        for(int i = 0; i < pwd.length(); i += 4) {

            String currentString = pwd.substring(i, i+4);

            decryptedPwd += convertEncryptionToChar(currentString);

        }

        return decryptedPwd;

    }

    public static String convertEncryptionToPasswordFromFile(String file) {

        String encryptedCode = readFile(file);

        if(encryptedCode.equals("File not found")){
            return "Password not found";
        }

        String unencrypted = convertEncryptionToPassword(encryptedCode);

        return unencrypted;

    }

    public static String convertMainEncryptionToPasswordFromFile(String file) {

        String encryptedCode = readFile(file);

        String unencrypted = convertMainEncryptionToPassword(encryptedCode);

        return unencrypted;

    }

    private static String readFile(String fileName) {

        try{
            File file = new File("Passwords\\" + fileName + ".txt");
            if(!file.exists()){
                return "File not found";
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
