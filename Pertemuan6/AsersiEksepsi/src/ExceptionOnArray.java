/**
 * File : ExceptionOnArray.java
 * deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 31 Maret 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
