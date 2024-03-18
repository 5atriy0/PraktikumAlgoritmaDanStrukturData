package Jobsheet3;

import java.util.Scanner;

/**
 * BangunRuangMain
 */
public class BangunRuangMain {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int pilihan;

        System.out.print("1. Kerucut\n2. Limas Segi Empat Sama Sisi\n3. Bola\nPilih Nomor: ");
        pilihan = a.nextInt();

        switch (pilihan) {
            case 1:
            Kerucut[] krKerucut = new Kerucut[3];

            System.out.print("Masukkan jumlah kerucut: ");
            int jumlahKerucut = a.nextInt();
            System.out.println("===========================");
            for (int i = 0; i < jumlahKerucut; i++) {
                krKerucut[i] = new Kerucut();
                System.out.println("Kerucut ke-" + (i+1));
                System.out.print("Masukkan jari-jari: ");
                krKerucut[i].jariJari = a.nextInt();
                System.out.print("Masukkan sisi miring: ");
                krKerucut[i].sisiMiring = a.nextInt();
                System.out.println("===========================");
            }

            for(int i = 0; i < jumlahKerucut; i++) {
                System.out.println("Kerucut ke-" + (i+1));
                System.out.println("Luas permukaan: " + krKerucut[i].hitungLuasPermukaan() + "\nVolume: " + krKerucut[i].hitungVolume());
                System.out.println("===========================");
            }
            break;
                
            case 2:
            Limas[] lmLimas = new Limas[3];

            System.out.print("Masukkan jumlah limas: ");
            int jumlahLimas = a.nextInt();
            System.out.println("===========================");
            for (int i = 0; i < jumlahLimas; i++) {
                lmLimas[i] = new Limas();
                System.out.println("Kerucut ke-" + (i+1));
                System.out.print("Masukkan tinggi limas: ");
                lmLimas[i].tinggiLimas = a.nextInt();
                System.out.print("Masukkan panjang alas: ");
                lmLimas[i].panjangAlas = a.nextInt();
                System.out.println("===========================");
            }

            for(int i = 0; i < jumlahLimas; i++) {
                System.out.println("Kerucut ke-" + (i+1));
                System.out.println("Luas permukaan: " + lmLimas[i].hitungLuasPermukaan() + "\nVolume: " + lmLimas[i].hitungVolume());
                System.out.println("===========================");
            }
            break;

            case 3:
            Bola[] blBola = new Bola[3];

            System.out.print("Masukkan jumlah bola: ");
            int jumlahBola = a.nextInt();
            System.out.println("===========================");
            for (int i = 0; i < jumlahBola; i++) {
                blBola[i] = new Bola();
                System.out.println("Bola ke-" + (i+1));
                System.out.print("Masukkan jari-jari: ");
                blBola[i].jariJari = a.nextInt();
                System.out.println("===========================");
            }

            for(int i = 0; i < jumlahBola; i++) {
                System.out.println("Bola ke-" + (i+1));
                System.out.println("Luas permukaan: " + blBola[i].hitungLuasPermukaan() + "\nVolume: " + blBola[i].hitungVolume());
                System.out.println("===========================");
            }
            break;
        
            default:
                break;
        }
    }
}