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
    // Konstruktor tanpa parameter
    public PNS (){
        super();
        this.nip = "";
        counterPNS++;
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String NIP){
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
        return 0.10 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP\t: " + getNIP());
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
        System.out.println("Pajak\t: " + hitungPajak());
    }

}
