/**
 * File : DosenTetap.java
 * deskripsi : Program untuk membuat class Dosen Tetap
 * nama : Anggita Kirana Puspa
 * tanggal : 16 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    // Atribut
    private String NIDN;
    private static final int BUP = 65;
    private static final double PERCENT_TUNJANGAN = 0.02;

    // Konstruktor
    // Pakai parameter
    public DosenTetap (String NIP, String NIDN, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    // Getter
    public String getNIDN(){
        return NIDN;
    }

    public String getTanggalPensiun(){
        return hitungTanggalPensiun(BUP);
    }

    // Setter
    public void setNIDN (String NIDN) {
        this.NIDN = NIDN;
    }

    // Method
    @Override
    public double hitungTunjangan (){
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
        System.out.println("NIDN\t: " + getNIDN());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + formatTanggal(gettanggalLahir()));
        System.out.println("TMT\t: " + formatTanggal(getTMT()));
        System.out.println("Jabatan\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + getFakultas());
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun\t: " + getTanggalPensiun());
        System.out.println("Gaji Pokok\t: " + printRupiah(gajiPokok));
        System.out.println("Tunjangan\t: " + printTunjangan());
    }

}
