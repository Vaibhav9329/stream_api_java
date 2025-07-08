package streamsjava.intermediated;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String >> listoflist = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f"),
                Arrays.asList("g","h")
        );
// when we have some  complex data structure we can use flatmap
//        to flating the data though data structure , so that you can perform operation on each inside that collection

        listoflist.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
