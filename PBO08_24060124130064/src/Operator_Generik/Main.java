package Operator_Generik;

// Nama File    : Main.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

import Anabul.Kucing;
import Anabul.Anjing;
import Anabul.Anggora;
import Anabul.Kembangtelon;

public class Main {
    public static void main(String[] args) {
        // Kamus
        Datum<Integer> i1;
        Datum<Integer> i2;
        Datum<String> s1;
        Datum<String> s2;
        Datum<Kucing> k1;
        Datum<Kucing> k2;
        Datum<Anjing> a1;
        Datum<Anjing> a2;
        Datum<Anggora> k3;
        Datum<Kembangtelon> k4;
        
        // Algoritma
        // Realisasi Tukar sesama integer
        System.out.println("============ REALISASI TUKAR ===============");
        System.out.println("--- TUKAR SESAMA INTEGER ---");
        i1 = new Datum<>();
        i2 = new Datum<>();
        i1.setIsi(13);
        i2.setIsi(27);
        System.out.println(" --- Sebelum Tukar(i1,i2)");
        System.out.println("Bilangan i1 = " + i1.getIsi());
        System.out.println("Bilangan i2 = "+ i2.getIsi());
        OperatorGenerik.Tukar(i1, i2);
        System.out.println(" --- Setelah Tukar(i1,i2)");
        System.out.println("Bilangan i1 = " + i1.getIsi());
        System.out.println("Bilangan i2 = "+ i2.getIsi());

        System.out.println();
        // 2b. Aplikasi Prosedur Tukar
        // Realisasi Tukar sesama string
        System.out.println("--- TUKAR SESAMA STRING ---");
        s1 = new Datum<>();
        s2 = new Datum<>();
        s1.setIsi("Anggisea");
        s2.setIsi("Kirana");
        System.out.println(" --- Sebelum Tukar(s1,s2)");
        System.out.println("String s1 = " + s1.getIsi());
        System.out.println("String s2 = "+ s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println(" --- Setelah Tukar(s1,s2)");
        System.out.println("String s1 = " + s1.getIsi());
        System.out.println("String s2 = "+ s2.getIsi());

        System.out.println();
        // Realisasi Tukar sesama keluarga Anabul
        // 1.Realisasi Tukar sesama Kucing
        System.out.println("--- TUKAR SESAMA KUCING ---");
        k1 = new Datum<>();
        k2 = new Datum<>();
        k1.setIsi(new Kucing("Meng", 20));
        k2.setIsi(new Kucing("Puss", 25));
        System.out.println(" --- Sebelum Tukar(k1,k2)");
        System.out.println("Kucing k1 = " + k1.getIsi().toString());
        System.out.println("Kucing k2 = "+ k2.getIsi().toString());
        OperatorGenerik.Tukar(k1, k2);
        System.out.println(" --- Setelah Tukar(k1,k2)");
        System.out.println("Kucing k1 = " + k1.getIsi().toString());
        System.out.println("Kucing k2 = " + k2.getIsi().toString());

        System.out.println();
        // 2.Realisasi Tukar sesama Anjing
        System.out.println("--- TUKAR SESAMA ANJING ---");
        a1 = new Datum<>();
        a2 = new Datum<>();
        a1.setIsi(new Anjing("Goofy"));
        a2.setIsi(new Anjing("Fluffy"));
        System.out.println(" --- Sebelum Tukar(a1,a2)");
        System.out.println("Anjing a1 = " + a1.getIsi().toString());
        System.out.println("Anjing a2 = " + a2.getIsi().toString());
        OperatorGenerik.Tukar(a1, a2);
        System.out.println(" --- Setelah Tukar(a1,a2)");
        System.out.println("Anjing a1 = " + a1.getIsi().toString());
        System.out.println("Anjing a2 = "+ a2.getIsi().toString());

        System.out.println();
        // 2b. Aplikasi Prosedur Tukar
        // 2c. Realisasi Bobot2
        System.out.println("============ REALISASI BOBOT2 ===============");
        System.out.println("--- JUMLAH BOBOT KUCING K3 DAN K4 SEBELUM BOBOT2---");
        k3 = new Datum<>();
        k4 = new Datum<>();
        k3.setIsi(new Anggora("Tehh", 4.2));  
        k4.setIsi(new Kembangtelon("Imyut", 7.0)); 
        System.out.println("Bobot k3: " + k3.getIsi().getBobot());
        System.out.println("Bobot k4: " + k4.getIsi().getBobot());

        System.out.println("--- JUMLAH BOBOT KUCING K1 DAN K2 SETELAH BOBOT2---");
        System.out.println("Jumlah bobot k3 dan k4: " + OperatorGenerik.Bobot2(k3, k4)); 
    }
}
