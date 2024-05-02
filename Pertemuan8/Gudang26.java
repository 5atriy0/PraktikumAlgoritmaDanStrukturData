package Pertemuan8;

/**
 * Gudang26
 */
public class Gudang26 {

    Barang26[] tumpukan;
    int size;
    int top;

    public Gudang26(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang26[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang26 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.print("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang26 ambilBarang() {
        if (!cekKosong()) {
            Barang26 delete = tumpukan[top];
            top--;
            System.out.print("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang26 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang26 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi26 stack = new StackKonversi26();
        
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public void lihatTeratas() {
        if (!cekKosong()) {
            System.out.println("Barang teratas: " + tumpukan[top].nama);
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public void ubahKapasitas(int kapasitasBaru) {
        Barang26[] newTumpukan = new Barang26[kapasitasBaru];
        for (int i = 0; i <= top; i++) {
            newTumpukan[i] = tumpukan[i];
        }
        tumpukan = newTumpukan;
        size = kapasitasBaru;
        System.out.println("Kapasitas gudang berhasil diubah menjadi " + kapasitasBaru);
    }

    public void lihatTerbawah() {
        if (!cekKosong()) {
            System.out.println("Barang terbawah: " + tumpukan[0].nama);
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public void cariBarang(int kodeBarang) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kodeBarang) {
                System.out.println("Barang dengan kode " + kodeBarang + " ditemukan: " + tumpukan[i].nama);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
        }
    }
}