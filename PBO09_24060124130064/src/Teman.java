/* NIM  : 24060124130064
   Nama :Anggita Kirana Puspa
   Tgl  : 26 April 2026
*/

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /* ATRIBUT */
    private int nbelm;
    private List<String> Lnama;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // a.
    public int getNbelm(){
        return this.nbelm;
    }

    // b.
    public String getNama (int indeks) {
        return this.Lnama.get(indeks);
    }

    // c.
    public void setNama (int indeks, String nama) {
        this.Lnama.set(indeks, nama);
    }

    // d.
    public void addNama (String nama) {
        this.Lnama.add(nama);
        this.nbelm ++;
    }

    // e.
    public void delNama (String nama) {
        this.Lnama.remove(nama);
        this.nbelm --;
    } 

    // f.
    public boolean isMember (String nama) {
        return this.Lnama.contains(nama);
    }

    // g.
    public void gantiNama (String nama, String namaBaru){
        if (!isMember(nama)) {
            throw new IllegalArgumentException("Tidak ada nama dalam list nama");
        } else {
            int idx = this.Lnama.indexOf(nama);
            this.Lnama.set(idx, namaBaru);
        }
    }

    // h.
    public int countNama (String nama) {
        int count = 0;
        for(String n: this.Lnama){
            if (n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    // i.
    public void showTeman(){
        System.out.println("Daftar Teman:");

        for (String nama : this.Lnama){
            System.out.println(nama);
        }
    }
}
