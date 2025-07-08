package streamsjava.intermediated;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
//    peek very simple function perform few operation on stream
//      it will not modify data in stream
//    mostly peek is used to peek the element in stream

    public static void main(String[] args) {
        List<Integer> num  = Arrays.asList(1,2,3,4,5);
        List<Integer> sqlist = num.stream()
                .map(n -> n*n)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
