package Pertemuan3;

/**
 * Kerucut
 */
public class Kerucut {

    public double jariJari;
    public double sisiMiring;

    public Kerucut() {

    }

    public Kerucut(double r, double s) {
        jariJari = r;
        sisiMiring = s;
    }

    public double hitungTingguKerucut() {
        return Math.sqrt((sisiMiring * sisiMiring) - (jariJari * jariJari));
    }

    public double hitungLuasPermukaan() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * hitungTingguKerucut();
    }

    public double hitungVolume() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }
}