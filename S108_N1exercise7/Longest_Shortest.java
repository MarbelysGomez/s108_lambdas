package s108_lambdas.S108_N1exercise7;

import java.util.List;
import java.util.stream.Collectors;

public class Longest_Shortest {
    public List<String> sortStrings(List<Object> objectList) {
    return objectList.stream()
            .filter(obj -> obj instanceof String)
            .map(obj -> (String) obj)
            .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
            .collect(Collectors.toList());
    }
}
