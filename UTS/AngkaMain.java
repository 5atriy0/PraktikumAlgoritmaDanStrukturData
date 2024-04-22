package UTS;
import java.util.Scanner;
/**
 * AngkaMain
 */
public class AngkaMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        DaftarAngka list = new DaftarAngka();
        Angka a0 = new Angka(49);
        Angka a1 = new Angka(10);
        Angka a2 = new Angka(25);
        Angka a3 = new Angka(31);
        Angka a4 = new Angka(4);
        Angka a5 = new Angka(21);
        Angka a6 = new Angka(20);
        Angka a7 = new Angka(13);
        Angka a8 = new Angka(33);
        Angka a9 = new Angka(28);
        Angka a10 = new Angka(6);
        Angka a11 = new Angka(36);
        Angka a12 = new Angka(1);
        Angka a13 = new Angka(47);
        Angka a14 = new Angka(38);
        Angka a15 = new Angka(3);
        Angka a16 = new Angka(12);

        list.tambah(a0);
        list.tambah(a1);
        list.tambah(a2);
        list.tambah(a3);
        list.tambah(a4);
        list.tambah(a5);
        list.tambah(a6);
        list.tambah(a7);
        list.tambah(a8);
        list.tambah(a9);
        list.tambah(a10);
        list.tambah(a11);
        list.tambah(a12);
        list.tambah(a13);
        list.tambah(a14);
        list.tambah(a15);
        list.tambah(a16);

        System.out.println("Data angka sebelum sorting = ");
        list.tampil();

        System.out.println("Data angka setelah sorting asc (Selection Sort)");
        list.selectionSort();
        list.tampil();

    }
}