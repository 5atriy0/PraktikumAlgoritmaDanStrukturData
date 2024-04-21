package Pertemuan2;

/**
 * Dragon26
 */
public class Dragon26 {

    int x, y, width, height;

    void moveLeft(int kiri) {
        x -= kiri;
    }

    void moveRight(int kanan) {
        x += kanan;
    }

    void moveUp (int atas) {
        y -= atas;
    }

    void moveDown (int bawah) {
        y += bawah;
    }

    void detectCollision() {
        if ((x < 0 || x > width) || (y < 0 || y > height)) {
            System.out.println("=== GAME OVER ===\n");
        }
    }

    void printPosition() {
        System.out.println("Posisi Doragon: "+ x +", "+ y);
    }
}