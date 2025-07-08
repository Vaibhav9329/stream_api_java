package streamsjava.intermediated;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

//        reduce : is use to reduce the collect element into one element perform an operation and reduce to one Element
//        reduce is terminal operation because it is return a result
         Integer sum = list.stream()
                .reduce(0,(a,b) -> a+b );
        System.out.println(sum);
    }
}
