package Pertemuan3;

/**
 * MainSegitiga
 */
public class MainSegitiga {

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(3, 4);
        sgArray[1] = new Segitiga(16, 5);
        sgArray[2] = new Segitiga(8, 4);
        sgArray[3] = new Segitiga(12, 6);

        for (int i=0; i<4; i++){
            System.out.println("Segitiga ke-"+i);
            System.out.println("Luas        : " + sgArray[i].hitungLuas());
            System.out.println("Kelling     : " + sgArray[i].hitungKeliling());
        }
    }
}