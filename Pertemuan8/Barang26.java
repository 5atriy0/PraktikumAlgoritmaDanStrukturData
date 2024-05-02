package Pertemuan8;

/**
 * Barang26
 */
public class Barang26 {

    int kode;
    String nama;
    String kategori;

    public Barang26(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }

    public void tampilDataBarang() {
        System.out.print("kode     : " + kode);
        System.out.print("nama     : " + nama);
        System.out.print("kategori : " + kategori);
    }
}