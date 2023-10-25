package S108_N2exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber_OddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(18, 9, 23);
        String result = processNumbers(numbers);
        System.out.println(result);
    }
    public static String processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(i -> (i % 2 == 0 ? "e" : "O") + i)
                .collect(Collectors.joining(","));
    }
}
