# patika-bootcamp-homework-week5
Patika.dev Java Backend Bootcamp week5  homework submissions
# 📅 Enum ile Haftalık Çalışma Planı

Bu Java konsol uygulaması, bir şirketin haftalık çalışma saatlerini `enum` kullanarak temsil eder. Kullanıcıdan bir gün ismi alınarak o güne ait çalışma saatleri gösterilir. Ayrıca kullanıcı tüm haftanın çalışma programını görüntüleyebilir ve sistemden çıkabilir.

## 🧩 Kullanılan Yapılar

- Java `enum` yapısı
- `Scanner` ile kullanıcı girişi
- `try-catch` ile hata yönetimi
- `while` döngüsü ile tekrar eden kullanıcı menüsü

## 🚀 Nasıl Çalışır?

Uygulama açıldığında kullanıcıya şu seçenekler sunulur:

- Bir gün ismi girerek (örn: `MONDAY`) o günün çalışma saatlerini öğrenebilir.
- `HAFTA` yazarak haftanın tüm günlerini ve saatlerini görebilir.
- `Q` yazarak sistemden çıkış yapabilir.

## 💡 Örnek Kullanım

```text
Lütfen bir gün giriniz (veya 'HAFTA' yazarak tüm haftayı görebilir, 'Q' ile çıkabilirsiniz):

> monday
Çalışma Saatleri: 09:00 - 17:00

> hafta
MONDAY: 09:00 - 17:00  
TUESDAY: 09:00 - 17:00  
...  
SUNDAY: Off

> q
Sistemden Çıkış Yapılıyor!!

✨ Öğrenilen Konular
Enum sabitlerine özel veri atama

Enum constructor ve getter metodu tanımlama

Enum üzerinden veri erişimi

Kullanıcıdan gelen string veriyi Enum.valueOf() ile eşleme

Hatalı girişleri yönetme (exception handling)

🛠️ Geliştirme Önerileri
Swing veya JavaFX ile grafik arayüz desteği eklenebilir.

Kullanıcının saatleri değiştirebildiği bir admin modu eklenebilir.

Saat bilgileri bir dosyaya kaydedilebilir veya oradan okunabilir.