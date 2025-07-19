package hafta1_Pratik_Ders;

import java.sql.Array;
import java.util.Arrays;

public class PassByValueVePassByReference1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        modifyArray(numbers);
        System.out.println(Arrays.toString(numbers));  // Output: [2, 3, 4]
    }
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }
}

