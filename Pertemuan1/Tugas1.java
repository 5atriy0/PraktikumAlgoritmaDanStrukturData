package Pertemuan1;
import java.util.Scanner;
/**
 * Tugas1
 */
public class Tugas1 {
    public static void main(String[] args) {

     char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

     char[][] KOTA = {
             { 'B', 'A', 'N', 'T', 'E', 'N' },
             { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
             { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
             { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
             { 'B', 'O', 'G', 'O', 'R' },
             { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
             { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
             { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
             { 'M', 'A', 'L', 'A', 'N', 'G' },
             { 'T', 'E', 'G', 'A', 'L' }
     };

     Scanner scan = new Scanner(System.in);

     System.out.print("Masukkan kode plat mobil: ");
     char input = scan.next().toUpperCase().charAt(0);

     boolean found = false;
     for (int i = 0; i < KODE.length && !found; i++) {
         if (KODE[i] == input) {
             System.out.println("Nama kota: " + String.valueOf(KOTA[i]));
             found = true;
         }
     }

     if (!found) {
         System.out.println("Kode plat mobil tidak ditemukan.");
        }
     }
}