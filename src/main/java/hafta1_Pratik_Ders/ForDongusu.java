package hafta1_Pratik_Ders;

public class ForDongusu {
    public static void main(String[] args) {

        /**
         *for
         *foeach
         * while
         * do-while
         */

        int sum = 0;


        for (int i = 1; i < 1000 ; i++){
            System.out.println(i);
            sum = sum + i ;

        }

        int result =0;
                for (int j = 0 ; j <=1000; j++){ //j++ ; j = j+1;
                    if (j % 5 == 0) {

                        System.out.println(j);
                       // result = result + j; (uzun yazımı bu alttaki kısa olanı)
                        result += j;


                    }
                }

        System.out.println("5 e bölünen sayıların toplamı:" + result);
    }
}


