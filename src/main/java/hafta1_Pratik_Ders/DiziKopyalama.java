package hafta1_Pratik_Ders;

public class DiziKopyalama {
    public static void main(String[] args) {


        int[] dizi1 = {2, 3, 4, 5, 6, 7, 61, 07, 12, 2023,};
        int[] dizi2 = new int[dizi1.length];

        System.arraycopy(dizi1, 3, dizi2, 0, 6 );
        for (int i = 0; i < dizi2.length; i++) {
            if (dizi2 [i] !=0){
                System.out.println(dizi2[1]);
            }
        }
    }
}