package Volume;

public class Tabung {
    double jarijari;
    double tinggi;


    public Tabung( double jarijari,double tinggi) {
        this.tinggi = tinggi;
        this.jarijari = jarijari;
    }

    public double hitungVolumeTabung(){
        return Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
}
