package s108_lambdas.S108_N1exercise5;

public class Functional_Interface_App {
    public static void main(String[] args) {
        Functional_Interface functionalInterface = () -> 3.1415;
        System.out.println("Value of Pi = " + functionalInterface.getPiValue());
    }
}
