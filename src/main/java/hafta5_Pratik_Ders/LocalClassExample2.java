package hafta5_Pratik_Ders;

public class LocalClassExample2 {
    public void display(){
        final String greeting = "Hi, ";

        class Local {

            void message(){
                System.out.println(greeting);
            }
        }

        Local local = new Local();
        local.message();
    }
}
