/**
 * File : AngkaSialException.java
 * deskripsi : Eksepsi buatan sendiri, menolak masukan angka 64!
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 31 Maret 2026
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 64 karena angka sial !!!");
    }
}
