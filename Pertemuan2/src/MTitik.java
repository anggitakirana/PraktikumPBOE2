/*  Nama File   : MTitik.java
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Anggita Kirana Puspa
    Tanggal     : 19 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik();
        Titik T3 = new Titik();
        Titik T4 = new Titik();

        System.out.println("======= Hasil SetAbsis dan SetOrdinat =======");
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        System.out.println("T1: ");
        T1.printTitik(); //mencetak koordinat T1 ke layar

        System.out.println("======= Hasil Geser Titik =======");
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        System.out.println("T1: ");
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        System.out.println("======= Hasil getKuadran =======");
        int kuad = T1.getKuadran(); //menghasilkan kuadran dari titik T1
        System.out.println("T1 berada di kuadran " + kuad);
        
        double jarak1 = T1.getJarakPusat();
        System.out.println("======= Hasil getJarakPusat ======="); 
        System.out.println("Jarak T1 ke pusat: " + jarak1);

        System.out.println("======= Hasil getJarak =======");
        System.out.println("---SetAbsis dan SetOrdinat T2---");
        T2.setAbsis(5); 
        T2.setOrdinat(6); //mengubah ordinat T1 dengan nilai 4
        System.out.println("T2: ");
        T2.printTitik(); 
        double jarak2 = T1.getJarak(T2);
        System.out.println("Jarak T1 ke T2: " + jarak2);

        System.out.println("======= Hasil refleksiX =======");
        T1.refleksiX();
        System.out.println("T1: ");
        T1.printTitik();

        System.out.println("======= Hasil refleksiY =======");
        T2.refleksiY();
        System.out.println("T2: ");
        T2.printTitik();

        System.out.println("======= Hasil getRefleksiX =======");
        T3 = T1.getRefleksiX();
        System.out.println("T3 hasil refleksi sb X dari T1: ");
        T3.printTitik();

        System.out.println("======= Hasil getRefleksiY =======");
        T4 = T2.getRefleksiY();
        System.out.println("T4 hasil refleksi sb Y dari T2: ");
        T4.printTitik();

    }
}