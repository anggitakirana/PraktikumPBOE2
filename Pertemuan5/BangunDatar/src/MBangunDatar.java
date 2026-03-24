/**
 * File : Main.java
 * deskripsi : Program untuk membuat Main untuk BangunDatar dan anak-anaknya
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */


public class MBangunDatar {
    public static void main(String[] args)
    {   
        // BangunDatar B1 = new BangunDatar();
        // Demo Persegi
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        System.out.println("\n============ INFORMASI PERSEGI 1===============");
        P1.warna = "Merah";
        P1.border = "Hitam";
        P1.printInfo();

        System.out.println("\n============ INFORMASI PERSEGI 2===============");
        P2.warna = "Biru";
        P2.border = "Ungu";
        P2.printInfo();

        System.out.println("\n============ INFORMASI LINGKARAN 1===============");
        L1.warna = "Biru";
        L1.border = "Putih";
        L1.printInfo();

        System.out.println("\n============ INFORMASI LINGKARAN 2===============");
        L2.warna = "Merah";
        L2.border = "Putih";
        L2.printInfo();

        System.out.println("\n============ CEK LUAS P1 DAN L1 ===============");
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Luas L1: " + L1.getLuas());

        System.out.println("Apakah Luas P1 == L1? " + P1.isEqualLuas(L1));

        System.out.println("\n============ CEK KELILING P2 DAN L2 ===============");
        System.out.println("Keliling P2: " + P2.getKeliling());
        System.out.println("Keliling L2: " + L2.getKeliling());

        System.out.println("Apakah Keliling P2 == L2? " + P2.isEqualKeliling(L2));

        System.out.println("\n============ SISI P2 BEFORE AFTER zoomIN ===============");
        System.out.println("Sisi P2 awal: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("Sisi P2 setelah zoomIn: " + P2.getSisi());

        
    }
}
