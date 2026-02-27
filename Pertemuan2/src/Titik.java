/*  Nama File   : Titik.java
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Anggita Kirana Puspa
    Tanggal     : 27 Februari 2026
*/
public class Titik {
    /****************** ATRIBUT ******************/ 
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /****************** METHOD ******************/
    // konstruktor untuk membuat titik (0,0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
      this.absis = absis;
      this.ordinat = ordinat;
      counterTitik++;
   }
 

    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // menghasilkan kuadran dari suatu titik
    public int getKuadran() {
        int kuad = 0;
        if (absis > 0 && ordinat > 0) {
            kuad = 1;
        } else if (absis > 0 && ordinat < 0) {
            kuad = 2;
        } else if (absis < 0 && ordinat < 0) {
            kuad = 3;
        } else if (absis > 0 && ordinat < 0) {
            kuad = 4;
        }
        return kuad;
    }

    // menghasilkan jarak suatu titik ke pusat  (0,0)
    public double getJarakPusat() {
        double jarak;
        jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }

    // menghasilkan jarak suatu titik dengan titik lainnya
    public double getJarak(Titik T) {
        double jarakPusat;
        double selisihAbsis = absis - T.absis;
        double selisihOrdinat = ordinat - T.ordinat;
        jarakPusat = Math.sqrt(Math.pow(selisihAbsis, 2) + Math.pow(selisihOrdinat, 2));
        return jarakPusat;
    }

    // mengubah titik hasil refleksi dengan sumbu X
    public void refleksiX() {
        ordinat = ordinat * -1;
    }

    // mengubah titik hasil refleksi dengan sumbu Y
    public void refleksiY() {
        absis = absis * -1;
    }

    // menghasilkan titik baru hasil refleksi dengan sumbu X
    public Titik getRefleksiX(){
        Titik T1 = new Titik();
        T1.setOrdinat(-1*ordinat);
        T1.setAbsis(absis);
        return T1;
    }

    // menghasilkan titik baru hasil refleksi dengan sumbu Y
    public Titik getRefleksiY(){
        Titik T1 = new Titik();
        T1.setAbsis(-1 * absis);
        T1.setOrdinat(ordinat);
        return T1;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class Titik