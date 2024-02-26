package Jobsheet3;

/**
 * Limas
 */
public class Limas {

    public double panjangSisiAlas;
    public double tinggi;

    public Limas(double panjangSisiAlas, double tinggi) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggi);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggi;
    }
}