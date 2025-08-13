package hafta5_Pratik_Ders;

public class LocalClassExample {
    public void display(){

        class Local{

            void message(){
                System.out.println("Local Class! ");

            }
        }

        Local local = new Local();
        local.message();

    }


}
