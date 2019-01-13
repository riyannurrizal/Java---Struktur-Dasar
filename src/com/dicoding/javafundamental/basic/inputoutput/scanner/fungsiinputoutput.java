package com.dicoding.javafundamental.basic.inputoutput.scanner;

import java.util.Scanner;

public class fungsiinputoutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        //inisialisasi variable dan nextInt tipe data masukkan untuk integer
        int value1 = scanner.nextInt();
        System.out.print("Masukkan Angka kedua : ");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : "+ hasil);
    }
}
