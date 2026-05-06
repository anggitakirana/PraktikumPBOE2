package Larik_Generik;

// Nama File    : Data.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

import Operator_Generik.Datum;

public class Data<T> {
    /* ATRIBUT */
    private Datum<T>[] ruang;
    private int banyak;

    /* METHOD */
    // Konstruktor tanpa parameter
    //@SuppressWarnings("unchecked")
    public Data(){
        ruang = new Datum[100];
        banyak = 0;
    }

    // Konstruktor dengan parameter
    public Data(Datum<T>[]ruang, int banyak){
        this.ruang = ruang;
        this.banyak = banyak;
    }

    // Selektor
    public Datum<T>[] getRuang(){
        return ruang;
    }

    public int getSize(){
        return banyak;
    }

    // Mutator
    public void setRuang(Datum<T>[] ruang){
        this.ruang = ruang;
    }

    public void setBanyak(int banyak){
        this.banyak = banyak;
    }

    // Operator lainnya
    public T getIsi(int posisi){
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Posisi harus 1..100");
        }

        return ruang[posisi-1].getIsi();
    }

    public void setIsi(int posisi, T a){
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Posisi harus 1..100");
        }
        
        if (ruang[posisi - 1] == null){
            ruang[posisi - 1] = new Datum<>();
            banyak++;
        }

        ruang[posisi - 1].setIsi(a);
    }
}
