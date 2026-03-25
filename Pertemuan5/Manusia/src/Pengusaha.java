import java.time.LocalDate;
import java.time.Period;

/**
 * File : Pengusaha.java
 * deskripsi : Program untuk membuat class Pengusaha
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public class Pengusaha extends Manusia implements Pajak{
    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Pengusaha(){
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    // Konstruktor dengan parameter
    public Pengusaha (String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String NPWP){
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.npwp = NPWP;
        counterPengusaha++;
    }

    // Selektor
    public String getNPWP(){
        return npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // Mutator
    public void setNPWP(String NPWP){
        this.npwp = NPWP;
    }

    // method lainnya
    @Override
    public int hitungMasaKerja(){
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());

        int selisihTahun = masaKerja.getYears();
        return selisihTahun + 6;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP\t: " + getNPWP());
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
        System.out.println("Pajak\t: " + hitungPajak());
    }
}
