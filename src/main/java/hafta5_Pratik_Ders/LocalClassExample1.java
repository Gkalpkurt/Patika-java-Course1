package hafta5_Pratik_Ders;

public class LocalClassExample1 {
    public void  calculate (int number1 , int number2){
        class  Calculation {
            int sum (){
                return number1 + number2;
            }
        }

        Calculation calculation = new Calculation();
        int sum = calculation.sum();
        System.out.println("Toplam: " + sum);

    }
}

