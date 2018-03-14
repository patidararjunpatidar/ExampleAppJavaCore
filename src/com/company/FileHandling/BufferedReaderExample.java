package com.company.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader bf = new BufferedReader(new FileReader("./myfile.txt"));
        while ((ch=bf.read())!=-1){
            System.out.print((char)ch);

        }
        bf.close();
    }
}
