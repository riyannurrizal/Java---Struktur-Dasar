package com.dicoding.javafundamental.operasi.unary;

public class OperasiUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus ");
        Integer nilaiAwal = 5;
        Integer hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();


        System.out.println("Operator Unary Minus ");
        Integer nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " +nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        Integer nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " +nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        Integer nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = "+nilaiAwal4);
        System.out.println();


        System.out.println("Operator komplemen logika ");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil false = "+ !sukses);
        System.out.println();
    }
}
