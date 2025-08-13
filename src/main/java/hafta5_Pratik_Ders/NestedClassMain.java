package hafta5_Pratik_Ders;

public class NestedClassMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outDisplay();

        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();


            Outer1 outer1 = new Outer1();
            Outer1.Inner inner = outer1.new Inner();






    }
}

