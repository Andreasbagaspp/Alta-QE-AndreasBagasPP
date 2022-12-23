public class konversiNilai {

    public static void main(String[] args) {

        int nilaiSiswa = 80;

        if(nilaiSiswa >= 80 && nilaiSiswa <=100) {
            System.out.println("Nilai siswa adalah A");
       } else if (nilaiSiswa >=65 && nilaiSiswa <=79) {
            System.out.println("Nilai siswa adalah B+");
        } else if (nilaiSiswa >=50 && nilaiSiswa <=64) {
            System.out.println("Nilai siswa adalah B");
        } else if (nilaiSiswa >= 35 && nilaiSiswa <=49) {
            System.out.println("Nilai siswa adalah C");
        } else if (nilaiSiswa >=0 && nilaiSiswa <=34) {
         System.out.println("Nilai siswa adalah D");
        } else{
            System.out.println("Invalid");
        }
    }
}
