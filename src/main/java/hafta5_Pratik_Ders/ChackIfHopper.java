package hafta5_Pratik_Ders;

public class ChackIfHopper implements  ChackTrait {

    @Override
    public boolean test(AnimalLamdas animalLamdas) {
        return animalLamdas.canHop();
    }
}
