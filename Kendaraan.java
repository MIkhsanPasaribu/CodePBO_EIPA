package abstraction;

// Abstract class Kendaraan
public abstract class Kendaraan {
    private String merk;
    private int tahun;

    // Constructor
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Getter dan Setter (Encapsulation)
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Method abstract (Abstraction)
    public abstract void bergerak();

    // Method non-abstract
    public void infoKendaraan() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}
