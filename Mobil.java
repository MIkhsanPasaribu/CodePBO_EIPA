package vehicles;

import abstraction.Kendaraan; // Mengimpor class abstrak Kendaraan dari package abstraction

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    // Implementasi abstract method dari Kendaraan
    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak dengan kecepatan tinggi di jalan raya.");
    }

    // Overriding method infoKendaraan
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
