package Pertemuan10;
import java.util.Scanner;
/**
 * PembeliMain
 */
public class PembeliMain {

    public static void menu() {
        System.out.println("-----------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian paling depan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("6. Cek posisi pembeli");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukan kapasitas antrean: ");
        int jumlah = a.nextInt();
        Pembeli antri = new Pembeli(jumlah);

        int pilih;

        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            pilih = a.nextInt();
            a.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.print("Nama        : ");
                    String nama = a.nextLine();
                    System.out.print("No HP       : ");
                    int noHP = a.nextInt();
                    Pembeli nb = new Pembeli(nama, noHP);
                    a.nextLine();
                    antri.Enqueue(nb);
                    break;

                case 2:
                    System.out.println("---------------------------");
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + "\t| " + data.noHP);
                    }
                    break;

                case 3:
                    System.out.println("---------------------------");
                    antri.peek();
                    break;

                case 4:
                    System.out.println("---------------------------");
                    antri.peekRear();
                    break;

                case 5:
                    System.out.println("---------------------------");
                    antri.daftarPembeli();
                    break;

                case 6:
                    System.out.println("---------------------------");
                    System.out.println("Masukkan nama pembeli: ");
                    String namaPembeli = a.nextLine();
                    antri.peekPosition(namaPembeli);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}