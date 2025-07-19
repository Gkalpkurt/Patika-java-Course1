package hafta1_Pratik_Ders;

public class TernaryOperatör  {
    public static void main(String[] args) {
       String mesaj = "";
        int sayı = 4;
        mesaj = sayı > 10 ? "sayı 10'dan büyük" : sayı > 5
                 ? "sayı 5 ile 10 arasında" : "sayı 5'den küçük";
        System.out.println(mesaj);

        int sayi1 = 10; //örnek 1
        int sayi2 = 20;

        int enBuyuk = (sayi1 > sayi2) ? sayi1 : sayi2;

        System.out.println("En büyük sayı: " + enBuyuk);


    }
}
