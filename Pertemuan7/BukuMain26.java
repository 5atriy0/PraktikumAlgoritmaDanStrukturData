package Pertemuan7;

import java.util.Scanner;

/**
 * BukuMain26
 */
public class BukuMain26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Buku26[] dataBuku = new Buku26[5];
        int jumBuku = 5;

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku26 m = new Buku26(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            dataBuku[i] = m;
        }

        System.out.println("----------------------------------------------------");
        for (Buku26 buku : dataBuku) {
            buku.tampilDataBuku();
        }

        // System.out.println("____________________________________________________");
        // System.out.println("____________________________________________________");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Kode Buku yang dicari : ");
        // System.out.println("Kode Buku : ");
        // int cari = s.nextInt();
        // System.out.println("Menggunakan Sequential Search");
        // int posisi = buku.FindSeqSearch(cari);
        // data.Tampilposisi(cari, posisi);
        // data.TampilData(cari, posisi);

        // System.out.println("=========================");
        // System.out.println("Menggunakan Binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        // data.Tampilposisi(cari, posisi);
        // data.TampilData(cari, posisi);
    }
}