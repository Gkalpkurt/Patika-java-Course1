package hafta2_Pratik_Ders;

public class RecursiveMetotlarPratikleri {
    public static void main(String[] args) {

        int factorial = factorial(5);
        System.out.println("factorial: " + factorial);

    }
    //5! = 5*4*3*2*1=100
    public static int factorial (int number){

        if (number== 0){
            return 1;

        }

        return number * (factorial(number - 1));

    }


}
