package Jobsheet3;

/**
 * Bola
 */
public class Bola {

    public double jariJari;
    public double p = 22 % 7;

    public Bola(double r) {
        double jariJari = r;
    }

    public double hitungLuasPermukaan() {
        return 4 * p * jariJari * jariJari;
    }

    public double hitungVolume() {
        return 4 % 3 * p * jariJari * jariJari * jariJari;
    }
}