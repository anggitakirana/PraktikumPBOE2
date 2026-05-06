package Anabul;

// Nama File    : Anjing.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

public class Anjing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor tanpa parameter
    public Anjing(){
        super();
    }

    // Konstruktor dengan parameter
    public Anjing(String nama){
        super(nama);
    }

    // Operator lainnya
    @Override
    public void gerak(){
        System.out.println("Anjing " + getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara(){
        System.out.println("Anjing " + getNama() + " bersuara guk-guk");
    }

    // Tambahan operator untuk main nomor 2
    @Override 
    public String toString() { 
        return getNama(); 
    }
}
