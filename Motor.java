package vehicles;

import abstraction.Kendaraan; // Mengimpor class abstrak Kendaraan dari package abstraction

public class Motor extends Kendaraan {
    private boolean memilikiKopersi;

    public Motor(String merk, int tahun, boolean memilikiKopersi) {
        super(merk, tahun);
        this.memilikiKopersi = memilikiKopersi;
    }

    public boolean isMemilikiKopersi() {
        return memilikiKopersi;
    }

    public void setMemilikiKopersi(boolean memilikiKopersi) {
        this.memilikiKopersi = memilikiKopersi;
    }

    // Implementasi abstract method dari Kendaraan
    @Override
    public void bergerak() {
        System.out.println("Motor bergerak dengan kecepatan sedang di jalan perkotaan.");
    }

    // Overriding method infoKendaraan
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Memiliki kopersi: " + (memilikiKopersi ? "Ya" : "Tidak"));
    }
}
