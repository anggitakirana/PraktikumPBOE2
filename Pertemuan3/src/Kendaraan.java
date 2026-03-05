public class Kendaraan {
    /********* ATRIBUT *********/ 
    private String noPlat;
    private String jenis;

    /********* METHOD *********/
    // konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // setter
    public String getnoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    // mutator
    public void setnoPlat(String no_Plat) {
        noPlat = no_Plat;
    }

    public void setJenis(String jenis_Kend) {
        jenis = jenis_Kend;
    }

}
