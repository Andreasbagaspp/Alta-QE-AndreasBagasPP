public class BilanganPrima {
    private static boolean BilanganPrima(int number) {
        int bagi = 0; // temp
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                bagi++; // temp
            }
        }
        if (bagi == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(BilanganPrima(11));
        System.out.println(BilanganPrima(13));
        System.out.println(BilanganPrima(17));
        System.out.println(BilanganPrima(20));
    }
}