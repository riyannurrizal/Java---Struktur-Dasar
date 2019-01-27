package com.dicoding.javafundamental;

//import Kereta;
//import Mobil;
//import Motor;

// Baris di atas yang di komentari bisa di sederhanakan seperti ini
// tanda bintang setelah kendaraan itu dinamakan wildcard
// import com.dicoding.javafundamental.basic.kendaraan.*;
// itu tidak disarankan karena akan memperlama waktu untuk pencarian class tersebut jika banyak
// untuk mengatur import yang optimal pilih menu CODE lalu OPTIMIZE IMPORTS
import com.dicoding.javafundamental.kendaraan.Kereta;
import com.dicoding.javafundamental.kendaraan.Mobil;
import com.dicoding.javafundamental.kendaraan.Motor;
import com.dicoding.javafundamental.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        Gitar.bunyi();
        Gitar.senar();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini "+ today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok "+ tomorrow);
    }
}
