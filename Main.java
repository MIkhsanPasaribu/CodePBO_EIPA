package main;

import vehicles.Mobil;
import vehicles.Motor;
import abstraction.Kendaraan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", 2020, 4);
        
        // Membuat objek Motor
        Motor motor1 = new Motor("Honda", 2018, true);

        // Menggunakan polymorphism untuk memanggil method infoKendaraan dan bergerak
        Kendaraan[] daftarKendaraan = {mobil1, motor1};

        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.infoKendaraan();
            kendaraan.bergerak();
            System.out.println();
        }
    }
}
