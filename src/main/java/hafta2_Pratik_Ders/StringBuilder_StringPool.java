package hafta2_Pratik_Ders;

public class StringBuilder_StringPool {
    public static void main(String[] args) {

            String name = "patika.dev";
            System.out.println(name);

            var name2 = name.replace('p', 'P');
            System.out.println(name2);
            System.out.println(name);

            StringBuilder stringBuilder = new StringBuilder(); // String'ler immutable (değiştirilemez)
            stringBuilder.append("patika");
            System.out.println(stringBuilder);

            System.out.println();

            StringBuilder alphabet = new StringBuilder(); // mutable bir yapıdır

            for (char current = 'a'; current <= 'z'; current++) {
                alphabet.append(current); // (String) alphabet+current
            }

            System.out.println(alphabet);

            StringBuilder builder = new StringBuilder(); // mutable bir yapıdır.
        builder.append("patika")
                .append(" .dev")
                .append(" java");
        builder.append(" eğitimi");

        System.out.println(builder);

        System.out.println();

        var hello = "hello patika";
        var hello2 = "hello patika";

        System.out.println(hello.equals(hello2)); //değeri eşit mi ?
        System.out.println(hello == hello2); // hafızadaki verileri eşit mi

        String s = "Hello World";
        String s1 = " Hello World".trim();


        System.out.println(s == s1);

        var singleString = "hello world";
        var concat = "hello";
        concat += "world";

        System.out.println();

        System.out.println(singleString.equals(concat));
        System.out.println(singleString == concat);
        System.out.println();

        var hello3 = "hello world";
        var hello4 = new  String("Hello World").intern();

        System.out.println(hello3 == hello4);










        }
    }
