package org.example;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class EncodePassword {
    public static void main(String[] args) throws IOException {
//        String pass="";
        //to encrypt a password
//        String encPass= Base64.getEncoder().encodeToString(pass.getBytes());
//        System.out.println(encPass);


        FileInputStream fin = new FileInputStream("qa.properties");
        Properties prop=new Properties();
        prop.load(fin);
        String encPass= prop.getProperty("password");
        System.out.println(encPass);
        byte[] decpass=Base64.getDecoder().decode(encPass);
        String passnew = new String(decpass);
        System.out.println(passnew);

    }
}
