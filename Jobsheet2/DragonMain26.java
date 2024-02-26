package Jobsheet2;

import java.util.Scanner;

/**
 * DragonMain26
 */
public class DragonMain26 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Dragon26 drag = new Dragon26();
        drag.x = 7;
        drag.y = 7;
        drag.width = 8;
        drag.height = 8;
        
        System.out.print("Langkah ke kiri  : ");
        int left = a.nextInt();
        System.out.print("Langkah ke kanan : ");
        int right = a.nextInt();
        System.out.print("Langkah ke atas  : ");
        int up = a.nextInt();
        System.out.print("Langkah ke bawah : ");
        int down = a.nextInt();
        
        drag.moveLeft(left);
        drag.moveRight(right);
        drag.moveUp(up);
        drag.moveDown(down);
        drag.printPosition();
        drag.detectCollision();
    }
}