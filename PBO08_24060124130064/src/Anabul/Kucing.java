package Anabul;

// Nama File    : Kucing.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

public class Kucing extends Anabul {
    /* ATRIBUT */
    protected double bobot;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Kucing(){
        super();
        this.bobot = 0.0;
    }

    // Konstruktor dengan parameter
    public Kucing(String nama, double bobot){
        super(nama);
        this.bobot = bobot;
    }

    // Selektor
    public double getBobot() {
        return bobot;
    }

    // Mutator
    public void setBobot(double bobot){
        this.bobot = bobot;
    }

    // Operator lainnya
    @Override
    public void gerak(){
        System.out.println("Kucing " + getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara(){
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }

    // Tambahan operator untuk main nomor 2
    @Override 
    public String toString() { 
        return getNama() + " (" + getBobot() + " kg)"; 
    }
}
