package Larik_Generik;

// Nama File    : Main.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

import Anabul.Kucing;
import Anabul.Anjing;
import Anabul.Anggora;
import Anabul.Kembangtelon;
import Operator_Generik.Datum;

public class Main {
    public static void main(String[] args) {
        // Kamus
        Datum<Kucing> k1;
        Datum<Kucing> k2;
        Datum<Anjing> a1;
        Datum<Anjing> a2;
        Datum<Anggora> k3;
        Datum<Kembangtelon> k4;

        Data<Kucing> dataKucing;
        Data<Anjing> dataAnjing;

        // Algoritma
        dataKucing = new Data<>();
        dataAnjing = new Data<>();
        k1 = new Datum<>();
        k2 = new Datum<>();
        a1 = new Datum<>();
        a2 = new Datum<>();
        k3 = new Datum<>();
        k4 = new Datum<>();

        k1.setIsi(new Kucing("Meng", 20));
        k2.setIsi(new Kucing("Puss", 25));
        a1.setIsi(new Anjing("Goofy"));
        a2.setIsi(new Anjing("Fluffy"));
        k3.setIsi(new Anggora("Tehh", 4.2));  
        k4.setIsi(new Kembangtelon("Imyut", 7.0));

        // 4b. Realisasi setIsi
        dataKucing.setIsi(1, k1.getIsi());
        dataKucing.setIsi(2, k2.getIsi());

        // Anggora dan Kembangtelon bisa masuk Data<Kucing>
        Datum<Kucing> dk3 = new Datum<>();
        Datum<Kucing> dk4 = new Datum<>();

        dk3.setIsi(k3.getIsi());
        dk4.setIsi(k4.getIsi());

        dataKucing.setIsi(3, dk3.getIsi());
        dataKucing.setIsi(4, dk4.getIsi());

        // setIsi untuk Anjing
        dataAnjing.setIsi(1, a1.getIsi());
        dataAnjing.setIsi(2, a2.getIsi());

        // 4c. Realisasi getIsi
        for (int i = 1; i <= dataKucing.getSize(); i++) {
        System.out.println(
            "Isi dataKucing posisi " + i + ": " + dataKucing.getIsi(i)
        );
        }

        for (int i = 1; i <= dataAnjing.getSize(); i++) {
        System.out.println(
            "Isi dataAnjing posisi " + i + ": " + dataAnjing.getIsi(i)
        );
        }

        // 4d. Realisasi getSize
        System.out.println("Ukuran dataKucing: " + dataKucing.getSize());
        System.out.println("Ukuran dataAnjing: " + dataAnjing.getSize());

    }
}
