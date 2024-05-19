package Pertemuan12;

/**
 * NodeMahasiswa
 */
public class NodeMahasiswa {

    int nim;
    String namaMhs;
    NodeMahasiswa next;

    NodeMahasiswa(int nim, String namaMhs, NodeMahasiswa berikutnya) {
        this.nim = nim;
        this.namaMhs = namaMhs;
        next = berikutnya;
    }
}