package Pertemuan2;

/**
 * BukuMain26
 */
public class BukuMain26 {

    public static void main(String[] args) {
        Buku26 bk1 = new Buku26();
        bk1.judul = "Today Ends Tomorrows Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku26 bk2 = new Buku26("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku26 bukuSatriyo = new Buku26("Algoritma dan Struktur Data", "Satriyo Bagus Susianto", 123, 12, 55000);
        bukuSatriyo.terjual(6);
        bukuSatriyo.tampilInformasi();
        bukuSatriyo.hitungHargaTotal(6);
        bukuSatriyo.hitungDiskon(6);
        bukuSatriyo.hitungHargaBayar(6);
        System.out.println();
    }
}