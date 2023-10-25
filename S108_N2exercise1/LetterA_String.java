package S108_N2exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LetterA_String {
    public static void main(String[] args) {
        List<String> properNames = Arrays.asList("Ana", "Alex", "Ali", "Amy", "Andres");
        List<String> filteredNames = filterNames(properNames);
        System.out.println(filteredNames);
    }
    public static List<String> filterNames(List<String> properNames) {
        return properNames.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());
    }
}
