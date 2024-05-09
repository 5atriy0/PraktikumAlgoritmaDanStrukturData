package Pertemuan10;

/**
 * Pembeli
 */
public class Pembeli {

    String nama;
    int noHP;

    Pembeli(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Pembeli(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    Pembeli() {

    }

    public boolean IsEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if(IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear) {
                System.out.println(antrian[front].nama + " " + antrian[front].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[front].nama + " " + antrian[front].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void Enqueue(Pembeli pm) {
        if(IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if(IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = pm;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli pm = new Pembeli();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            pm = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return pm;
    }

    public void clear() {
        if(!IsEmpty()) {
            front = rear = -1;
            size= 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling depan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!IsEmpty()) {
            int position = -1;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (antrian[index].nama.equals(nama)) {
                    position = i + 1; 
                    break;
                }
            }
            if (position != -1) {
                System.out.println("Posisi " + nama + " dalam antrian: " + position);
            } else {
                System.out.println("Posisi" + nama + " tidak ada dalam antrian");
            }
            
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + "\t| " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + "\t| " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
}