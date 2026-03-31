/**
 * File : AngkaSial.java
 * deskripsi : Program penggunaan exception buatan sendiri.
 *              Pengenalan klausa 'throw' dan 'throws'
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 31 Maret 2026
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 64) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        // setiap class dibuat, konstruktor tanpa parameter otomatis dibuat
        // default constructor
        AngkaSial as = new AngkaSial();

        try{
            as.cobaAngka(80);
            as.cobaAngka(64);
            as.cobaAngka(100);
        } catch (AngkaSialException ase) {
            // method getMessage telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
