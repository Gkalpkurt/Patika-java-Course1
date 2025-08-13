package hafta5_Pratik_Ders;

import java.util.List;

public class RecordExamples {

    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point);

        Point point1 = new Point(3,3);
        System.out.println(point1);

        System.out.println("Rectangle1 Record");

        Rectangle1 rectangle1 = new Rectangle1(3, 4);
        System.out.println("Alan: " + rectangle1.area());

        System.out.println("Bird Record");

        var mommy = new Bird(4, "sude");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        var child = new Bird(0,"gökalp");

        List.of(mommy.getClass().getDeclaredMethods()).forEach(System.out::println);
        List.of(mommy.getClass().getDeclaredConstructors()).forEach(System.out::println);

        var child2 = new Bird(0,"Şeyma", "Hümüş");
    }
}
