package Luas_Keliling;

public class Main {

    public static void main(String[] args) {
        Segitiga luassegitiga = new Segitiga(3, 4);
        System.out.println("Luas Segitiga "+ luassegitiga.hitungLuasSegitiga());

        Segitiga kelilingsegitiga = new Segitiga( 3, 4);
        System.out.println("Keliling Segitiga " + kelilingsegitiga.hitungKelilingSegitiga());

        Persegi luaspersegi = new Persegi(4);
        System.out.println("Luas Persegi "+ luaspersegi.hitungLuasPersegi());

        Persegi kelilingPersegi = new Persegi(4);
        System.out.println("Keliling Persegi "+ kelilingPersegi.hitungKelilingPersegi());

        PersegiPanjang luasPersegiPanjang = new PersegiPanjang(7 , 8);
        System.out.println("Luas Persegipanjang "+ luasPersegiPanjang.hitungLuasPersegiPanjang());

        PersegiPanjang kelilingPersegiPanjang = new PersegiPanjang(7, 8);
        System.out.println("Keliling Persegipanjang "+ kelilingPersegiPanjang.hitungKelilingPersegiPanjang());
    }
}


