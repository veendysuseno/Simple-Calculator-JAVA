import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value1, value2, result;
        String operation;

        while (true) {
            // Display menu
            displayMenu();

            // Get user's choice
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using this calculator. Goodbye!");
                break;
            }

            // Get values from user
            System.out.print("Enter value 1: ");
            value1 = scanner.nextFloat();

            System.out.print("Enter value 2: ");
            value2 = scanner.nextFloat();

            // Perform the selected operation
            switch (choice) {
                case 1:
                    result = value1 + value2;
                    operation = "+";
                    break;
                case 2:
                    result = value1 - value2;
                    operation = "-";
                    break;
                case 3:
                    result = value1 * value2;
                    operation = "*";
                    break;
                case 4:
                    if (value2 != 0) {
                        result = value1 / value2;
                        operation = "/";
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Display result
            System.out.println("RESULT: " + value1 + " " + operation + " " + value2 + " = " + result + "\n");
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("=============================");
        System.out.println("      SIMPLE CALCULATOR");
        System.out.println("=============================");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.println("=============================");
    }
}
