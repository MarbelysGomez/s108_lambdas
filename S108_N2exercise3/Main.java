package s108_lambdas.S108_N2exercise3;

public class Main {
    public static void main(String[] args) {
        Math_Operations addition = (a,b) -> a + b;
        Math_Operations subtraction = (a,b) -> a - b;
        Math_Operations multiplication = (a,b) -> a * b;
        Math_Operations division = (a,b) -> a / b;

        System.out.println("Addition: 20 + 5 = " + addition.operation(20, 5));
        System.out.println("Subtraction: 20 - 5 = " + subtraction.operation(20, 5));
        System.out.println("Multiplication: 20 * 5 = " + multiplication.operation(20, 5));
        System.out.println("Division: 20 / 5 = " + division.operation(20, 5));
    }
}
