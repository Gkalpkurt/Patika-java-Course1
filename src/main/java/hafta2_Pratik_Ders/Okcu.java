package hafta2_Pratik_Ders;

public class Okcu extends Karakter {

    public Okcu(String name) {
        super(name, 800, 375);
    }

    @Override
    public void attack() {
        System.out.println(name + " ok firlatiyor! Hasar: " + attackPower);
    }

    public void multiShot() {
        System.out.println(name + " 3 ok birden firlatti!");
    }
}