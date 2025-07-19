package hafta1_Pratik_Ders;

public class İçİçeIfElseYapıları {

    public static void main(String[] args) {
        int yas = 20;// ÖRNEK !!
        boolean ehliyet = true;
        if (yas >= 18) {
            if (ehliyet) {
                System.out.println("Araç kullanabilirsiniz.");
            }
            else {
                System.out.println("Ehliyetiniz yok.");
            }
        }
        else {
            System.out.println("Yaşınız tutmuyor.");
        }


        int not = 85; //BAŞKA ÖRNEK !!
        // iç içe if-else yapısı ile öğrencinin aldığı notun hangi dereceye karşılık geldiğini kontrol ediyoruz.
        // Eğer not 85 veya daha büyükse "Pekiyi.",
        // eğer not 70-84 arasındaysa "İyi.",
        //eğer not 50-69 arasındaysa "Orta.",
        // eğer not 49 veya daha küçükse "Kötü." çıktısını alırız.
        if (not >= 50) {
            if (not >= 70) {
                if (not >= 85) {
                    System.out.println("Pekiyi.");
                }
                else {
                    System.out.println("İyi.");
                }
            }
            else {
                System.out.println("Orta.");
            }
        }
        else {
            System.out.println("Kötü.");
        }

        int yaş = 20; //   BAŞKA ÖRNEK !! Bu örnekte ilk önce yaşın 65 veya üzeri olup olmadığını kontrol ediyoruz.
        // Eğer yaş 65 veya üzeriyse, kişinin emekli olup olmadığını kontrol ediyoruz. Eğer emekliyse "Emeklisiniz." çıktısını, emekli değilse "Emekli olabilirsiniz." çıktısını alırız.
        // Eğer yaş 65'ten küçükse "Emeklilik yaşınız gelmedi." çıktısını alırız.
        boolean emekli = false;
        if (yas >= 65) {
            if (emekli) {
                System.out.println("Emeklisiniz.");
            }
            else {
                System.out.println("Emekli olabilirsiniz.");
            }
        }
        else {
            System.out.println("Emeklilik yaşınız gelmedi.");
        }

        int saat = 22; // BAŞKA ÖRNEK !!   Bu örnekte, ilk önce saat 18'den küçük mü diye kontrol ediyoruz.
        // Eğer küçükse "Günaydın!" çıktısını alırız.
        // Eğer saat 18 veya daha büyükse, hafta sonu olup olmadığını kontrol ediyoruz.
        // Eğer hafta sonuysa "İyi akşamlar, keyifli bir hafta sonu!" çıktısını,
        // hafta sonu değilse "İyi akşamlar, işten çıktınız mı?" çıktısını alırız.
        boolean haftaSonu = false;

        if (saat < 18) {
            System.out.println("Günaydın!");
        }
        else {
            if (haftaSonu) {
                System.out.println("İyi akşamlar, keyifli bir hafta sonu!");
            }
            else {
                System.out.println("İyi akşamlar, işten çıktınız mı?");
            }
        }



    }
}
