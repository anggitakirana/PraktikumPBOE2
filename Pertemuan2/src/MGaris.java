/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menjalankan class Titik
 * Pembuat      : Anggita Kirana Puspa
 * Tanggal      : 27 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G1 = new Garis(T1, T2);

        Titik T3 = new Titik(0, 0);
        Titik T4 = new Titik(7, -9);
        Garis G2 = new Garis(T3, T4);

        System.out.println("======= Hasil getTitikAwal =======");
        System.out.print("T1 dari G1: ");
        G1.getTitikAwal().printTitik();
        
        System.out.println("======= Hasil setTitikAwal =======");
        System.out.print("Set titik awal G1: ");
        Titik Tawal = new Titik(-3,4);
        G1.setTitikAwal(Tawal);
        G1.getTitikAwal().printTitik();

        System.out.println("======= Hasil getTitikAkhir =======");
        System.out.print("T2 dari G1: ");
        G1.getTitikAkhir().printTitik();

        System.out.println("======= Hasil setTitikAkhir =======");
        System.out.print("Set titik akhir G1: ");
        Titik Takhir = new Titik(4,-5);
        G1.setTitikAkhir(Takhir);
        G1.getTitikAkhir().printTitik();

        System.out.println("======= Hasil getCounterGaris =======");
        System.out.println("Get counter garis: " + Garis.getCounterGaris());

        System.out.println("======= Hasil getPanjang =======");
        System.out.println("Panjang Garis G1: " + G1.getPanjang());

        System.out.println("======= Hasil getGradien =======");
        System.out.println("Gradien Garis G1: " + G1.getGradien());

        System.out.println("======= Hasil getTitikTengah =======");
        System.out.print("Titik Tengah G1: ");
        G1.getTitikTengah().printTitik();

        System.out.println("======= Hasil isSejajar =======");
        System.out.print("Apakah G1 sejajar dengan G2: ");
        if (G1.isSejajar(G2)) {
            System.out.println("G1 sejajar dengan G2");
        } else {
            System.out.println("G1 tidak sejajar dengan G2");
        }

        System.out.println("======= Hasil isTegakLurus =======");
        System.out.println("Apakah G1 tegak lurus dengan G2: ");
        if (G1.isTegakLurus(G2)) {
            System.out.println("G1 tegak lurus dengan G2");
        } else {
            System.out.println("G1 tidak tegak lurus dengan G2");
        }

        System.out.println("======= Hasil printGaris =======");
        System.out.print("Print G1: ");
        G1.printGaris();
        System.out.print("Print G2: ");
        G2.printGaris();

        System.out.println("======= Hasil getPersamaanGaris =======");
        System.out.println("Persamaan Garis G1: " + G1.getPersamaanGaris());
        System.out.println("Persamaan Garis G2: " + G2.getPersamaanGaris());
    }
}