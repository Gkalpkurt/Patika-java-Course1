package hafta2_Pratik_Ders;

import java.util.Scanner;

public class ShapeAreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hangi şeklin alanını hesaplayacksın");
        System.out.println("1. Daire \n 2.kare \n 3. üçgen ");

        int choise = scanner.nextInt();
        Shape shape = null;

        switch (choise){
            case 1:
                System.out.println("dairenin yarı çağını girin");
                double radius = scanner.nextDouble();
                shape=new Circle(radius);
                break;

            case 2:
                    System.out.println("karenin kenar uzunluğunu girin");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;

            case 3:
                        System.out.println("üçgenin taBAN uzunluğunu girin");
                        double base = scanner.nextInt();
                        System.out.println("üçgenin yükseklikliğini girin");
                        double height = scanner.nextDouble();
                        shape = new Triangle(base,height);
                        break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız ");


        }

        double calculateArea = shape.calculateArea();

        System.out.println("alan = " + calculateArea);


    }
}
