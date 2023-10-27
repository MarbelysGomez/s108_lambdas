package s108_lambdas.S108_N1exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Gold", "Aqua", "Sun", "Marco", "Yellow");
        List<String> result = List_FiveLetters.filterStrings(stringList);
        System.out.println(result);
    }
}
