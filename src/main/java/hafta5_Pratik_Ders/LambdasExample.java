package hafta5_Pratik_Ders;

public class LambdasExample {
    public static void main(String[] args) {
// java 8 Öncesi
        GreetingLambdas greetingLambdas = new GreetingLambdas() {
            @Override
            public void method(String string) {
                System.out.println("Hello " + string );

            }
        };
        greetingLambdas.method ("Göko");

        //java 8 sonrası

        GreetingLambdas greetingLambdas1 = (name) -> System.out.println("Hello " + name);
        GreetingLambdas greetingLambdas2 = (name) -> {
               System.out.println("Hello " + name);
            System.out.println("ben lambda metgoduyum");
        };

        greetingLambdas1.method("Göko" );
        greetingLambdas2.method("göko");

        //lambdas
        //(parametre)  -> {methodGövdesi}
        //eğer tek parametre varsa  parametre  -> methodGövdesi  =  GreetingLambdas greetingLambdas1 = (name) -> System.out.println("Hello " + name);


    }
}
