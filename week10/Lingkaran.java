package week10;

public class Lingkaran extends BangunDatar {
    private int radius;
    private static final double pi = 3.14;

    public Lingkaran(int radius) {
        super(radius);
        this.radius = radius;
    }

    @Override
    public double luas() {
        return radius * radius * pi;
    }

    @Override
    public double keliling() {
        return 2 * pi * radius;
    }

    public int getRadius() {
        return radius;
    }
}
