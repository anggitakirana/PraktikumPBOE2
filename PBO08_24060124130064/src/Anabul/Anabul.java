package Anabul;

// Nama File    : Anabul.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026


public abstract class Anabul {
    /* ATRIBUT */
    private String nama;

    /* METHOD */
    // Konstruktor tanpa parameter
    protected Anabul(){
        this.nama = "";
    }

    // Konstruktor dengan parameter
    protected Anabul(String nama){
        this.nama = nama;
    }

    // Selektor
    public String getNama(){
        return nama;
    }

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    // Operator lainnya
    public abstract void gerak();
    public abstract void bersuara();
}
