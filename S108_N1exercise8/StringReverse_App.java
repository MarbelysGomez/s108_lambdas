package S108_N1exercise8;

public class StringReverse_App {
    public static void main(String[] args) {
        StringReverser reverser = str -> {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        };
        String input = "In reverse.";
        String result = reverser.reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reverse: " + result);
    }
}
