package Piaraan;

/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/
public class MainPiaraan {
    public static void main(String[] args) {
        // Kamus
        Piaraan p;
        Kucing k1;
        Kucing k2;
        Kucing k3;

        // Algoritma
        p = new Piaraan();
        k1 = new Kucing("Meng", 8.0);
        k2 = new Kucing("Mpus", 5.8);
        k3 = new Kucing("Ming", 9.0);

        System.out.println("============ TAMBAH ANABUL KE ANTREAN PIARAAN ============");
        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(k3);
        p.showAnabul();
        System.out.println();

        System.out.println("============ PRINT BANYAK PIARAAN ============");
        System.out.println("Banyak piaraan: " + p.getNbelm());
        System.out.println();

        System.out.println("============ CEK KEANGGOTAAN ANABUL (ADA/TIDAK) ============");
        System.out.print("Cek ada anabul bernama " + k1.getNama() + "?: ");
        if (p.isMember(k1)) {
            System.out.println("Ya, ada piaraan anabul tersebut");
        } else {
            System.out.println("Tidak ada piaraan anabul tersebut");
        }

        // System.out.println("============ AMBIL DATA ANABUL PERTAMA DALAM ANTREAN ============");
        // System.out.println("Anabul yang diambil dari antrean piaraan: ");
        p.getAnabul();
        System.out.println();
        
        // System.out.println("============ KELUARKAN DATA ANABUL PERTAMA DALAM ANTREAN ============");
        p.dequeueAnabul();

        System.out.println("============ ANTREAN PIARAAN SETELAH DEQUEUE ============");
        p.showAnabul();
        System.out.println();

        System.out.println("============ PRINT BANYAK KUCING DALAM ANTREAN ============");
        System.out.println("Banyak kucing: " + p.countKucing());
        System.out.println();

        System.out.println("============ PRINT TOTAL BOBOT KUCING DALAM ANTREAN ============");
        System.out.println("Banyak kucing: " + p.bobotKucing());
        System.out.println();

        System.out.println("============ PRINT PIARAAN DENGAN JENIS OBJEKNYA ============");
        p.showJenisAnabul();

    }   
}
