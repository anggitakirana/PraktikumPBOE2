/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

//4a. Kelas rujukan CivitasAkademika
abstract class Civitasakademika {
    /* ATRIBUT */
    protected String nama;

    /* METHOD */
    // Konstruktor tanpa parameter
    protected Civitasakademika(){
        this.nama = "";
    }

    // Konstruktor dengan parameter
    protected Civitasakademika(String nama){
        this.nama = nama;
    }

    // Selektor
    public String getNama(){
        return nama;
    }

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    //4a. Fungsi getNomor
    // Operasi lainnya
    public abstract String getNomor();
}

//4a. Kelas Dosen
class Dosen extends Civitasakademika {
    /* ATRIBUT */
    private String nip;

    /* Method */
    // Konstruktor tanpa parameter
    public Dosen(){
        super();
        this.nip = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    // Selektor
    public String getNip(){
        return nip;
    }

    // Mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    //4a. Fungsi getNomor
    // Operasi lainnya
    public String getNomor(){
        return nip;
    }
}

//4a. Kelas Mahasiswa
class Mahasiswa extends Civitasakademika {
    /* ATRIBUT */
    private String nim;
    private Dosen dosenWali;

    /* Method */
    // Konstruktor tanpa parameter
    public Mahasiswa(){
        super();
        this.nim = "";
        this.dosenWali = new Dosen();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, String nim, Dosen dosenWali){
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    // Selektor
    public String getNim(){
        return nim;
    }
    
    public Dosen getDosenWali(){
        return dosenWali;
    }

    // Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    // 4i. sebuah  prosedur setWali
    public void setWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //4a. Fungsi getNomor
    // Operasi lainnya
    public String getNomor(){
        return nim;
    }

    // 4i. sebuah  prosedur tampilDataMahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + getNama());
        if (dosenWali != null) {
            System.out.println("Nama Dosenwali: " + dosenWali.getNama());
        } else {
            System.out.println("Nama Dosenwali: -");
        }
    }
}

//4b. kelas aplikator Seminar memiliki pesertas dan sebuah atribut banyakPeserta
public class Seminar {
    /* ATRIBUT */
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Seminar(){
        this.pesertas = new Civitasakademika[100];
        this.banyakPeserta = 0;
    }

    //4c. sebuah fungsi countPeserta 
    // Selektor
    public int countPeserta(){
        return banyakPeserta;
    }

    // Mutator

    //4d. sebuah prosedur registrasi
    // Operasi lainnya
    public void registrasi(Civitasakademika peserta){
        if (banyakPeserta == pesertas.length) {
            System.out.println("Banyak peserta sudah mencapai batas maksimal");
        } else {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        }
    }

    // 4g. sebuah prosedur tampilPeserta
    public void tampilPeserta(){
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". " + pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    // 4h. sebuah fungsi countMahasiswa
    public int countMahasiswa(){
        int countM = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                countM += 1;
            }
        }
        return countM;
    }

    public static void main(String[] args) {
        // Kamus
        // 4e. 2 objek dosen dan 5 objek mahasiswa
        Dosen D1;
        Dosen D2;
        Mahasiswa M1;
        Mahasiswa M2;
        Mahasiswa M3;
        Mahasiswa M4;
        Mahasiswa M5;
        Seminar seminar;

        // Algoritma
        D1 = new Dosen("Jimmy", "1406070801");
        D2 = new Dosen("Arjuna", "1406070820");
        
        M1 = new Mahasiswa("Sea", "2406012464", D1);
        M2 = new Mahasiswa("Nakula", "2406012480", D1);
        M3 = new Mahasiswa("Yudistira", "2406012490", D2);
        M4 = new Mahasiswa("Bima", "2406012425", D2);
        M5 = new Mahasiswa("Sadewa", "2406012440", D1);
        
        // 4f. Registrasi 
        seminar = new Seminar();
        seminar.registrasi(D1);
        seminar.registrasi(D2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        System.out.println("--- PRINT DETAIL PESERTA ---");
        seminar.tampilPeserta();
        System.out.println();
        System.out.println("--- JUMLAH PESERTA ---");
        System.out.println("Jumlah seluruh peserta: " + seminar.countPeserta());
        System.out.println();
        System.out.println("--- JUMLAH PESERTA MAHASISWA ---");
        System.out.println("Jumlah peserta mahasiswa: " + seminar.countMahasiswa());
        System.out.println();
        System.out.println("--- PERUBAHAN DOSENWALI ---");
        System.out.println("Dosen wali awal " + M5.getNama() + " : " +  M5.getDosenWali().getNama());
        M5.setWali(D2);
        System.out.println("Dosen wali akhir " +  M5.getNama() + " : " + M5.getDosenWali().getNama());
        System.out.println();
        System.out.println("--- PRINT DETAIL MAHASISWA ---");
        M1.tampilDataMahasiswa();
    }
}


