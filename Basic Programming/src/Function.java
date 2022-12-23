import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        sapaAku(nama);
        for (int i = 0; i <1; i++) {
            sapaAku(nama);
        }
        System.out.println("Untuk " + nama + ", Tolong hitung Luas Segitiga");
        System.out.println("Nilai Alas");
        int alas = input.nextInt();
        System.out.println("Nilai Alas");
        int tinggi = input.nextInt();
        System.out.println("Luas Segitiga adalah : " + hitungLuasSegitiga (alas, tinggi));

    }

    private static void sapaAku (String nama)
    {System.out.println("Selamat Siang " + nama + ", Apa kabar? ");
    }

    private static int hitungLuasSegitiga (int alas, int tinggi) {
        int luas = 0;
        luas = (alas*tinggi) / 2;
        return luas;
    }
}
