package Anabul;

// Nama File    : Anggora.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

public class Anggora extends Kucing {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor tanpa parameter
    public Anggora(){
        super();
    }

    // Konstruktor dengan parameter
    public Anggora(String nama, double bobot){
        super(nama, bobot);
    }
    
    // Operator lainnya
    @Override 
    public String toString() { 
        return "Anggora: " + getNama() + " (" + getBobot() + " kg)"; 
    }
}
