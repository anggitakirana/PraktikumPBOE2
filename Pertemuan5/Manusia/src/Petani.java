import java.time.LocalDate;
import java.time.Period;

/**
 * File : Pengusaha.java
 * deskripsi : Program untuk membuat class Pengusaha
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public class Petani extends Manusia implements Pajak{
    /* ATRIBUT */
    private String asal_kota;
    private static int counterPetani;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Petani () {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String asalKota){
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.asal_kota = asalKota;
        counterPetani++;
    }
    
    // Selektor
    public String getAsalKota(){
        return asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    // Mutator
    public void setAsalKota(String AsalKota){
        this.asal_kota = AsalKota;
    }

    // method lainnya
    @Override
    public int hitungMasaKerja(){
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());

        int selisihTahun = masaKerja.getYears();
        return selisihTahun + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota\t: " + getAsalKota());
        System.out.println("Masa Kerja\t: " + hitungMasaKerja());
        System.out.println("Pajak\t: " + hitungPajak());
    }
}
