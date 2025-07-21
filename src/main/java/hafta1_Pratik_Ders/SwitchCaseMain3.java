package hafta1_Pratik_Ders;

public class SwitchCaseMain3 {
    public static void main(String[] args) {

        int grade =61;

        String letterGrade = switch (grade / 10) {
            case 10,9 -> "a";
            case 8 -> "b";
            case 6 -> "c";
            case 4,5 -> "d";
            default -> "f";

        };
        System.out.println("harf notu " + letterGrade);
    }
}
