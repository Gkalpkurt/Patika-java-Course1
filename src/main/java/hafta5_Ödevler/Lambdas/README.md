# Java Lambda Örneği – Çok Sınıflı Proje

Bu proje, **Java Lambda ifadelerini** ve **Stream API** kullanarak bir listenin elemanlarını iki katına çıkarmayı ve ekrana yazdırmayı gösterir.  
Kod yapısı **çok sınıflı** olarak tasarlanmıştır.

---

## 📂 Proje Yapısı

src/
├── Main.java # Programın giriş noktası
├── NumberProcessor.java # Sayıların işlenmesini yapan sınıf
└── Printer.java # Sayıları ekrana yazdıran sınıf


---

## 🚀 Çalıştırma

1. Projeyi bilgisayarınıza indirin veya kopyalayın.
2. Terminal / Komut satırında `src` klasörüne gidin.
3. Aşağıdaki komutlarla derleyin ve çalıştırın:

```bash
javac Main.java NumberProcessor.java Printer.java
java Main
📌 Kod Açıklaması
NumberProcessor
doubleNumbers() metodu, verilen listenin her elemanını lambda (map) ile 2 ile çarpar ve yeni bir liste döndürür.

Printer
printList() metodu, verilen listeyi lambda (forEach) ile ekrana yazdırır.

Main
Programın giriş noktasıdır. Liste oluşturur, NumberProcessor ile işler ve Printer ile ekrana yazdırır.

✅ Örnek Çıktı

2
4
6
8
10
🎯 Öğrenilenler
Java lambda ifadeleri (n -> n * 2, n -> System.out.println(n))

Stream API (map, forEach, toList)

Çok sınıflı proje yapısı ile kodun temiz ve düzenli tutulması