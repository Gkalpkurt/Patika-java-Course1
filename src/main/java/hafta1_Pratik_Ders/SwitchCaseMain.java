package hafta1_Pratik_Ders;

public class SwitchCaseMain {

    public static void main(String[] args) {

        int day = 5 ;

        switch (day){

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("geçersiz bir gün değeri girdiniz: ");

        }
    }
}
