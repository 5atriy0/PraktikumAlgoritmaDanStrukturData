package Pertemuan12;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    NodeMahasiswa head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            System.out.print("Data Linked List: ");
            while (tmp != null) {
                System.out.print("(" + tmp.nim + " - " + tmp.namaMhs + ")\t");
                tmp = tmp.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("Data Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama) {
        NodeMahasiswa nd = new NodeMahasiswa(nim, nama, null);
        if (isEmpty()) {
            head = nd;
            tail = nd;
        } else {
            nd.next = head;
            head = nd;
        }
    }

    void addLast(int nim, String nama) {
        NodeMahasiswa nd = new NodeMahasiswa(nim, nama, null);
        if (isEmpty()) {
            head = nd;
            tail = nd;
        } else {
            tail.next = nd;
            tail = nd;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        NodeMahasiswa nd = new NodeMahasiswa(nim, nama, null);
        NodeMahasiswa temp = head;
        do {
            if (temp.nim == key) {
                nd.next = temp.next;
                temp.next = nd;
                if (nd.next == null) {
                    tail = nd;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int nim, String nama) {
        NodeMahasiswa nd = new NodeMahasiswa(nim, nama, null);
        if (index < 0) {
            System.out.println("!");
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            NodeMahasiswa temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            nd.next = temp.next;
            temp.next = new NodeMahasiswa(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}