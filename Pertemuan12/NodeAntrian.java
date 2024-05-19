package Pertemuan12;

/**
 * NodeAntrian
 */
public class NodeAntrian {

    int nim;
    String nama;
    NodeAntrian next;

    public NodeAntrian(int nim,String nama) {
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }
}