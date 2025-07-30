package hafta2_Pratik_Ders;

public class savasci extends Karakter {

    public savasci(String name) {
        super(name, 1500, 250);
    }

    @Override
    public void attack() {
        System.out.println(name + " kiliciyla saldiriyor! Hasar: " + attackPower);
    }

    public void shieldBlock() {
        System.out.println(name + " kalkanini kullanarak savunma yapiyor!");
    }
}
