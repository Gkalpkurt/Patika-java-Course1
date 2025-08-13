package hafta5_Pratik_Ders;

public class AnonymousExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {

                System.out.println("Merhabalar ben bu yerlerden biriyimm ");

            }
        };

        greeting.sayHello();

        Greeting greeting1 = new Greetingİmpl();
        greeting1.sayHello();




    }
}
