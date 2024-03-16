package com.ccc.code.Encryption;

import java.io.*;
import java.util.ArrayList;

public class FileInputReader {

    public static ArrayList<String> encryptedAlphabet;

    public FileInputReader(){
        encryptedAlphabet = new ArrayList<>();
    }

    public static void initialiseList(){

        try{
            File file = new File("PasswordKey/key.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String input = br.readLine();

            for(int i = 0; i < input.length(); i += 4){

                String current = input.substring(i, i+4);
                encryptedAlphabet.add(current);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<String> getList(){
        return encryptedAlphabet;
    }

}
