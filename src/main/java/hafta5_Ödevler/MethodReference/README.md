# Çok Sınıflı Method Reference Örneği

Bu proje, **method reference** kullanımını birden fazla sınıf ile göstermektedir.

---

## 📌 Sınıflar

1. **Main.java**
    - Programın giriş noktasıdır.
    - `NameRepository` sınıfından isim listesini alır.
    - `NamePrinter` sınıfını kullanarak method reference ile isimleri ekrana yazdırır.

2. **NamePrinter.java**
    - İsimleri ekrana yazdırmaktan sorumludur.
    - `printName(String name)` adlı statik metoda sahiptir.

3. **NameRepository.java**
    - İsim listesini tutar ve döndürür.
    - İçerisinde `List<String>` tipinde örnek isimler barındırır.

---

## ▶️ Çalıştırma Adımları

1. Terminali proje klasörü içinde açın.
2. Tüm `.java` dosyalarını derleyin:

   ```bash
   javac src/*.java
Programı çalıştırın:


java -cp src Main
✅ Beklenen Çıktı

Gökalp
Sude
Müzeyyen
Şeyma
Hümeyra
Yusuf
📚 Önemli Nokta
Bu proje, ClassName::methodName şeklindeki method reference kullanımının, geleneksel for döngüsüne göre nasıl daha kısa ve okunabilir olduğunu göstermektedir.