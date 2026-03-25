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
    /* ATRIBUT */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    /* METHOD */
    // Konstruktor tanpa paramater
    protected BangunDatar()
    {
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    // Konstruktor dengan paramater
    protected BangunDatar(int jmlSisi, String warna, String border)
    {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter & Setter
    public int getJmlSisi()
    {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }
    
    public String getWarna()
    {
        return warna;
    }

    public void setWarna(String warna)
    {
        this.warna = warna;
    }
    
    public String getBorder()
    {
        return border;
    }

    public void setBorder(String border)
    {
        this.border = border;
    }

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
        System.out.println("Jumlahsisi\t: " + getJmlSisi());
        System.out.println("Warna\t: " + getWarna());
        System.out.println("Border\t: " + getBorder());
    }
}