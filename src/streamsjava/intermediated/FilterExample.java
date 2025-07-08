package streamsjava.intermediated;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        num.stream()
                .filter(n -> n%2==0)     // filter as gate which will block few elemets and which will allow to few elemet to pass
                .forEach(System.out::println);
    }
}
