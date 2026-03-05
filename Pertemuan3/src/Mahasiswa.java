import java.util.ArrayList;

public class Mahasiswa {
    /********* ATRIBUT *********/ 
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /********* METHOD *********/
    // konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // setter
    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // mutator
    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // addMatkul
    public void addMatkul(MataKuliah mataKuliah){
        listMatkul.add(mataKuliah);
    }

    // getJumlahSKS
    public int getJumlahSKS(){
        int sum = 0;
        for (int i = 0; i < listMatkul.size(); i++){
            sum += listMatkul.get(i).getSKS();
        }
        return sum;
    }

    // getJumlahMatKul
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    // printMhs
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // printDetailMhs
    public void printDetailMhs() {
        System.out.println("NIM Mahasiswa : " + nim);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi : " + prodi);

        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatkul.get(i).getNamaMataKuliah());
        }
    }
}
