package s108_lambdas.S108_N1exercise6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shortest_Longest sorter = new Shortest_Longest();
        List<Object> objectList = Arrays.asList("My", "birthday", "was", "on", "18", "08", "23");
        List<String> sortedStrings = sorter.sortStrings(objectList);
        System.out.println(sortedStrings);
    }
}
