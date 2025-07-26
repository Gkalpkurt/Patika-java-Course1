package hafta2_Pratik_Ders;

public interface Vehicle {

        public void start(); // public kullanımı gereksiz. Çünkü doğası gereği methodlar public'tir.

        private void stop() {
            // Kod varlığı önemli değil
            // Java 8 öncesinde bu tanım hatalı
        }

        default void stop1() {
            // Java 8 öncesinde interface içerisinde default method tanımı yapılamazdı.
        }

        // default void stop2(); // default method ve body'si olmayan method tanımı yapılamaz.
    }


