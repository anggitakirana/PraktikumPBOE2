/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

public class MainMahasiswa {
    public static void main(String[] args) {
        // 2b. Aplikasi semua varian operator kelas Mahasiswa
        // 2c. Aplikasi konstruktor Mahasiswa tanpa parameter
        Mahasiswa1 m1 = new Mahasiswa1();
        System.out.println("M1 (Default): ");
        m1.tampilData();

        System.out.println();

        // 2d. Aplikasi konstruktor Mahasiswa dengan 3 parameter
        Mahasiswa1 m2 = new Mahasiswa1("24060124", "Sea", "Informatika");
        System.out.println("M2 (Input): ");
        m2.tampilData();

        System.out.println();

        // 2e. Aplikasi konstruktor Mahasiswa Kloning
        Mahasiswa1 m3 = new Mahasiswa1(m2);
        System.out.println("M3 (Kloning M2): ");
        m3.tampilData();

        System.out.println();

        System.out.println("--- Testing Overloading setProgramStudi ---");
        // Overloading varian 1: tanpa parameter
        m1.setProgramStudi();
        System.out.println("M1 setelah setProgramStudi(): ");
        m1.tampilData();

        System.out.println();

        // Overloading varian 2: parameter string
        m1.setProgramStudi("Sistem Informasi");
        System.out.println("M1 setelah setProgramStudi(String): ");
        m1.tampilData();

        System.out.println();
        // Overloading varian 3: parameter objek mahasiswa
        m1.setProgramStudi(m2);
        System.out.println("M1 setelah setProgramStudi(m2): ");
        m1.tampilData();
    }
}
