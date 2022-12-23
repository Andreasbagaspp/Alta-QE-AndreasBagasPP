package Volume;

public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolumeBalok () {
        return (this.panjang * this.lebar * this.tinggi);
    }
}
