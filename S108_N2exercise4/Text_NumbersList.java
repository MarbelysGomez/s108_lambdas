package s108_lambdas.S108_N2exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Text_NumbersList {
    private List<String> list;
    void execute() {
    list = new ArrayList<>();
        list.add("blue");
        list.add("black");
        list.add("violet");
        list.add("pink");

        list.add(String.valueOf(20));
        list.add(String.valueOf(5));

        list.sort(Comparator.comparing(s -> s.charAt(0)));

        list.sort((s1, s2) -> s1.contains("e") ? -1 : s2.contains("e") ? 1 : 0);

        list = list.stream()
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toList());

        list.stream()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);
    }
}
