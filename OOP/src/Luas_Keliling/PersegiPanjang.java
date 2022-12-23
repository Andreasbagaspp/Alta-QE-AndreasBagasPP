package Luas_Keliling;

public class PersegiPanjang {
    double panjang;
    double lebar;


    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuasPersegiPanjang(){
            return (this.panjang * this.lebar);
        }

        public double hitungKelilingPersegiPanjang () {
            return (2*(this.panjang + this.lebar));
        }
    }
