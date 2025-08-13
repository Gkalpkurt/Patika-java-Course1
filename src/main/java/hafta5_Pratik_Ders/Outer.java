package hafta5_Pratik_Ders;

public class Outer {
    static class  Nested {
        public void nestedDisplay(){
            System.out.println("Static nested class public method");

        }

        private void privateNestedDisplay(){
            System.out.println("Static Private nested class method");

        }
    }

    public void outDisplay (){
        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();
        nested.privateNestedDisplay();

    }
}

