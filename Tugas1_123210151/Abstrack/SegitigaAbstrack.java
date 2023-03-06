package Tugas1_123210151.Abstrack;

public class SegitigaAbstrack extends Abstrack {
    private float alas;
    private float tinggi;

    public SegitigaAbstrack(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float getLuas() {
        return (alas * tinggi) / 2;
    }
}
