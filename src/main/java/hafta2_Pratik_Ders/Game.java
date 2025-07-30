package hafta2_Pratik_Ders;

public class Game {

    /**
     * Savasci
     * Buyucu
     * Okcu
     */

    public static void main(String[] args) {
        savasci savasci = new savasci("Thor");
        Buyucu buyucu = new Buyucu("Gandalf");
        Okcu okcu = new Okcu("Legolas");

        savasci.showStats();
        buyucu.showStats();
        okcu.showStats();

        System.out.println("=== Saldiricilar Basliyor ===");
        savasci.attack();
        buyucu.attack();
        okcu.attack();

        System.out.println("=== Ozel Yetenekler ===");
        savasci.shieldBlock();
        buyucu.castSpell();
        okcu.multiShot();
    }
}
