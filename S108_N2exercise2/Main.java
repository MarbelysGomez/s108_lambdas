package s108_lambdas.S108_N2exercise2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(18, 9, 23);
        String result = EvenNumber_OddNumber.processNumbers(numbers);
        System.out.println(result);
    }
}
