import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * File : MManusia.java
 * deskripsi : Program untuk membuat MManusia
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public class MManusia {
    public static void main(String[] args) {
        // Inisialisasi objek sesuai contoh modul
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", new Locale("id", "ID")); 
        PNS p1 = new PNS("Satriyo", LocalDate.parse("01-04-2006", formatter), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.parse("01-01-2000", formatter), "Jl. Air", 55000000, "2000-556-773-212");
        Petani pt1 = new Petani("Nugraha", LocalDate.parse("09-01-1977", formatter), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.parse("01-04-2010", formatter), "Tembalang", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Mencetak jumlah static counter 
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println();

        // Menampilkan pajak 
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Pajak PNS p2 = " + p2.hitungPajak());
        System.out.println();

        // Menampilkan masa kerja
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("Masa Kerja p2 = " + p2.hitungMasaKerja());
        System.out.println();

        // Menampilkan informasi lengkap
        System.out.println("=== Detail Informasi I ===");
        p1.cetakInfo();
        System.out.println();
        System.out.println("=== Detail Informasi II ===");
        pe1.cetakInfo();
        System.out.println();
        System.out.println("=== Detail Informasi III ===");
        pt1.cetakInfo();
        System.out.println();
        System.out.println("=== Detail Informasi IV ===");
        p2.cetakInfo();
    }
}
