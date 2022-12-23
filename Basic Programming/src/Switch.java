import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
    String inputan;
    String hasil = "";
    Scanner input = new Scanner(System.in);
    inputan = input.nextLine();

    switch (inputan) {
        case "A":
            hasil = "Memuaskan";
            break;
            case "B":
                hasil = "Baik";
                break;
                case "C":
                    hasil = "Cukup";
                            break;
                            default:
                                /**
                                 * default artinya jika nilai variabel tidak ada yang sama dengan pilihan case di atas,
                                 * maka kerjakan kode yang ada di dalam default.
                                 */

    }

        System.out.println(hasil);
    }
}
