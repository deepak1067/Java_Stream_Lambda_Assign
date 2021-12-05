package JavaStream_Assign;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50);

        Stream lambda = (l) -> l.stream().filter(Main::isPrime).collect(Collectors.toList());

        List<Integer> result=lambda.filterPrimeNumbers(list);
        System.out.println(result);
    }

    public static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
    }

}
