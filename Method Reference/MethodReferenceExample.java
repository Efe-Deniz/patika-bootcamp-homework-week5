package patika_week_5;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        names.forEach(System.out::println);

    }
}
