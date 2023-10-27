package s108_lambdas.S108_N1exercise8;

public class Main {
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
