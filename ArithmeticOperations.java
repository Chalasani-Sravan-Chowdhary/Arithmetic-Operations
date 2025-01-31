import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = 0;
        double modulus = 0;

        if (number2 != 0) {
            quotient = number1 / number2;
            modulus = number1 % number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.printf("Addition: %.2f + %.2f = %.2f%n", number1, number2, sum);
        System.out.printf("Subtraction: %.2f - %.2f = %.2f%n", number1, number2, difference);
        System.out.printf("Multiplication: %.2f * %.2f = %.2f%n", number1, number2, product);
        
        if (number2 != 0) {
            System.out.printf("Division: %.2f / %.2f = %.2f%n", number1, number2, quotient);
            System.out.printf("Modulus: %.2f %% %.2f = %.2f%n", number1, number2, modulus);
        }
        scanner.close();
    }
}