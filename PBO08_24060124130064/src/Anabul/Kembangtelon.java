package Anabul;

// Nama File    : Kembangtelon.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

public class Kembangtelon extends Kucing {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor tanpa parameter
    public Kembangtelon(){
        super();
    }

    // Konstruktor dengan parameter
    public Kembangtelon(String nama, double bobot){
        super(nama, bobot);
    }

    // Operator lainnya
    @Override 
    public String toString() { 
        return "Kembangtelon: " + getNama() + " (" + getBobot() + " kg)"; 
    }
    
}
