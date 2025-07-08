package streamsjava.intermediated;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice","wednesday","bob","charlie");

        //map will act as transformer : it will transformer your element from element A to B some other formate
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
