package Pertemuan12;

/**
 * AntrianQueue
 */
public class AntrianQueue {

    private NodeAntrian front, rear;

    void print() {
        if (!isEmpty()) {
            NodeAntrian tmp = front;
            System.out.print("Isi Antrian: ");
            while (tmp != null) {
                System.out.print("("+tmp.nim + " - " + tmp.nama + ")");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void enqueue(int data, String nama) {
        NodeAntrian nd = new NodeAntrian(data, nama);

        if (isEmpty()) {
            this.front = this.rear = nd;
            return;
        }
        this.rear.next = nd;
        this.rear = nd;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong");
            return;
        }
        NodeAntrian temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }
        return this.front.nim;
    }

    boolean isEmpty() {
        return this.front == null;
    }
}