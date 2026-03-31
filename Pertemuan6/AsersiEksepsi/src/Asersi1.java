/**
 * File : Asersi1.java
 * deskripsi : Program untuk menunjukkan Asersi
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 31 Maret 2026
 */

public class Asersi1 {
    public static void main(String[] args)  {
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        } else {
            // Jika x tidak > 0, maka asersi ini akan cek apakah x < 0
            // Karena x = 0, asersi ini akan gagal dan memunculkan pesan "ada kesalahan kode"
            // assert (kondisi benar)
            // artinya: saya yakin kondisi ini benar, kalau salah --> program error
            assert(x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        } 
    }
}
