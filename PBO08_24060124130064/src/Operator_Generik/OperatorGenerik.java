package Operator_Generik;

import Anabul.Kucing;


// Nama File    : OperatorGenerik.java
// NIM          : 24060124130064
// Nama         : Anggita Kirana Puspa
// Tanggal      : 3 Mei 2026

public class OperatorGenerik {
    /* ATRIBUT */

    /* METHOD */
    // 2a. Prosedur generik Tukar
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // 2a. Prosedur generik Bobot2
    public static <T extends Kucing, U extends Kucing> double Bobot2 (Datum<T> k1, Datum<U> k2) {
        return k1.getIsi().getBobot() + k2.getIsi().getBobot();
    }
}
