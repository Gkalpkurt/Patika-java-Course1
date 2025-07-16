package hafta1;

public class main {


public static void main(String[] args) {

    System.out.println("Hello Patika Dev1");


    System.out.println("Hello Patika Dev2");

    System.out.println("Hello Patika Dev3");

    int i = 30;

    int i1 = 50;

    boolean isA;

    isA = true;

    isA = false;

  i = -5000;

  i1 = 300 + i;

  byte b =127 ;

  b = -128 ;

  char c = 'c';

    System.out.println(c);

    char c1 = 'A';

    System.out.println(c1);

    int i3 = 2147483647;

    long l;

    l = 200;

    long l1 = 100;

    int sum = 100 + 200;

    int x = 10 ;
    int y = 20 ;

    int sum1 = x+ y;

    System.out.println("Toplam:" + sum1);

    int result= x - y ;

    System.out.println("Çıkarma:" + result);


    int result1 = x + y;
    System.out.println("Çarpma" + result1);

    int result2 = x / y;
    System.out.println("Bölme" + result2);

    int result3 = x % y;
    System.out.println("mod" + result3);

    boolean isEquals = x == y;
    boolean isEquals1 = 10 == y;

    boolean isEquals2 = x != y;
    boolean Greather = x > 20;
    boolean isEqualsOrGreather = x >= 20;
    boolean isLessThan = x < 5;
    boolean isEqualsOrLess = x <= result2;

    boolean isTrue = isEquals && isEquals1;
    boolean isTrue1 = true && false;

    boolean isFalse = false || true;
    boolean isFalse1 = (false || true) && (false && false) || (true && true && false);


    String name = "merhaba dünya";
    System.out.println(name);

    int length = name.length();
  System.out.println(length);
  
  System.out.println( name.toLowerCase());

  String toUpper = name.toUpperCase();
  System.out.println(toUpper);

  System.out.println(name.charAt(5));
  System.out.println("merhaba patika".substring(8));
  String hi = "merhaba, ";
  System.out.println(hi + "patika");

  boolean isStringsEquals = hi. equals(name);
  System.out.println(isStringsEquals);
  boolean isStringsEquals1 = "hi".equals("patika");
  System.out.println(isStringsEquals1);

  String s1 = "Java";
  String s2 = new String("Java");
  String s3 = "Java";
  String s4 = "java";

  System.out.println("s1 esit mi s2" + s1.equals(s2));
  System.out.println("s1 esit mi s4" + s1.equals(s4));

  System.out.println("s1 eşit mi s4" + s1 == s4);
  System.out.println("s1 eşit mi s2" + s1 == s2);

  System.out.println(s1 == s2);



  













}
}
