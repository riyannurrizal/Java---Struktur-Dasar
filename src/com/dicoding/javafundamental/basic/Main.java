package com.dicoding.javafundamental.basic;

//import com.dicoding.javafundamental.basic.kendaraan.Kereta;
//import com.dicoding.javafundamental.basic.kendaraan.Mobil;
//import com.dicoding.javafundamental.basic.kendaraan.Motor;

// Baris di atas yang di komentari bisa di sederhanakan seperti ini
// tanda bintang setelah kendaraan itu dinamakan wildcard
// import com.dicoding.javafundamental.basic.kendaraan.*;
// itu tidak disarankan karena akan memperlama waktu untuk pencarian class tersebut jika banyak
// untuk mengatur import yang optimal pilih menu CODE lalu OPTIMIZE IMPORTS
import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        Gitar.bunyi();
        Gitar.senar();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
    }
}
