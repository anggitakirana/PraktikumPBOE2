/**
 * File : BangunDatar.java
 * deskripsi : Program untuk membuat parent class BangunDatar versi abstract
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public abstract class BangunDatar
{
    // Menggunakan protected agar bisa diakses langsung oleh kelas turunannya (Bagian 4)
    // protected int jmlSisi;
    /* ATRIBUT */
    protected String warna;
    protected String border;

    /* METHOD */
    // Tambahan abstract method
    public abstract double getLuas();

    public abstract double getKeliling();

    // Tambahan method isEqualLuas
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo()
    {
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // public static void printCounterBangunDatar()
    // {
    //     System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    // }

}