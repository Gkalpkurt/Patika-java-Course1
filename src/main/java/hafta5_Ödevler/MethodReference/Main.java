package hafta5_Ödevler.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gökalp");
        names.add("Sude");
        names.add("Müzeyyen");
        names.add("Şeyma");
        names.add("Hümeyra");
        names.add("Yusuf");

        names.forEach(NamePrinter::printName);
    }
}