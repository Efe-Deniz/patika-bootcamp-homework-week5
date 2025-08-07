# patika-bootcamp-homework-week5
Patika.dev Java Backend Bootcamp week5  homework submissions
# 👨‍💼 Employee Information System (Inner Class Kullanımı)

Bu Java uygulaması, bir şirketteki çalışanların temel bilgilerini ve iletişim bilgilerini tutmak için `Inner Class` yapısını kullanır.  
Amaç, çalışanların iletişim bilgilerini sadece onlara özel olacak şekilde `ContactInfo` iç sınıfında saklamaktır.

---

## 🧱 Sınıf Yapısı

### 🟦 Employee (Dış Sınıf)

Çalışanın temel bilgilerini tutar:

- `firstName` → Ad
- `lastName` → Soyad
- `birthDate` → Doğum tarihi
- `position` → Pozisyon

#### Metotlar:
- `printEmployeeInfo()` → Çalışanın ad, soyad, doğum tarihi ve pozisyon bilgilerini yazdırır.

---

### 🟨 ContactInfo (İç Sınıf)

Yalnızca bir çalışanın iletişim bilgilerini tutar:

- `phoneNumber` → Telefon numarası
- `email` → E-posta adresi

#### Metotlar:
- `printContactInfo()` → Telefon ve e-posta bilgilerini yazdırır.

---

## 🚀 Kullanım

### `EmployeeTest.java` içindeki örnek kullanım:

```java
Employee employee = new Employee("Ali", "Yılmaz", "1990-05-12", "Yazılım Geliştirici");
Employee.ContactInfo contactInfo = employee.new ContactInfo("0555 123 45 67", "ali.yilmaz@example.com");

employee.printEmployeeInfo();
System.out.println("---- İletişim Bilgileri ----");
contactInfo.printContactInfo();

🎯 Kazanımlar
Inner Class (iç sınıf) kavramını gerçek bir senaryoda kullanma

Nesne tabanlı veri kapsülleme pratiği

Sınıflar arası ilişkiyi doğru kurma

📌 Geliştirme Önerileri
ArrayList ile birden fazla çalışan tanımı

Kullanıcıdan giriş alarak dinamik çalışan ekleme

JSON veya CSV dosyasına kayıt alma

Swing veya JavaFX arayüzüyle görselleştirme