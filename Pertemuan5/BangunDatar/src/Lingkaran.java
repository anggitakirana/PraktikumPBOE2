/**
 * File : Lingkaran.java
 * deskripsi : Program untuk membuat class Lingkaran extends BangunDatar versi abstract
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize
{
    // Atribut
    private double jari;

    // Method
    // Konstruktor tanpa parameter
    public Lingkaran(){
        super();
        setJmlSisi(0);
    }

    // Konstruktor dengan parameter jari-jari
    public Lingkaran(double jari, String warna, String border)
    {
        super(0, warna, border);
        this.jari = jari;
    }

    // Getter & Setter
    public double getJari()
    {
        return jari;
    }

    public void setJari(double jari)
    {
        this.jari = jari;
    }

    @Override
    public double getLuas()
    {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling()
    {
        return 2 * Math.PI * jari;
    }

    // Override interface IResize
    @Override
    public void zoomIn(){
        this.jari = this.jari * 1.1;
    }

    @Override
    public void zoomOut(){
        this.jari = this.jari * 0.9;
    }

    @Override
    public void zoom (int percent){
        this.jari = this.jari * (percent/ 100.0);
    }

    // Cetak Info
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Jari-jari\t: " + getJari());
    }
}