package hafta2_Pratik_Ders;

public class MethodTanimlamaPratikleri2 {
    public static void main(String[] args) {

    }
    public void showTitle(){
        System.out.println("hoşgeldiniz");

    }

    public int calculateSquare (int number){
        return number * number;

    }
    private void addNumbers (int number1, int number2){
        int sum = number1 + number2 ;

        System.out.println("toplam : " + sum);
    }

    private  double addNumbers(double number1, double number2) {
        double sum = number1 + number2 ;

        return  sum;

    }

    private double addNumbers() {
        return 10;
    }



}
