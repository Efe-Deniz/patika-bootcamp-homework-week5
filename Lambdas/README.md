# patika-bootcamp-homework-week5
Patika.dev Java Backend Bootcamp week5  homework submissions
# LambdasExample

Bu proje, Java 8 ile birlikte gelen **lambda ifadeleri** ve **metot referansları** kullanılarak liste elemanlarının işlenmesini gösteren basit bir örnektir.

## 📌 Amaç
- Bir `List<Integer>` içindeki sayıları **iki katına çıkarmak**.
- Geleneksel `for` döngüsü yerine **lambda ifadeleri** ile daha kısa ve okunabilir kod yazmak.

## 🛠 Kullanılan Java Özellikleri
1. **`Arrays.asList()`** – Sabit boyutlu liste oluşturmak için.
2. **`List.replaceAll()`** – Listedeki her elemana lambda uygulayarak yerinde güncelleme yapmak için.
3. **`List.forEach()`** – Listedeki her elemana işlem uygulamak için (bu örnekte ekrana yazdırma).
4. **Metot Referansı (`System.out::println`)** – Lambda ifadesinin kısaltılmış hali.

## 💻 Kod
```java
import java.util.Arrays;
import java.util.List;

public class LambdasExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Elemanları 2 ile çarp
        numbers.replaceAll(n -> n * 2);

        // Sonuçları ekrana yazdır
        numbers.forEach(System.out::println);
    }
}
📤 Örnek Çıktı
2
4
6
8
10
12
14
16
18
📚 Notlar
Arrays.asList() ile oluşturulan liste sabit boyutludur. Eleman sayısı değiştirilemez (add/remove kullanılamaz).

replaceAll() metodu liste elemanlarını yerinde günceller.

forEach(System.out::println) kodu, listedeki her elemanı alt alta yazdırır