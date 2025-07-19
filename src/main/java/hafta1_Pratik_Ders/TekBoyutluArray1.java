package hafta1_Pratik_Ders;

public class TekBoyutluArray1 {
    public static void main(String[] args) {

        int[] numbers = {1,5,9,256,23,56,97} ;
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("dizideki en büyük eleman: " + max);
    }
}
