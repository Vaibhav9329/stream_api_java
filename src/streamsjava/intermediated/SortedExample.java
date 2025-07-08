package streamsjava.intermediated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,2,6,1,9);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> words =
                Arrays.asList("apple","kiwi","blackberries","chikoo","pinyapple","watermelon","pi","a","banana","grapes");

        words.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\n");

        words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
