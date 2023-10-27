package s108_lambdas.S108_N1exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class List_FiveLetters {
    public static List<String> filterStrings(List<String> stringList){
        return stringList.stream()
                .filter(str -> str.contains("o") && str.length() > 5)
                .collect(Collectors.toList());
    }
}
