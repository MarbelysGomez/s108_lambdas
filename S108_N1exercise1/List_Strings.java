package S108_N1exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_Strings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Gold", "Aqua", "Sun", "Bee", "Ink");
        List<String> result = filterStrings(stringList);
        System.out.println(result);
    }
    public static List<String> filterStrings(List<String> stringList){
        return stringList.stream()
                .filter(str -> str.contains("o"))
                .collect(Collectors.toList());
    }
}
