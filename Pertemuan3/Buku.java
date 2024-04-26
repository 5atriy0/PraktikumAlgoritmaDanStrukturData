package Pertemuan3;

/**
 * Buku
 */
public class Buku {

    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Konstruktor pertama
    public Buku() {
        judul = "Thor";
        pengarang = "Satriyo";
        tahunTerbit = 2024;
    }

    // Konstruktor kedua
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
}