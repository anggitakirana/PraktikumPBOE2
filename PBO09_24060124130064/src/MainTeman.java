/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

public class MainTeman {
    public static void main(String[] args) {
        // Kamus
        Teman teman;
        String nama;
        String namabaru;

        // Algoritma
        teman = new Teman();

        teman.addNama("Anggi");
        teman.addNama("Kirana");
        teman.addNama("Mingming");
        teman.addNama("Mengmeng");
        teman.addNama("Puspa");
        teman.addNama("Sea");
        
        System.out.println("============ PRINT BANYAK TEMAN ============");
        System.out.println("Banyak teman: " + teman.getNbelm());
        System.out.println();

        System.out.println("============ UBAH NAMA TEMAN Ber.Indeks============");
        System.out.println("--- Teman sebelum ada perubahan");
        teman.showTeman();
        // Ubah nama indeks ke-4 menjadi Jimmu
        System.out.println();
        namabaru = "Jimmu";
        teman.setNama(4, namabaru);
        System.out.println("--- Teman setelah ada perubahan pada indeks ke - 4");
        teman.showTeman();
        System.out.println();
        
        System.out.println("============ DELETE NAMA TEMAN ============");
        System.out.println("--- Teman sebelum ada delete");
        teman.showTeman();
        // Delete nama Anggi
        System.out.println();
        nama = "Anggi";
        teman.delNama("Anggi");
        System.out.println("--- Teman setelah ada delete");
        teman.showTeman();

        System.out.println();
        System.out.println("============ CEK KEANGGOTAAN NAMA TEMAN (ADA/TIDAK) ============");
        nama = "Jimmu";
        System.out.print("Cek ada teman bernama " + nama + "?: ");
        if (teman.isMember(nama)) {
            System.out.println("Ya, ada teman yang memiliki nama tersebut");
        } else {
            System.out.println("Tidak ada teman yang memiliki nama tersebut");
        }

        System.out.println();
        System.out.println("============ UBAH NAMA TEMAN BERDASARKAN NAMA ============");
        System.out.println("--- Teman sebelum ada perubahan");
        teman.showTeman();
        // Ubah nama Kirana menjadi Ran
        System.out.println();
        nama = "Sea";
        namabaru = "Kirana";
        teman.gantiNama(nama, namabaru);
        System.out.println("--- Teman setelah ada perubahan pada nama");
        teman.showTeman();
        System.out.println();

        System.out.println();
        System.out.println("============ HITUNG TEMAN BERDASARKAN BANYAK NAMA TERTENTU ============");
        nama = "Kirana";
        System.out.println("Banyak teman bernama " + nama + ": " + teman.countNama(nama));
        System.out.println();

        System.out.println("============ TAMPILKAN TEMAN HASIL AKHIR ============");
        teman.showTeman();
    }
}
