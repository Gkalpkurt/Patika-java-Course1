package hafta1_Pratik_Ders;

public class İfElseveSwitchCaseKarşılaştırma {
    public static void main(String[] args) {

        int gun =5; //İf Örneği
        if (gun ==1) {
            System.out.println("Bugün Pazartesi ");
        }else if (gun ==2) {
            System.out.println("Bugün Salı ");
        }else if (gun ==3) {
            System.out.println("Bugün Çarşamba ");
        }else {
            System.out.println("Bugün o Gün değil kanka ya. ");

        }
        int sayi = 10; //İf Örneği, Bu örnekte, sayı 10 olduğu için "Sayı pozitif." çıktısını alırız.

        if (sayi > 0) {
            System.out.println("Sayı pozitif.");
        }
        else {
            System.out.println("Sayı negatif veya sıfır.");
        }

        int yas = 20; //if örneği, Bu örnekte yas değişkeni 20 olduğu için "Reşit." çıktısını alırız.
        // if içindeki koşul (yas < 18) yanlış olduğu için else bloğu çalıştırılır.

        if (yas < 18) {
            System.out.println("Reşit değil.");
        }
        else {
            System.out.println("Reşit.");
        }

        int sayı = 0;  // if örneği, Bu örnekte, sayı 0 olduğu için "Sayı sıfır." çıktısını alırız.

        if (sayi > 0) {
            System.out.println("Sayı pozitif.");
        } else if (sayi < 0) {
            System.out.println("Sayı negatif.");
        } else {
            System.out.println("Sayı sıfır.");
        }

        int sicaklik = 20; //if örneği, Bu örnekte sicaklik değişkeni 20 olduğu için "Sıcak." çıktısını alırız.
        // Kod, ilk if ve else if koşullarını kontrol eder ve yanlış bulduğunda sonraki koşulları kontrol etmeye devam eder.
        // Son else bloğu, önceki tüm koşulların yanlış olduğu durumda çalıştırılır.

        if (sicaklik < 0) {
            System.out.println("Çok soğuk!");
        }
        else if (sicaklik < 10) {
            System.out.println("Soğuk.");
        }
        else if (sicaklik < 20) {
            System.out.println("Ilık.");
        }
        else {
            System.out.println("Sıcak.");
        }

        switch (gun) { //Switch Örneği
            case 1:
                System.out.println("bugün pazartesi ");
                break;
            case 2:
                System.out.println("bugün salı ");
                break;
            case 3:
                System.out.println("bugün çarşamba");
                break;
            default:
                System.out.println("İŞTE SENİN ZAMANIN BUGÜN O GÜNN ");
        }

        switch (gun) { //switch örneği, Bu örnekte, gun değişkeninin değeri 3 olduğu için "Çarşamba" çıktısını alırız.
            // Eğer hiçbir case ifadesi doğru olmasaydı, default bloğundaki kodlar çalıştırılacaktı.

            case 1:
                System.out.println("Pazartesi");
                break;

            case 2:
                System.out.println("Salı");
                break;

            case 3:
                System.out.println("Çarşamba");
                break;

            case 4:
                System.out.println("Perşembe");
                break;

            case 5:
                System.out.println("Cuma");
                break;

            case 6:
                System.out.println("Cumartesi");
                break;

            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Geçersiz gün");

        }

        char harf = 'B'; //Switch Örneği,

        switch (harf) {

            case 'A':
                System.out.println("Harika!");
                break;

            case 'B':
                System.out.println("İyi!");
                break;

            case 'C':
                System.out.println("Orta!");
                break;

            default:
                System.out.println("Geçersiz not.");

        }
    }
}

