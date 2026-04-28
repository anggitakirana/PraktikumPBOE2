/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

public class PolimorfismeCoercion {
   public static void main(String[] args) {
      // 1a & 1b. Ilustrasi Casting dan Konversi (Coercion)
      int nilaiInt = 65;
      char nilaiChar = (char) nilaiInt; //Coercion ke char
      double nilaiDouble = (double) nilaiInt; //Coercion ke real
      int kembaliInt = (int) nilaiDouble; //Coercion ke int

      System.out.println("Nilai dalam integer: " + nilaiInt);
      System.out.println("Nilai dalam karakter: " + nilaiChar);
      System.out.println("Nilai dalam real: " + nilaiDouble);
      System.out.println("Nilai kembali ke integer: " + kembaliInt);

      // 1c
      String X = "1234";
      String Y = "5678";

      System.out.println();
      // Konkatenasi
      String S = X + Y; // Konkatenasi String
      Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); //Penjumlahan angka X dan Y
      System.out.println("Hasil nilai S(String): " + S);
      System.out.println("Hasil nilai Z(Integer): " + Z);

      System.out.println();
      // 1d
      String P = "12.34";
      String Q = "56.78";
      String R = P + Q;
      Double D = Double.parseDouble(P) + Double.parseDouble(Q);
      System.out.println("Hasil nilai R(String): " + R);
      System.out.println("Hasil nilai D(Double): " + D);

      System.out.println();
      // 1e & 1f. Konversi Lanjutan
      try {
         // S adalah "12345678", diubah ke Integer
         Integer A = Integer.valueOf(S);
         System.out.println("Objek Integer A: " + A);

         // A diubah kembali ke String T
         String T = A.toString();
         System.out.println("Objek String T: " + T);
      } catch (NumberFormatException e) {
         System.out.println("Error konversi: String S terlalu besar untuk Integer!");
      }
   }
}