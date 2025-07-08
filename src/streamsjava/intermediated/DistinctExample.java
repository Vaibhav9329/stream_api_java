package streamsjava.intermediated;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,2,2,3,3,4,9,9,9);
//    distinct will filter out duplicates form collection
        num.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
