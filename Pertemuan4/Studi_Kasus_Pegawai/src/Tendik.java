/**
 * File : Tendik.java
 * deskripsi : Program untuk membuat class Tendik
 * nama : Anggita Kirana Puspa
 * tanggal : 16 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    // Atribut
    private String Bidang;
    private static final int BUP = 55;
    private static final double PERCENT_TUNJANGAN = 0.01;

    // Konstruktor
    // Pakai parameter
    public Tendik (String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT,  double gajiPokok, String Bidang){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Bidang = Bidang;
    }
    
    // Getter
    public String getBidang(){
        return Bidang;
    }

    public String getTanggalPensiun(){
        return hitungTanggalPensiun(BUP);
    }

    // Setter
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    // Method
    @Override
    public double hitungTunjangan(){
        Period masaKerja = Period.between(TMT, LocalDate.now());
        int selisihTahun = masaKerja.getYears();

        return PERCENT_TUNJANGAN * selisihTahun * getgajiPokok(); 
    }

    @Override
    public double getPercentTunjangan(){
        return PERCENT_TUNJANGAN;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP\t: " + getNIP());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + formatTanggal(gettanggalLahir()));
        System.out.println("TMT\t: " + formatTanggal(getTMT()));
        System.out.println("Jabatan\t: Tendik");
        System.out.println("Bidang\t: " + getBidang());
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun\t: " + getTanggalPensiun());
        System.out.println("Gaji Pokok\t: " + printRupiah(gajiPokok));
        System.out.println("Tunjangan\t: " + printTunjangan());
    }
}
