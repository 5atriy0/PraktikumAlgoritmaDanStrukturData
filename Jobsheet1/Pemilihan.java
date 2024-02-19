package Jobsheet1;

import java.util.Scanner;

/**
 * Pemilihan
 */
public class Pemilihan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilaiTgs, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String konversi;

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai TUGAS  : ");
        nilaiTgs = scan.nextInt();
        System.out.print("Masukkan Nilai KUIS   : ");
        nilaiKuis = scan.nextInt();
        System.out.print("Masukkan Nilai UTS    : ");
        nilaiUTS = scan.nextInt();
        System.out.print("Masukkan Nilai UAS    : ");
        nilaiUAS = scan.nextInt();

        if (nilaiTgs<=100 && nilaiKuis<=100 && nilaiUTS<=100 && nilaiUAS<=100) {
            nilaiAkhir = ((nilaiTgs*0.2) + (nilaiKuis*0.2) + (nilaiUTS*0.3) + (nilaiUAS*0.3));
            
            if (nilaiAkhir>80){
                konversi = "A";
            } else if (nilaiAkhir>73){
                konversi = "B+";
            } else if (nilaiAkhir>65){
                konversi = "B";
            } else if (nilaiAkhir>60){
                konversi = "C+";
            } else if (nilaiAkhir>50){
                konversi = "C";
            } else if (nilaiAkhir>39){
                konversi = "D";
            } else {
                konversi = "E";
            }

            System.out.println("==============================");
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
            System.out.println("Nilai Huruf     : " + konversi);
            System.out.println("==============================");

            if (nilaiAkhir>50){
                System.out.println("Selamat Anda LULUS ");
            } else {
                System.out.println("Anda TIDAK LULUS ");
            }

        } else {
            System.out.println("Nilai Anda Tidak Valid ");

        }
    }
}