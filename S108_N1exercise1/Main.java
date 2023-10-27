package s108_lambdas.S108_N1exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Gold", "Aqua", "Sun", "Bee", "Ink");
        List<String> result = List_Strings.filterStrings(stringList);
        System.out.println(result);
    }
}
