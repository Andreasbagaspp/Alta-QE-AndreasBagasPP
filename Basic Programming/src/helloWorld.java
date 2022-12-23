//  import java.util.Scanner karena bukanlah class bawaan Java yang secara otomatis langsung tersedia.
import java.util.Scanner;


public class helloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int jumlahSiswa;
        int jumlahNilai;
        String namaSiswa = "Andreas";
        float hasil = 89.00F;
        double resultBesar = 89.00000;
        char a = 'A';

        int alas = 10;
        int tinggi = 15;
        double luasAlas = (alas*tinggi*0.5);


        // Scanner class input
        Scanner input = new Scanner(System.in);
        int umur = 40;
        String isEntry = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Umur :");
        umur = Integer.parseInt(input.nextLine());
        // Integer.parseInt
        // mengubah String menjadi Integer atau mengubah kebilangan bulat.
        // Artinya jika bilangan didalamnya mengandung desimal maka akan dikonversikan ke bilangan bulat.

        // isEntry memasukkan string input dengan kondisi
        if (umur >= 18 && umur < 40) {
            isEntry = "Masuk";
        } else if (umur >= 50 && umur < 80) {
            isEntry = "Masuk tapi harus dengan Syarat";
        } else {
            isEntry = " Tidak Boleh Masuk";
        }
        System.out.println("Kamu boleh masuk gak :" + isEntry);
    }
}
