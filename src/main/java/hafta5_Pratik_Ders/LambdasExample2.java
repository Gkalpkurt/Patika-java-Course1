package hafta5_Pratik_Ders;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private final String name;
    private final boolean canHop;
    private final boolean canSwim;

    Animal(String name, boolean canHop, boolean canSwim) {
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }
    boolean canHop()  { return canHop; }
    boolean canSwim() { return canSwim; }
    @Override public String toString() { return name; }
}

interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    @Override public boolean test(Animal a) { return a.canHop(); }
}

public class LambdasExample2 {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",    false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit",   true, false));
        animals.add(new Animal("turtle",   true, false));

        print(animals, new CheckIfHopper());
        // veya lambda ile:
        // print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> animalList, CheckTrait checker) {
        for (Animal a : animalList) {
            if (checker.test(a)) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
