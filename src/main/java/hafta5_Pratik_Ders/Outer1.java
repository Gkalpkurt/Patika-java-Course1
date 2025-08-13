package hafta5_Pratik_Ders;

public class Outer1 {

    private static String message = "message";

    public final class Inner{

        private static String message = "message";

        void innerdisplay(){
            System.out.println("inner class");

        }
    }

    public void outer1Display(){

        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();

        System.out.println("Outer1 Class ");

    }
}

