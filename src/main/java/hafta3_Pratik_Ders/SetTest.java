package hafta3_Pratik_Ders;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple"); //61616161
        fruits.add("Banana"); //61076107
        fruits.add("Orange"); //61610707
        fruits.add("Milk"); //07610761
        fruits.add(null);

        System.out.println("Apple Keliimesinin Hashcode karşılığı : Apple".hashCode());
        System.out.println("Apple Keliimesinin Hashcode karşılığı : Banana".hashCode());
        System.out.println("Apple Keliimesinin Hashcode karşılığı : Orange".hashCode());
        System.out.println("Apple Keliimesinin Hashcode karşılığı : Milk".hashCode());

        System.out.println("Frits: " + fruits );


        //LinkedHashSet

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Trabzon");
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("Kırklareli");

        System.out.println("cities: " + cities);

        // TreeSet -> Sıralama yapabilmesi

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(61);
        numbers.add(07);
        numbers.add(34);
        numbers.add(59);

        System.out.println("Numbers: " + numbers);

        Set<String> cars = new TreeSet<>();
        cars.add("FLU");
        cars.add("BMW");
        cars.add("AUDİ");

        System.out.println("cars:"+  cars );

        cars.remove("BMW");

        System.out.println("cars: " + cars);

        cars.clear();

        System.out.println("cars: "+ cars);
        System.out.println(cars.isEmpty());




    }
}
