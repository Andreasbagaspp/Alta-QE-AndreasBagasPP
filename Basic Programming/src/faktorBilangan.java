import java.util.Scanner;

public class faktorBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        int bilangan = input.nextInt();
        System.out.println("Output Faktor:");
        int tambah = 0;
        for (int i = 0; i <= bilangan; i++) {
            tambah++;
            if (bilangan % tambah == 0) {
                System.out.println(tambah + " ");
            }
        }
    }
}