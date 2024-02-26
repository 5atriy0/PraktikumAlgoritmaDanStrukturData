package Jobsheet3;
import java.util.Scanner;
/**
 * MahasiswaMain
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa = 3;
        Mahasiswa[] dataMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan nim: ");
            String nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = input.nextLine().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            dataMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("nama : " + dataMahasiswa[i].nama);
            System.out.println("nim : " + dataMahasiswa[i].nim);
            System.out.println("Jenis kelamin : " + dataMahasiswa[i].jenisKelamin);
            System.out.println("Nilai IPK : " + dataMahasiswa[i].ipk);
        }

        input.close();
    }
}