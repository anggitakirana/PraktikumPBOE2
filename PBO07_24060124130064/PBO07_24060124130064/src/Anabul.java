/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

public abstract class Anabul {
    /* ATRIBUT */
    private String nama;

    /* METHOD */
    // Konstruktor tanpa parameter
    protected Anabul(){
        this.nama = "";
    }

    // Konstruktor dengan parameter
    protected Anabul(String nama){
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

    // Operator lainnya
    public abstract void gerak();
    public abstract void bersuara();
}

class Kucing extends Anabul{
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor tanpa parameter
    public Kucing(){
        super();
    }

    // Konstruktor dengan parameter
    public Kucing(String nama){
        super(nama);
    }

    // Operator lainnya
    @Override
    public void gerak(){
        System.out.println("Kucing " + getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara(){
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }
}

class Anjing extends Anabul{
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor tanpa parameter
    public Anjing(){
        super();
    }

    // Konstruktor dengan parameter
    public Anjing(String nama){
        super(nama);
    }

    // Operator lainnya
    @Override
    public void gerak(){
        System.out.println("Anjing " + getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara(){
        System.out.println("Anjing " + getNama() + " bersuara guk-guk");
    }
}

class Burung extends Anabul{
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor tanpa parameter
    public Burung(){
        super();
    }

    // Konstruktor dengan parameter
    public Burung(String nama){
        super(nama);
    }

    // Operator lainnya
    @Override
    public void gerak(){
        System.out.println("Burung " + getNama() + " bergerak dengan terbang");
    }

    @Override
    public void bersuara(){
        System.out.println("Burung " + getNama() + " berbunyi cuit");
    }
}

