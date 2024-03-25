package Jobsheet6;

/**
 * HotelService
 */
public class HotelService {

    Hotel listHtl[] = new Hotel[4];
    int a;

    void tambah(Hotel H) {
        if(a < listHtl.length) {
            listHtl[a] = H;
            a++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Hotel H : listHtl) {
            H.tampil();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listHtl.length - 1; i++) {
            for (int j = 1; j < listHtl.length; j++) {
                if (listHtl[j].bintang > listHtl[j-1].bintang) {
                    //dibawah ini proses swap atau penukaran
                    Hotel x = listHtl[j];
                    listHtl[j] = listHtl[j-1];
                    listHtl[j-1] = x;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listHtl.length - 1; i++) {
            int b = i;
            for (int j = i + 1; j < listHtl.length; j++) {
                if (listHtl[j].harga < listHtl[b].harga) {
                    b = j;
                }
            }
            //swap
            Hotel x = listHtl[b];
            listHtl[b] = listHtl[i];
            listHtl[i] = x;
        }
    }
}