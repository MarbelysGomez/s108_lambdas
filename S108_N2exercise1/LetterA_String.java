package s108_lambdas.S108_N2exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class LetterA_String {
    public static List<String> filterNames(List<String> properNames) {
        return properNames.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());
    }
}
