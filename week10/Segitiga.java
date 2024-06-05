package week10;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2.0;
    }

    @Override
    public double keliling() {
        // Mengasumsikan segitiga siku-siku untuk kemudahan
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getAlas() {
        return alas;
    }
}
