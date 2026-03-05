public class MataKuliah {
    /********* ATRIBUT *********/ 
    private String idMatkul;
    private String nama;
    private int sks;

    /********* METHOD *********/
    // konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    // konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // setter
    public String getidMatkul(){
        return idMatkul;
    }

    public String getNamaMataKuliah(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    // mutator
    public void setidMatkul(String id_Matkul) {
        idMatkul = id_Matkul;
    }

    public void setNama(String nama_Matkul) {
        nama = nama_Matkul;
    }

    public void setSKS(int sks_Matkul) {
        sks = sks_Matkul;
    }
}
