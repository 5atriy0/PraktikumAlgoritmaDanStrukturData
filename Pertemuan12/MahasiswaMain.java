package Pertemuan12;

/**
 * MahasiswaMain
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.addFirst(111, "Anton");
        mhs.print();
        mhs.addLast(114, "Doni");
        mhs.print();
        mhs.insertAt(1, 113, "Yusuf");
        mhs.print();
        mhs.insertAfter(111, 112, "Prita");
        mhs.print();
        mhs.addLast(115, "Sari");
        mhs.print();
    }
}