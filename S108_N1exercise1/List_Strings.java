package s108_lambdas.S108_N1exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class List_Strings {
    public static List<String> filterStrings(List<String> stringList){
        return stringList.stream()
                .filter(str -> str.contains("o"))
                .collect(Collectors.toList());
    }
}
