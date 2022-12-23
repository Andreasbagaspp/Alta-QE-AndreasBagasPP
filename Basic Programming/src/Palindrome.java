public class Palindrome {
        private static boolean palindrome(String input) {

            String kata_ori = input; // lemparan value
            String kata_balikan = new StringBuilder(kata_ori).reverse().toString();
            // new StringBuilder class untuk memanggil reverse
            // reverse membalik kata
            // toString ubah ke tipe data String
            // equals() perbandingan value
            if(kata_ori.equals(kata_balikan)){
                return true;
            }else{
                return false;
            }
        }

        public static void main(String[] args) {
            System.out.println(palindrome("civic")); // value di lempar string input ke function palindrom
            System.out.println(palindrome("katak"));
            System.out.println(palindrome("kasur rusak"));
            System.out.println(palindrome("kupu-kupu"));
            System.out.println(palindrome("lion"));
        }
    }

