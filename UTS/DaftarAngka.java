package UTS;

/**
 * DaftarAngka
 */
public class DaftarAngka {

    Angka listAngka[] = new Angka[20];
    int idx;

    void tambah(Angka a) {
        if(idx < listAngka.length) {
            listAngka[idx] = a;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listAngka[i].tampil();
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) {
                if (listAngka[j].angka < listAngka[idxMin].angka) {
                    idxMin = j;
                }
            }
            Angka tmp = listAngka[idxMin];
            listAngka[idxMin] = listAngka[i];
            listAngka[i] = tmp;
        }
    }
}
