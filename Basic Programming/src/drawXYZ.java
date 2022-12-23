public class drawXYZ {
    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(6);
    }

    private static void DrawXYZ(int number) {
        int check = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                check++;
                if (check % 3 == 0) {
                    System.out.print("X");
                } else if (check % 2 != 0) {
                    System.out.print("Y");
                } else if (check % 2 == 0) {
                    System.out.print("Z");
                }
            }
            System.out.println();
        }
    }
}

/**
 * public class Main {
 * public static void main(String[] args) {
 * //        * * * * *
 * int bintang = 0;
 * for(int i=0; i<5; i++){
 * for(int j=0; j<5; j++){
 * //                System.out.print("* ");
 * bintang = bintang + 1;
 * if (bintang % 2 ==  0){
 * System.out.print("+ ");
 * } else {
 * System.out.print("* ");
 * }
 * }
 * System.out.println();
 * <p>
 * }
 * }
 * <p>
 * }
 */