/**
 * File : MainPegawai.java
 * deskripsi : Program untuk membuat main untuk Pegawai
 * nama : Anggita Kirana Puspa
 * tanggal : 16 Maret 2026
 */
import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", 
            "78647324", 
            "Andi", 
            LocalDate.of(1990,5,5), 
            LocalDate.of(2015, 1, 1), 
            5000000, 
            "Fakultas Sains dan Matematika"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "1999041313",
            "11223344", 
            "Sea Nalendra", 
            LocalDate.of(1999,4,13),
            LocalDate.of(2015, 4, 1), 
            LocalDate.of(2030, 3, 2), 
            2000000, 
            "Fakultas Ekonomi dan Bisnis"
        );

        Tendik tendik = new Tendik(
            "1998121212", 
            "Nakula Yogendra", 
            LocalDate.of(1998,12,12), 
            LocalDate.of(2017,3,15), 
            1500000, 
            "Akademik"
        );

        System.out.println("===== DOSEN TETAP =====");
        dosenTetap.printInfo();

        System.out.println("\n===== DOSEN TAMU =====");
        dosenTamu.printInfo();

        System.out.println("\n===== TENDIK =====");
        tendik.printInfo();
    }
}
