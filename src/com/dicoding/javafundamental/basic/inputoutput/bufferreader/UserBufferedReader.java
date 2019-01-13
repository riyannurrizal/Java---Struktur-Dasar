package com.dicoding.javafundamental.basic.inputoutput.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public UserBufferedReader() {
    }

    public static void main(String []args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program perkalian sangat sederhana");
        int value1 = 0;
        int value2 = 0;
        try {
            System.out.print("Masukkan Angkat pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan Angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            System.out.println("Masuk jurang");
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : "+ hasil);
    }
}
