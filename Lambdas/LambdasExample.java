package patika_week_5;


import java.util.Arrays;
import java.util.List;

public class LambdasExample {

    public static void main(String[] args) {

        List<Integer> numbers;
        numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numbers.replaceAll(n -> n*2 );

        numbers.forEach(System.out::println);


    }
}
