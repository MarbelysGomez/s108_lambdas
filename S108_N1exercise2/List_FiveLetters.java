package s108_lambdas.S108_N1exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_FiveLetters {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Gold", "Aqua", "Sun", "Marco", "Yellow");
        List<String> result = filterStrings(stringList);
        System.out.println(result);
    }
    public static List<String> filterStrings(List<String> stringList){
        return stringList.stream()
                .filter(str -> str.contains("o") && str.length() > 5)
                .collect(Collectors.toList());
    }
}
