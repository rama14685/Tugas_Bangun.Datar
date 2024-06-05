package week10;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        super(sisi);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    public int getSisi() {
        return this.sisi;
    }
}
