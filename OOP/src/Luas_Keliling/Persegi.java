package Luas_Keliling;

public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuasPersegi() {
        return (this.sisi * this.sisi);
    }

    public double hitungKelilingPersegi() {
        return (4 * this.sisi);
    }

}