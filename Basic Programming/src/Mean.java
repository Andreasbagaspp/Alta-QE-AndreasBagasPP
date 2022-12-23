public class Mean {
    public static float Mean(float[] numbers){
        float jumlah = 0;
        for (int i = 0; i < numbers.length; i++) {
            jumlah = jumlah + numbers[i];
        }
        return jumlah / numbers.length;
    }

    public static void main(String[] args){
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));

    }
}