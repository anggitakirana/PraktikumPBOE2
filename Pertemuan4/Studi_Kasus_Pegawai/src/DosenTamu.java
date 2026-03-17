/**
 * File : DosenTamu.java
 * deskripsi : Program untuk membuat class Dosen Tamu
 * nama : Anggita Kirana Puspa
 * tanggal : 16 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen{
    // Atribut
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;
    private static final double PERCENT_TUNJANGAN = 0.025;

    // Konstruktor
    // Pakai parameter
    public DosenTamu (String NIP, String NIDK, String Nama, LocalDate tanggalLahir, LocalDate TMT, LocalDate tanggalAkhirKontrak, double gajiPokok, String Fakultas){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // Getter
    public String getNIDK(){
        return NIDK;
    }

    public String getTanggalAkhirKontrak(){
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return tanggalAkhirKontrak.format(outputFormatter);
    }

    // Setter
    public void setNIDK (String NIDK) {
        this.NIDK = NIDK;
    }

    // Method
    public String hitungMasaKontrak () {
        Period masaKontrak = Period.between(LocalDate.now(), tanggalAkhirKontrak);

        int selisihBulan1 = masaKontrak.getYears() * 12;
        int selisihBulan2 = masaKontrak.getMonths();

        int totalSelisihBulan = selisihBulan1 + selisihBulan2;
        return totalSelisihBulan + " bulan ";
    }

    @Override
    public double hitungTunjangan (){
        return PERCENT_TUNJANGAN * getgajiPokok();
    }

    @Override
    public double getPercentTunjangan(){
        return PERCENT_TUNJANGAN;
    }

    @Override
    public String printTunjangan(){
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMinimumFractionDigits(1);
        percent.setMaximumFractionDigits(1);

        String formatPercent = percent.format(getPercentTunjangan());
        return formatPercent + " x " + printRupiah(gajiPokok) + " = " + printRupiah(hitungTunjangan());
    }

    @Override
    public void printInfo(){
        System.out.println("NIP\t: " + getNIP());
        System.out.println("NIDK\t: " + getNIDK());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + formatTanggal(gettanggalLahir()));
        System.out.println("TMT\t: " + formatTanggal(getTMT()));
        System.out.println("Jabatan\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + getFakultas());
        System.out.println("Masa Kontrak Berakhir\t: " + hitungMasaKontrak());
        System.out.println("Tanggal Berakhir Kontrak\t: " + getTanggalAkhirKontrak());
        System.out.println("Gaji Pokok\t: " + printRupiah(gajiPokok));
        System.out.println("Tunjangan\t: " + printTunjangan());
    }
}
