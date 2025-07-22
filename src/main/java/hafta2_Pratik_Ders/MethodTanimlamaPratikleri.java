package hafta2_Pratik_Ders;

public class MethodTanimlamaPratikleri {
    public static void main(String[] args) {

        addNumbers(5, 7);

        addNumbers(6.4, 15);

    }

    private static void addNumbers (int number1, int number2){
        int sum = number1 + number2 ;

        System.out.println("toplam : " + sum);
    }


    private  static double addNumbers(double number1, double number2) {
        double sum = number1 + number2 ;

        return  sum;

    }


}
