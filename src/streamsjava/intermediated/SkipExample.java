package streamsjava.intermediated;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> no = num.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(no);
    }
}
