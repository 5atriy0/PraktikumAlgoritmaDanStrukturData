package Pertemuan14Kuis2;

/**
 * Epl
 */
public class Epl {

    Node head, tail;

    Epl() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addTeam(String nama, int pertandingan, int menang, int seri, int kalah, int poin, int golMasuk, int golKebobolan, int selisihGol) {
        Node ndInput = new Node(nama, pertandingan, menang, seri, kalah, poin, golMasuk, golKebobolan, selisihGol, head);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void bubbleSort() {
        Node current, index = null;
        int tempPoin;
        String tempNama;
        int tempPertandingan, tempMenang, tempSeri, tempKalah, tempGolMasuk, tempGolKebobolan, tempSelisihGol;

        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.poin < index.poin) {
                        tempPoin = current.poin;
                        tempNama = current.nama;
                        tempPertandingan = current.pertandingan;
                        tempMenang = current.menang;
                        tempSeri = current.seri;
                        tempKalah = current.kalah;
                        tempGolMasuk = current.golMasuk;
                        tempGolKebobolan = current.golKebobolan;
                        tempSelisihGol = current.selisihGol;
                        current.poin = index.poin;
                        current.nama = index.nama;
                        current.pertandingan = index.pertandingan;
                        current.menang = index.menang;
                        current.seri = index.seri;
                        current.kalah = index.kalah;
                        current.golMasuk = index.golMasuk;
                        current.golKebobolan = index.golKebobolan;
                        current.selisihGol = index.selisihGol;
                        index.poin = tempPoin;
                        index.nama = tempNama;
                        index.pertandingan = tempPertandingan;
                        index.menang = tempMenang;
                        index.seri = tempSeri;
                        index.kalah = tempKalah;
                        index.golMasuk = tempGolMasuk;
                        index.golKebobolan = tempGolKebobolan;
                        index.selisihGol = tempSelisihGol;
                    } else if (current.poin == index.poin) {
                        if (current.selisihGol < index.selisihGol) {
                            tempPoin = current.poin;
                            tempNama = current.nama;
                            tempPertandingan = current.pertandingan;
                            tempMenang = current.menang;
                            tempSeri = current.seri;
                            tempKalah = current.kalah;
                            tempGolMasuk = current.golMasuk;
                            tempGolKebobolan = current.golKebobolan;
                            tempSelisihGol = current.selisihGol;
                            current.poin = index.poin;
                            current.nama = index.nama;
                            current.pertandingan = index.pertandingan;
                            current.menang = index.menang;
                            current.seri = index.seri;
                            current.kalah = index.kalah;
                            current.golMasuk = index.golMasuk;
                            current.golKebobolan = index.golKebobolan;
                            current.selisihGol = index.selisihGol;
                            index.poin = tempPoin;
                            index.nama = tempNama;
                            index.pertandingan = tempPertandingan;
                            index.menang = tempMenang;
                            index.seri = tempSeri;
                            index.kalah = tempKalah;
                            index.golMasuk = tempGolMasuk;
                            index.golKebobolan = tempGolKebobolan;
                            index.selisihGol = tempSelisihGol;
                        }
                    }
                }
            }
        }
    }

    void print() {
        Node current = head;
        System.out.println("================================================================================================================================================");
        System.out.printf("|                                                           KLASEMEN LIGA INGGRIS 2020-2021                                                    |\n");
        System.out.println("================================================================================================================================================");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-8s | %-25s | %-15s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s |\n", "Posisi", "Klub", "Pertandingan", "Menang", "Seri", "Kalah", "Gol Masuk", "Gol Kebobolan", "Poin", "Selisih Gol");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        int position = 1;
        while (current != null) {
            System.out.printf("| %-8d | %-25s | %-15d | %-8d | %-8d | %-8d | %-9d | %-13d | %-8d | %-11d |\n", position, current.nama, current.pertandingan, current.menang, current.seri, current.kalah, current.golMasuk, current.golKebobolan, current.poin, current.selisihGol);
            current = current.next;
            position++;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}