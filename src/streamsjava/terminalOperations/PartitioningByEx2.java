package streamsjava.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByEx2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> partBymap =
                num.stream()
                        .collect(Collectors.partitioningBy(no-> no%2==0));

        System.out.println("even numbers");
        partBymap.get(true).forEach(System.out::println);

        System.out.println("Odd numbers");
        partBymap.get(false).forEach(System.out::println);
    }
}
