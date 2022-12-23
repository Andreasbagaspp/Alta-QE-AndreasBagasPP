package Kalkulator;

import Volume.Kubus;

public class Main {

    public void main(String[] args) {
        Kalkulator kalkulator1 = new Kalkulator(3, 4);
        System.out.println("Hasil penjumlahan 3+4= "+ kalkulator1.penjumlahan());

        Kalkulator kalkulator2 = new Kalkulator(15, 4);
        System.out.println("Hasil pengurangan 15-4= "+ kalkulator2.pengurangan());

        Kalkulator kalkulator3 = new Kalkulator(10, 10);
        System.out.println("Hasil perkalian 10*10= "+ kalkulator3.perkalian());

        Kalkulator kalkulator4 = new Kalkulator(12, 3);
        System.out.println("Hasil pembagian 12/3= "+ kalkulator4.pembagian());
    }
}
