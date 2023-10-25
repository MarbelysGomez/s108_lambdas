package S108_N1exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shortest_Longest {
    public static void main(String[] args) {
        List<Object> objectList = Arrays.asList("My", "birthday", "was", "on", "18", "08", "23");

        List<String> sortedStrings = objectList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .collect(Collectors.toList());

        System.out.println(sortedStrings);
    }
}
