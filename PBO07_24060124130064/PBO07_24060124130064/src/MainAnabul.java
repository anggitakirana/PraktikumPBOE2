/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

public class MainAnabul {
    public static void main(String[] args) {
        // Kamus
        Anabul K;
        Anabul A;
        Anabul B;

        // Algoritma
        System.out.println("--- PRINT DETAIL KUCING ---");
        K = new Kucing("Mpus");
        K.bersuara();
        K.gerak();

        System.out.println();

        System.out.println("--- PRINT DETAIL ANJING ---");
        A = new Anjing("Hanky");
        A.bersuara();
        A.gerak();

        System.out.println();
        
        System.out.println("--- PRINT DETAIL BURUNG ---");
        B = new Burung("Kicau Mania");
        B.bersuara();
        B.gerak();
    }
}
