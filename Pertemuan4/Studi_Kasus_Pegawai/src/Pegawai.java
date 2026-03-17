/**
 * File : Pegawai.java
 * deskripsi : Program untuk membuat class pegawai
 * nama : Anggita Kirana Puspa
 * tanggal : 16 Maret 2026
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Pegawai {
    // Atribut
    protected String NIP;
    protected String Nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    // Konstruktor
    // Pakai parameter
    public Pegawai (String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    // getter
    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public LocalDate gettanggalLahir(){
        return tanggalLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public double getgajiPokok(){
        return gajiPokok;
    }

    // setter
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // method
    public String printRupiah(double nilai){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        DecimalFormat format = new DecimalFormat("#,##0.00", symbols); 
        return "Rp" + format.format(nilai);
        
    }

    public String hitungMasaKerja () {
        Period masaKerja = Period.between(TMT, LocalDate.now());

        int selisihTahun = masaKerja.getYears();
        int selisihBulan = masaKerja.getMonths();

        return selisihTahun + " tahun " + selisihBulan + " bulan ";
    }

    public String hitungTanggalPensiun(int BUP) {
        LocalDate bupDate = tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return bupDate.format(outputFormatter);
    }

    public String formatTanggal (LocalDate tanggal) {
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    public double hitungTunjangan(){
        return 0;
    }

    public double getPercentTunjangan(){
        return 0;
    }

    public String printTunjangan(){
        NumberFormat percent = NumberFormat.getPercentInstance();
        String formatPercent = percent.format(getPercentTunjangan());
        Period masaKerja = Period.between(TMT, LocalDate.now());
        int selisihTahun = masaKerja.getYears();

        return formatPercent + " x " + selisihTahun + " x " + printRupiah(gajiPokok) + " = " + printRupiah(hitungTunjangan());
    }

    // method print
    public void printInfo(){
        System.out.println("NIP\t: " + getNIP());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + formatTanggal(gettanggalLahir()));
        System.out.println("TMT\t: " + formatTanggal(getTMT()));
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
        System.out.println("Gaji Pokok\t: " + printRupiah(gajiPokok));
    }

}
