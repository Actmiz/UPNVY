package Tugas1_123210151;

import java.util.Scanner;

import Tugas1_123210151.Abstrack.Abstrack;
import Tugas1_123210151.Abstrack.LingkaranAbstrack;
import Tugas1_123210151.Abstrack.SegitigaAbstrack;
import Tugas1_123210151.Interface.PersegiInterface;
import Tugas1_123210151.Polymorphism.BangunDatar;
import Tugas1_123210151.Polymorphism.Lingkaran;
import Tugas1_123210151.Polymorphism.Persegi;
import Tugas1_123210151.Polymorphism.Segitiga;

public class Tugas1_123210151 {
    public static void main(String[] args) {
        int menu = 0;
        int sisi, alas, tinggi, r;
        int sisi2, alas2, tinggi2, r2;
        Scanner scn = new Scanner(System.in);
        BangunDatar bangundatar = new BangunDatar();
        do {
            System.out.println("Menu :");
            System.out.println("1. Polymorphism ");
            System.out.println("2. Abstract");
            System.out.println("3. Interface");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu: ");
            menu = scn.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Polymorphism");
                    System.out.print("Masukkan Sisi Persegi: ");
                    sisi = scn.nextInt();
                    System.out.print("Masukkan Alas Segitiga :");
                    alas = scn.nextInt();
                    System.out.print("Masukkan Tinggi Segitiga :");
                    tinggi = scn.nextInt();
                    System.out.print("Masukkan Jari Jari Lingkaran :");
                    r = scn.nextInt();
                    Persegi persegi = new Persegi(sisi);
                    Segitiga segitiga = new Segitiga(alas, tinggi);
                    Lingkaran lingkaran = new Lingkaran(r);
                    bangundatar.luas();
                    System.out.println("Luas persegi: " + persegi.luas());
                    System.out.println("Luas segitiga: " + segitiga.luas());
                    System.out.println("Luas lingkaran: " + lingkaran.luas());
                    bangundatar.keliling();
                    System.out.println("keliling persegi: " + persegi.keliling());
                    System.out.println("keliling lingkaran: " + lingkaran.keliling());
                    break;
                case 2:
                    System.out.println("Abstract");
                    System.out.print("Masukkan Alas Segitiga :");
                    alas2 = scn.nextInt();
                    System.out.print("Masukkan Tinggi Segitiga :");
                    tinggi2 = scn.nextInt();
                    System.out.print("Masukkan Jari Jari Lingkaran :");
                    r2 = scn.nextInt();
                    Abstrack SegitigaAbstrack = new SegitigaAbstrack(alas2, tinggi2);
                    Abstrack lingkaranAbstrack = new LingkaranAbstrack(r2);
                    System.out.println("Luas Segitiga: " + SegitigaAbstrack.getLuas());
                    System.out.println("Luas Lingkaran: " + lingkaranAbstrack.getLuas());
                    break;
                case 3:
                    System.out.println("Interface");
                    System.out.print("Masukkan Sisi Persegi: ");
                    sisi2 = scn.nextInt();
                    PersegiInterface sss = new PersegiInterface(sisi2);
                    System.out.println("Luas Persegi: " + sss.hitungLuas());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Ditemukan");
                    break;
            }
        } while (true);
    }
}
