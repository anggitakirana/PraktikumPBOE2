/**
 * File : Persegi.java
 * deskripsi : Program untuk membuat class Persegi extends BangunDatar versi abstract
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */


public class Persegi extends BangunDatar implements IResize
{
    // ATRIBUT
    private double sisi;

    // METHOD
    // KONSTRUKTOR TANPA PARAMETER
    public Persegi(){
        super();
        setJmlSisi(4);
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Persegi(double sisi, String warna, String border)
    {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Getter & Setter
    public double getSisi()
    {
        return sisi;
    }
    
    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }

    @Override
    public double getLuas()
    {
        return sisi * sisi;
    }

    @Override
    public double getKeliling()
    {
        return 4 * sisi;
    }

    public double getDiagonal()
    {
        return sisi * Math.sqrt(2);
    }

    // Override interface IResize
    @Override
    public void zoomIn(){
        this.sisi = this.sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        this.sisi = this.sisi * 0.9;
    }

    @Override
    public void zoom (int percent){
        this.sisi = this.sisi * (percent / 100.0);
    }

    // Cetak Info
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Sisi\t: " + getSisi());
    }
}