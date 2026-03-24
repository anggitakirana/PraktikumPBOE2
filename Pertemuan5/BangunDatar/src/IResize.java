/**
 * File : IResize.java
 * deskripsi : Program untuk membuat interface IResize
 * nama : Anggita Kirana Puspa
 * nim : 24060124130064
 * tanggal : 24 Maret 2026
 */

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
    
}
