import java.time.LocalDate;
import java.time.Period;

/**
 * File : PNS.java
 * deskripsi : Program untuk membuat class PNS 
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public class PNS extends Manusia implements Pajak{
    /* ATRIBUT */
    private String nip;
    private static int counterPNS;
    
    /* METHOD */
    // Konstruktor
    public PNS(String nama, String tanggalMulaiKerja, String alamat, double pendapatan, String NIP){
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.nip = NIP;
        counterPNS++;
    }
    // Selektor
    public String getNIP(){
        return nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    // Mutator
    public void setNIP(String NIP){
        this.nip = NIP;
    }

    // method lainnya
    @Override
    public int hitungMasaKerja(){
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());

        int selisihTahun = masaKerja.getYears();
        return selisihTahun + 4;
    }

    @Override
    public double hitungPajak(){
        return 0.01 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        System.out.println("Nama\t: " + getNama());
        System.out.println("Tanggal Mulai Kerja\t: " + formatTanggal(getTanggalMulaiKerja()));
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Pendapatan\t: " + printRupiah(getPendapatan()));
        System.out.println("NIP\t: " + getNIP());
    }

}
