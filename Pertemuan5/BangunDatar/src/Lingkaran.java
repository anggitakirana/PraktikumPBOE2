/**
 * File : Lingkaran.java
 * deskripsi : Program untuk membuat class Lingkaran extends BangunDatar versi abstract
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize
{
    private double jari;

    public Lingkaran(double jari)
    {
        this.jari = jari;
    }

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

    @Override
    public void printInfo()
    {
        System.out.println("Jari-jari: " + getJari());
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}