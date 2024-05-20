package Pertemuan14Kuis2;

/**
 * Node
 */
public class Node {

    String nama;
    int poin;
    int pertandingan;
    int menang;
    int seri;
    int kalah;
    int golMasuk;
    int golKebobolan;
    int selisihGol;
    Node next;

    Node(String nama, int pertandingan, int menang, int seri, int kalah, int poin, int golMasuk, int golKebobolan, int selisihGol, Node berikutnya) {
        this.nama = nama;
        this.pertandingan = pertandingan;
        this.menang = menang;
        this.seri = seri;
        this.kalah = kalah;
        this.poin = poin;
        this.golMasuk = golMasuk;
        this.golKebobolan = golKebobolan;
        this.selisihGol = selisihGol;
        next = berikutnya;
    }
}