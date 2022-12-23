package Kalkulator;

public class Kalkulator {
    double bilangan1;
    double bilangan2;

    public Kalkulator(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    public double penjumlahan() {
        return this.bilangan1 + this.bilangan2;
    }
    public double pengurangan() {
        return this.bilangan1 - this.bilangan2;
    }
    public double perkalian() {
        return this.bilangan1 * this.bilangan2;
    }
    public double pembagian() {
        return this.bilangan1 / this.bilangan2;
    }
}
