package Pertemuan3;

/**
 * Bola
 */
public class Bola {

    public double jariJari;

    public Bola() {

    }

    public Bola(double r) {
        double jariJari = r;
    }

    public double hitungLuasPermukaan() {
        return 4.0 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}