# Weekly Work Schedule Program
Bu proje, bir şirketin haftalık çalışma planlarını **Java Enum** yapısı kullanarak yönetmesini sağlar.  
Kullanıcıdan gün adı alınır (Türkçe veya İngilizce) ve o güne ait çalışma saatleri ekrana yazdırılır.

---

## 📂 Proje Dosya Yapısı
src/
├── Day.java # Haftanın günlerini ve çalışma saatlerini tutan Enum
├── WorkSchedule.java # Kullanıcıdan alınan gün bilgisini işleyip çalışma saatini bulan sınıf
└── MainApp.java # Programın giriş noktası (main metodu)


---

## 🔹 Özellikler
- **Enum Kullanımı**: `Day` enum'ı haftanın 7 gününü ve çalışma saatlerini tutar.
- **Çok Dilli Gün Tanıma**: Hem İngilizce (`MONDAY`) hem Türkçe (`Pazartesi`) girişleri destekler.
- **Modüler Yapı**: Kod 3 farklı dosyaya bölünerek okunabilirlik artırılmıştır.
- **Saat Formatı**: Saatler `HH:mm` formatında gösterilir.

---

## 🚀 Çalıştırma
1. **Projeyi klonlayın veya indirin**
   ```bash
   git clone <repo-link>
   cd weekly-work-schedule
   
Java dosyalarını derleyin


javac Day.java WorkSchedule.java MainApp.java
Programı çalıştırın


java MainApp
Girdi örnekleri


Günü girin (ör: MONDAY / Pazartesi): Pazartesi
MONDAY çalışma saatleri: 09:00 - 17:00
📌 Örnek Çalışma
Konsol:


Günü girin (ör: MONDAY / Pazartesi): Perşembe
THURSDAY çalışma saatleri: 09:00 - 17:00