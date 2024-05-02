package Pertemuan8;
import java.util.Scanner;
/**
 * PostfixMain26
 */
public class PostfixMain26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix26 post = new Postfix26(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}