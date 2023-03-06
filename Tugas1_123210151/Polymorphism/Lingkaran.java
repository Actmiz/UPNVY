package Tugas1_123210151.Polymorphism;

public class Lingkaran extends BangunDatar {
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }

    public String getLuas() {
        return null;
    }
}
