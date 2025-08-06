package Hafta3_Ödevler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlimManager {
    private List<Flim> flimList;

    public FlimManager() {
        flimList = new ArrayList<>();
    }

    public void flimEkle(Flim flim) {
        flimList.add(flim);
    }

    public void imdbyeGoreSirala() {
        Collections.sort(flimList, Comparator.comparingDouble(Flim::getImdbPuani).reversed());
        System.out.println("📊 IMDb'ye Göre Sıralama (Büyükten Küçüğe):");
        for (Flim flim : flimList) {
            System.out.println(flim);
        }
    }

    public void yilaGoreSirala() {
        Collections.sort(flimList, Comparator.comparingInt(Flim::getYayinYili));
        System.out.println("\n📅 Yayın Yılına Göre Sıralama (Küçükten Büyüğe):");
        for (Flim flim : flimList) {
            System.out.println(flim);
        }
    }

    public void turFiltrele(String tur) {
        System.out.println("\n🎞️ " + tur + " Türündeki Filmler:");
        for (Flim flim : flimList) {
            if (flim.getTur().equalsIgnoreCase(tur)) {
                System.out.println(flim);
            }
        }
    }
}
