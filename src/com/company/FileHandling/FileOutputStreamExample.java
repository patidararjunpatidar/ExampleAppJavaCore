package com.company.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        int i;
        try{
        FileOutputStream out = new FileOutputStream("./myfile.txt", true);
        String s = "TATA";
        char ch[] = s.toCharArray();
        for (i =0; i <= s.length(); i++) {
            out.write(ch[i]);
        }
        }catch (ArrayIndexOutOfBoundsException e1) {
            e1.fillInStackTrace();
        }
    }
}
