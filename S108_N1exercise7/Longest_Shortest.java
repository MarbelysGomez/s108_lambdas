package S108_N1exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Longest_Shortest {
    public static void main(String[] args) {
        List<Object> objectList = Arrays.asList("My", "birthay", "was", "on", "18", "08", "23");

        List<String> sortedStrings = objectList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(sortedStrings);
    }
}
