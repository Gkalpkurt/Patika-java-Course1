package hafta1_Pratik_Ders;

public class TekBoyutluArray {
    public static void main(String[] args) {
        int number = 5;
        int number1 = 10;
        int number2 = 15;


        int[] numbers = new int[5]; // eleman sayısı
        numbers[0] = 5 ;
        numbers[1] = 10 ;
        numbers[2] = 15;
        numbers[3] = 20 ;
        numbers[4] = 25 ;
        //numbers [7] = 30 arry index out of bound hatası alır

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number["+ i + "] = " + numbers[i]);

        }

       // System.out.println("number["+ 5 + "] = " + numbers[5]);   arry index out of bound hatası alır

              int[] numbers2= {1,2,3,4,5 };
        for (int num : numbers2) {
            System.out.println(num);
        }
        String [] cities = {"Trabzon", "Maçka" };

        for (String city : cities) {
            System.out.println(city);

        }




    }
}
