 /* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
    Tgl  : 26 April 2026
 */

// Polimorfisme Overloading
public class Mahasiswa1 {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String programStudi;

    /* METHOD */
    // Konstruktor
    // 2c. Konstruktor tanpa parameter
    public Mahasiswa1(){
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // 2d. Konstruktor dengan parameter
    public Mahasiswa1(String nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // 2e. Kontruktor Mahasiswa dengan parameter objek Mahasiswa lain
    // Hasil: objek hasil 'kloning' objek Mahasiswa input
    public Mahasiswa1 (Mahasiswa1 m){
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Selektor
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProgramStudi(){
        return programStudi;
    }

    // Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    // 2a. Atribut dan operator relevan
    // Atribut dan sebagian operator sudah disebutkan di atas
    // Polimorfisme Overloading
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa1 m){
        this.programStudi = m.programStudi;
    }

    // tampilData
    public void tampilData(){
        System.out.println(getNim() + " | " + getNama() + " | " + getProgramStudi());
    }
}
