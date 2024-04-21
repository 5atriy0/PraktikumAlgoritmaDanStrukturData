package Jobsheet6;

import java.util.Scanner;

/**
 * MainHotel
 */
public class MainHotel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HotelService rooms = new HotelService();
        Hotel H1 = new Hotel("Everyday Smart Hotel", "Malang", 350000, 2);
        Hotel H2 = new Hotel("Harris Hotel", "Malang", 535000, 3);
        Hotel H3 = new Hotel("The Alana Hotel", "Malang", 430000, 3);
        Hotel H4 = new Hotel("Whize Prime Hotel", "Malang", 780000, 4);

        rooms.tambah(H1);
        rooms.tambah(H2);
        rooms.tambah(H3);
        rooms.tambah(H4);

        System.out.println("Hotel dengan harga termurah ke termahal");
        rooms.selectionSort();
        rooms.tampilAll();

        System.out.println("Hotel dengan tertinggi ke terendah");
        rooms.bubbleSort();
        rooms.tampilAll();
    }
}