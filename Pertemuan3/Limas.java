package Pertemuan3;

/**
 * Limas
 */
public class Limas {

    public double tinggiLimas;
    public double panjangAlas;

    public Limas() {

    }

    public Limas(double t, double p) {
        double tinggiLimas = t;
        double panjangAlas = p;
    }

    public double hitungTinggiSegitiga() {
        return Math.sqrt(((1.0 / 4.0) * panjangAlas * panjangAlas) + (tinggiLimas * tinggiLimas));
    }

    public double hitungLuasPermukaan() {
        return (panjangAlas * panjangAlas) + (4 * (1.0 / 2.0) * panjangAlas * hitungTinggiSegitiga());
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangAlas * panjangAlas * tinggiLimas;
    }
}