# Student Record - Java hafta5_Ödevler.Records Örneği

Bu proje, Java **Record** yapısını kullanarak öğrencilerin temel bilgilerini saklayan basit bir öğrenci kayıt sistemi örneğidir.  
`Record` sınıfı immutable (değiştirilemez) yapıda olup, `toString()`, `equals()` ve `hashCode()` metotlarını otomatik olarak oluşturur.

---

## 📂 Proje Dosya Yapısı
src/
├── Student.java # Record sınıfı (firstName, lastName, studentId)
└── MainApp.java # Programın giriş noktası


---

## 🔹 Özellikler
- **Immutable Yapı**: Record alanları final olduğu için değiştirilemez.
- **Otomatik Metotlar**: `toString()`, `equals()`, `hashCode()` metotları Java tarafından otomatik oluşturulur.
- **Ek Metot**: `fullName()` metodu ile öğrencinin tam adı döndürülebilir.
- **Karşılaştırma**: `equals()` metodu ile iki öğrenci nesnesinin aynı olup olmadığı kontrol edilir.

---
