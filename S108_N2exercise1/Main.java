package s108_lambdas.S108_N2exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> properNames = Arrays.asList("Ana", "Alex", "Ali", "Amy", "Andres");
        LetterA_String letterAString = new LetterA_String();
        List<String> filteredNames = letterAString.filterNames(properNames);
        System.out.println(filteredNames);
    }
}
