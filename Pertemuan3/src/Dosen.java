public class Dosen {
    /********* ATRIBUT *********/ 
    private String nip;
    private String nama;
    private String prodi;
    
    /********* METHOD *********/
    // konstruktor tanpa parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // setter
    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdString(){
        return prodi;
    }

    // mutator
    public void setNIP(String nipDosen){
        nip = nipDosen;
    }

    public void setNama(String namaDosen){
        nama = namaDosen;
    }

    public void setProdi(String prodiDosen){
        prodi = prodiDosen;
    }
}   
