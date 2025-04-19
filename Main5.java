import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example 1: Handling Division by Zero
        try {
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();
            
            // This might throw an ArithmeticException (division by zero)
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        // Example 2: Handling Invalid Input
        try {
            System.out.print("\nEnter an integer: ");
            String input = scanner.next();
            int number = Integer.parseInt(input);  // This can throw NumberFormatException
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Please enter a valid integer.");
        }

        // Example 3: Using Finally block
        try {
            System.out.println("\nTrying to access an element in array...");
            int[] arr = new int[3];
            arr[4] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } finally {
            System.out.println("Finally block executed: Always runs.");
        }

        // Close the scanner in the end
        scanner.close();
    }
}

