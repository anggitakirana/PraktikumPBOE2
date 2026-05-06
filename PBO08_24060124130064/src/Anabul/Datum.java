package Anabul;

// Nama File    : Datum.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

// T extends Kucing artinya T hanya boleh Kucing atau anak-anaknya
// Upper Bounded
public class Datum <T extends Kucing> {
    /* ATRIBUT */
    private T isi;

    /* METHOD */
    // SELEKTOR
    public T getIsi() {
        return isi;
    }

    // MUTATOR
    public void setIsi(T isibaru){
        this.isi = isibaru;
    }
}
