package Jobsheet3;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    String nama;
    int nim;
    double ipk;

    public Mahasiswa() {

    }

    public Mahasiswa(String nm, int nim, double ipk) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama        : " + nama);
        System.out.println("Nim         : " + nim);
        System.out.println("Nilai IPK   : " + ipk);
    }
}