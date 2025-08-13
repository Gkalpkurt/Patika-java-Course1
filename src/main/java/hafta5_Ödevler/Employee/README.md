# Employee Contact Info - Inner Class Örneği

Bu proje, **Java Inner Class** kullanarak bir şirketin çalışanlarının iletişim bilgilerini yönetmeyi gösterir.  
Outer Class (**Employee**) çalışanın ad ve soyad bilgisini, Inner Class (**ContactInfo**) ise telefon ve e-posta bilgilerini tutar.

---

## 📂 Proje Dosya Yapısı
src/
├── Employee.java # Outer Class (çalışan bilgileri) + Inner Class (iletişim bilgileri)
└── MainApp.java # Programın giriş noktası


---

## 🔹 Özellikler
- **Inner Class Kullanımı**: Çalışanın iletişim bilgileri, `Employee` sınıfının içinde tanımlanan `ContactInfo` sınıfında saklanır.
- **Bağlılık**: `ContactInfo`, yalnızca ilgili `Employee` nesnesine ait olabilir.
- **Temiz Kod**: Outer ve Inner class aynı dosyada tutulur, yönetim kolaydır.

---