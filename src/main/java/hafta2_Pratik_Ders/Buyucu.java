package hafta2_Pratik_Ders;

public class Buyucu extends Karakter {

    public Buyucu(String name) {
        super(name, 900, 350);
    }

    @Override
    public void attack() {
        System.out.println(name + " buyu yapiyor! Hasar: " + attackPower);
    }

    public void castSpell() {
        System.out.println(name + " ates topu buyusu yapiyor!");
    }
}
