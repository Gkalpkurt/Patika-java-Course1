package hafta2_Pratik_Ders;

class Karakter {
    protected String name;
    protected int health;
    protected int attackPower;

    public Karakter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " saldiriyor! Hasar: " + attackPower);
    }

    public void showStats() {
        System.out.println("Karakter: " + name);
        System.out.println("Can: " + health);
        System.out.println("Saldiri Gucu: " + attackPower);
        System.out.println("-----------------------------");
    }
}