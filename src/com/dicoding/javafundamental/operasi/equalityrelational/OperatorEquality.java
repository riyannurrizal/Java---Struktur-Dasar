package com.dicoding.javafundamental.operasi.equalityrelational;

public class OperatorEquality {
    public static void main(String[] args) {
        Integer value1 = 5;
        Integer value2 = 4;
        boolean hasil;
        hasil = value1 == value2;

        System.out.println("Hasil 'value1 == value2' adalah "+ hasil);
        System.out.println();
        System.out.println("Tidak sama dengan..");

        hasil = value1 != value2;

        System.out.println("Hasil 'value1 != value2 adalah "+ hasil);
        System.out.println();
        System.out.println("Lebih besar dari..");

        hasil = value1 > value2;

        System.out.println("Hasil 'value1 > value2' adalah "+ hasil);
        System.out.println();
        System.out.println("Sama atau lebih besar dari..");

        hasil = value1 >= value2;

        System.out.println("Hasil 'value1 >= value2' adalah "+ hasil);
        System.out.println();
        System.out.println("Kurang dari..");

        hasil = value1 < value2;
        System.out.println("Hasil 'value1 < value2 adalah "+ hasil);
        System.out.println();
        System.out.println("Sama atau kurang dari dengan..");

        hasil = value1 <= value2;

        System.out.println("Hasil 'value1 <= value2 adalah "+ hasil);
        System.out.println();


    }
}