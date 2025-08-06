package hafta3_Pratik_Ders;

import java.util.HashSet;
import java.util.Set;

public class SetBook2 {
    public static void main(String[] args) {
        Set<SetBook> bookSet = new HashSet<>();
        SetBook  book1 = new SetBook("Clean Code " ,"Gökalp KURT");
        SetBook book2 = new SetBook("TRABZON ", "MAÇKA");
        SetBook book3 = new SetBook("61" , "07");


        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());


        System.out.println("Kütüphane : " + bookSet);
    }
}
