package hafta5_Pratik_Ders;

public class ChackIfSwim implements ChackTrait {

    @Override
    public boolean test(AnimalLamdas animalLamdas) {
        return animalLamdas.canSwim();
    }
}
