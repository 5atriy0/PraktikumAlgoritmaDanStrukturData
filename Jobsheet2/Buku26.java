package Jobsheet2;

/**
 * Buku26
 */
public class Buku26 {
        
        String judul, pengarang;
        int halaman, stok, harga;

        void tampilInformasi() {
            System.out.println("Judul : "+ judul);
            System.out.println("Pengarang : "+ pengarang);
            System.out.println("Jumlah Halaman : "+ halaman);
            System.out.println("Sisa Stok : "+ stok);
            System.out.println("Harga : Rp "+ harga);
        }

        void terjual(int jml) {
            stok -= jml;
        }

        void restok(int jml) {
            stok += jml;
        }

        void gantiHarga(int hrg) {
            harga = hrg;
        }

        void hitungHargaTotal(int jmlTerjual) {
            int hargaTotal = harga*jmlTerjual;

            System.out.println("Harga total     : "+hargaTotal);
        }

        void hitungDiskon() {
            
        }

        public Buku26() {

        }

        public Buku26(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
}
