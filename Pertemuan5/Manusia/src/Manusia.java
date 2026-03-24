import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * File : Manusia.java
 * deskripsi : Program untuk membuat parent class Manusia versi abstract class
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public abstract class Manusia {
    /* ATRIBUT */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    /* METHOD */
    // Konstruktor
    public Manusia (String nama, String tanggalMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", new Locale("id", "ID"));
        this.tgl_mulai_kerja = LocalDate.parse(tanggalMulaiKerja, formatter);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor
    public String getNama(){
        return nama;
    }

    public LocalDate getTanggalMulaiKerja(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalMulaiKerja(LocalDate tanggalMulaiKerja){
        this.tgl_mulai_kerja = tanggalMulaiKerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Mulai Kerja\t: " + getTanggalMulaiKerja());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Pendapatan\t: " + getPendapatan());
    }

    // method untuk formatTanggal
    public String formatTanggal (LocalDate tanggal) {
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    // method untuk format rupiah
    public String printRupiah(double nilai){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        DecimalFormat format = new DecimalFormat("#,##0.00", symbols); 
        return "Rp" + format.format(nilai);
        
    }

    public abstract int hitungMasaKerja();
}
