# patika-bootcamp-homework-week5
Patika.dev Java Backend Bootcamp week5  homework submissions
# Method Reference ile Liste Elemanlarını Yazdırma

Bu proje, Java 8 ile birlikte gelen **method reference** özelliğini kullanarak bir `List<String>` içindeki elemanların ekrana yazdırılmasını göstermektedir.

## 📌 Amaç
- Geleneksel `for-each` döngüsü yerine **`forEach`** metodu ve **method reference** kullanmak.
- Daha kısa ve okunabilir kod yazmak.

## 🛠 Kullanılan Java Özellikleri
1. **`List.forEach()`** – Listedeki her elemana işlem uygulamak için.
2. **Method Reference (`System.out::println`)** – Lambda ifadelerinin kısaltılmış ve okunabilir versiyonu.

## 💻 Kod
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // for-each yerine method reference kullanımı
        names.forEach(System.out::println);
    }
}
📤 Örnek Çıktı
Ahmet
Ayşe
Mehmet
Zeynep
📚 Notlar
System.out::println ifadesi, name -> System.out.println(name) lambda ifadesinin kısaltmasıdır.

forEach metodu, listedeki her elemana sırayla işlem uygular.

Method reference, kodun daha kısa ve okunabilir olmasını sağlar.