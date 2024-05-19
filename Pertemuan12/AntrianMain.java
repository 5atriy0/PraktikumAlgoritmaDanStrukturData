package Pertemuan12;

/**
 * AntrianMain
 */
public class AntrianMain {

    public static void main(String[] args) {
        AntrianQueue qu = new AntrianQueue();
        System.out.println("Antrian:");
        qu.enqueue(111, "Anton");
        qu.print();
        qu.enqueue(112, "Prita");
        qu.print();
        qu.enqueue(113, "Yusuf");
        qu.print();
        qu.enqueue(114, "Doni");
        qu.print();
        qu.enqueue(115, "Sari");
        qu.print();
        System.out.println();

        System.out.println("Elemen di depan antrian (peek): " + qu.peek());
        qu.dequeue();

        System.out.println();
        System.out.println("Antrian setelah dequeue");
        qu.print();
        System.out.println();
    }
}