package s108_lambdas.S108_N1exercise7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Longest_Shortest sorter = new Longest_Shortest();
        List<Object> objectList = Arrays.asList("My", "birthday", "was", "on", "18", "08", "23");
        List<String> sortedStrings = sorter.sortStrings(objectList);
        System.out.println(sortedStrings);
    }
}
