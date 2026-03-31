/**
 * File : Asersi2.java
 * deskripsi : Program untuk demo asersi, yang akan menolak input
 *              jari-jari lingkaran yang bernilai nol
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 31 Maret 2026
 */

// class Lingkaran
class Lingkaran2{
    private double jariJari;
    public Lingkaran2(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        // kurang tepat karena assert hanya untuk kondisi yang tidak boleh terjadi
        // sama sekali (bukan dari input user)
        // jari2 bisa berasal dari input user / data luar
        // ketika jari2 <=0 : kondisi harus ditangani, bukan bug

        // Asersi akan menghentikan program disini karena jari - jari = 0
        assert(jariJari > 0) : "jari-jari tidak boleh nol!!!";
        
        Lingkaran2 l = new Lingkaran2(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
