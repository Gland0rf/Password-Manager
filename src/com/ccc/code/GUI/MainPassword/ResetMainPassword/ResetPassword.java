package com.ccc.code.GUI.MainPassword.ResetMainPassword;

import com.ccc.code.Encryption.Decrypt;
import com.ccc.code.Encryption.Encrypt;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class ResetPassword {

    public static void resetPwd(String newMainPwd){

        String oldMainPwd = Decrypt.convertMainEncryptionToPasswordFromFile("Main");

        ArrayList<String> encryptedFileList = new ArrayList<>();
        HashMap<String, String> unEncryptedFileList = new HashMap<>();

        File folder = new File("Passwords\\");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {

                if(!listOfFiles[i].getName().equals("Main.txt")){
                    encryptedFileList.add(listOfFiles[i].getName());
                }

            }
        }

        for(int i = 0; i < encryptedFileList.size(); i++){

            String file = encryptedFileList.get(i);
            file = file.substring(0, file.length()-4);
            String unencryptedFileCode = Decrypt.convertEncryptionToPasswordFromFile(file);
            unEncryptedFileList.put(file, unencryptedFileCode);

        }

        //Reset Main Password
        Encrypt.convertMainPasswordToEncryptionAndWriteToFile(newMainPwd, "Main");

        //Encrypt Old Files with new Main Password
        for(String x : unEncryptedFileList.keySet()){

            Encrypt.convertPasswordToEncryptionAndWriteToFile(unEncryptedFileList.get(x), x);



        }

    }

}
