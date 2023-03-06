package Tugas1_123210151.Interface;

public class PersegiInterface implements Interface {
    int sisi;

    public PersegiInterface(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        // TODO Auto-generated method stub
        double luasinterface = (sisi * sisi);
        return luasinterface;
    }
}
