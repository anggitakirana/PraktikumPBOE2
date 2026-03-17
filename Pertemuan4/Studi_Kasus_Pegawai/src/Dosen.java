/**
 * File : Dosen.java
 * deskripsi : Program untuk membuat class Dosen
 * nama : Anggita Kirana Puspa
 * tanggal : 16 Maret 2026
 */
import java.time.LocalDate;


public class Dosen extends Pegawai {
    // Atribut
    protected String Fakultas;

    // Konstruktor
    // Pakai parameter
    public Dosen (String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    // Getter
    public String getFakultas(){
        return Fakultas;
    }

    // Setter
    public void setFakultas (String Fakultas) {
        this.Fakultas = Fakultas;
    }

    // Method
    @Override
    public void printInfo(){
        System.out.println("NIP\t: " + getNIP());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Lahir\t: " + formatTanggal(gettanggalLahir()));
        System.out.println("TMT\t: " + formatTanggal(getTMT()));
        System.out.println("Fakultas\t: " + getFakultas());
        System.out.println("Gaji Pokok\t: " + printRupiah(gajiPokok));
    }
}
