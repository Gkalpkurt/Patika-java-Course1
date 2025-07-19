package hafta1_Pratik_Ders;

public class PassByValueVePassByReference {
    public static void main(String[] args) {
        int a = 10;
        modify(a);
        System.out.println(a);  // Output: 10
    }

    public static void modify(int value) {
        value = value * 2;
    }
}

