package Pertemuan1;
import java.util.Scanner;
/**
 * Perulangan
 */
public class Perulangan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        long nim = scan.nextLong();

        long duaDigit = nim%100;

        if (duaDigit<10){
            duaDigit+=10;
        }

        System.out.println("batas n = " + duaDigit);

        for (int i=1; i <= duaDigit; i++){
            if (i==6 || i==10){
                continue;
            }
            if (i%2==0){
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}
