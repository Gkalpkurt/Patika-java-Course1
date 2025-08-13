package hafta3_Pratik_Ders;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Gökalp",90);
        students.put("Sude" ,100 );
        students.put("Müzeyyen" , 95);

        System.out.println("Students: " + students);

        System.out.println("Gökalp'in notu : " + students.get("Gökalp"));
        System.out.println("Sude'nin notu : " + students.get("Sude"));
        System.out.println("Müzeyyen'in notu : " + students.get("Müzeyyen"));

        System.out.println("Keys: " + students.keySet());

        System.out.println("Values: " + students.values());

        students.remove("Yusuf");

        students.put("Yusuf", 95);

        students.remove("Gökalp");

        System.out.println("Students: " + students);


        System.out.println("");
    }
}
