package streamsjava.intermediated;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvetToStream     {
    public static void main(String[] args) {
//        primitive array
        int[] arr={1,2,4,5,6};
        //object array

        Integer[] objarr = {1,2,3,4,5};

//        final IntStream intStream = Arrays.stream(arr);
//        intStream.forEach(System.out::println);
//
//        final Stream<Integer> inst  = Stream.of(objarr);
//        inst.forEach(System.out::println);

        List<String> list1 = List.of("apple","mango","banans");
        list1.stream()
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(10, 50,20, 30, 40,50,20,10,30);
//        list.stream()
//                .forEach(System.out::println);

        Set<Integer> set = new HashSet<>(list);
        set.stream()
                .forEach(System.out::println);


    }

}
