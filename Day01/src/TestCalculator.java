import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new CalculatorImpl();

        System.out.println("input the first number: ");
        double num1 = scan.nextInt();

        System.out.println("sum: " + calc.getSum(num1, 20));
        System.out.println("subtract: " + calc.getSubtract(num1, 5));
        System.out.println("multiply: " + calc.getMultiply(num1, 20));
        System.out.println("division: " + calc.getDivision(num1, 20));
    }
}
