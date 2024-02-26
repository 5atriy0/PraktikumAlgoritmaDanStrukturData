package Jobsheet3;

import java.util.Scanner;

/**
 * BangunRuang
 */
public class BangunRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBangunRuang = 3;

        Object[] bangunRuang = new Object[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Bangun Ruang ke-" + (i+1) + ":");
            System.out.print("1. Kerucut\n2. Limas Segi Empat\n3. Bola\nPilih Bangun Ruang: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan jari-jari:");
                    double jariJariKerucut = input.nextDouble();
                    System.out.println("Masukkan sisi miring:");
                    double sisiMiringKerucut = input.nextDouble();
                    bangunRuang[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                    break;
                case 2:
                    System.out.println("Masukkan panjang sisi alas:");
                    double panjangSisiAlasLimas = input.nextDouble();
                    System.out.println("Masukkan tinggi limas:");
                    double tinggiLimas = input.nextDouble();
                    bangunRuang[i] = new Limas(panjangSisiAlasLimas, tinggiLimas);
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari:");
                    double jariJariBola = input.nextDouble();
                    bangunRuang[i] = new Bola(jariJariBola);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    i--;
                    break;
            }
        }

        for (int i = 0; i < jumlahBangunRuang; i++) {
            if (bangunRuang[i] instanceof Kerucut) {
                Kerucut kerucut = (Kerucut) bangunRuang[i];
                System.out.println("Luas permukaan kerucut: " + kerucut.hitungLuasPermukaan());
                System.out.println("Volume kerucut: " + kerucut.hitungVolume());
            } else if (bangunRuang[i] instanceof Limas) {
                Limas limas = (Limas) bangunRuang[i];
                System.out.println("Luas permukaan limas segi empat: " + limas.hitungLuasPermukaan());
                System.out.println("Volume limas segi empat: " + limas.hitungVolume());
            } else if (bangunRuang[i] instanceof Bola) {
                Bola bola = (Bola) bangunRuang[i];
                System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
                System.out.println("Volume bola: " + bola.hitungVolume());
            }
        }

        input.close();
    
    }
}