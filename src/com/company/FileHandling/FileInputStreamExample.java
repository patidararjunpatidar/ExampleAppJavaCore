package com.company.FileHandling;

import java.io.*;
import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = new FileInputStream("./myfile.txt");
        do {
            i=fin.read();
            if(i!=-1)
                System.out.print((char)i);
        }while(i != -1);
            fin.close();
    }
}
