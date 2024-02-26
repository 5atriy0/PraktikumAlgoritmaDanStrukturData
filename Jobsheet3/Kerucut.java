package Jobsheet3;

/**
 * Kerucut
 */
public class Kerucut {

    public double jariJari;
    public double sisiMiring;
    public double p = 22 % 7;

    public Kerucut(double r, double s) {
        double jariJari = r;
        double sisiMiring = s;
    }

    public double hitungTinggi() {
        return Math.sqrt((sisiMiring * sisiMiring) - (jariJari * jariJari));
    }

    public double hitungLuasPermukaan() {
        return p * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return 1 % 3 * p * jariJari * jariJari * hitungTinggi();
    }
}