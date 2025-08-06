package Hafta3_Ödevler;

public class Flim {
    private String ad;
    private int yayinYili;
    private String tur;
    private double imdbPuani;

    public Flim(String ad, int yayinYili, String tur, double imdbPuani) {
        this.ad = ad;
        this.yayinYili = yayinYili;
        this.tur = tur;
        this.imdbPuani = imdbPuani;
    }

    public String getAd() { return ad; }
    public int getYayinYili() { return yayinYili; }
    public String getTur() { return tur; }
    public double getImdbPuani() { return imdbPuani; }

    @Override
    public String toString() {
        return "Film: " + ad + " | Yıl: " + yayinYili + " | Tür: " + tur + " | IMDb: " + imdbPuani;
    }
}
