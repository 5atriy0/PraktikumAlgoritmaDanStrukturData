package Pertemuan8;
import java.util.Scanner;
/**
 * Utama26
 */
public class Utama26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gudang26 gudang = new Gudang26(7);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Ubah kapasitas gudang");
            System.out.println("6. Lihat barang terbawah");
            System.out.println("7. Cari barang");
            System.out.println("8. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang26 barangBaru = new Barang26(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatTeratas();
                    break;

                case 5:
                    System.out.print("Masukkan kapasitas baru gudang: ");
                    int kapasitasBaru = scanner.nextInt();
                    gudang.ubahKapasitas(kapasitasBaru);
                    break;

                case 6:
                    gudang.lihatTerbawah();
                    break;

                case 7:
                    System.out.print("Masukkan kode: ");
                    int kodeBarang = scanner.nextInt();
                    gudang.cariBarang(kodeBarang);
                    break; 

                case 8:
                    break;

            
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}