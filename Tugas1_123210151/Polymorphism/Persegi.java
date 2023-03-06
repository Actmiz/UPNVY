package Tugas1_123210151.Polymorphism;

public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling() {
        return this.sisi * 4;
    }
}
