//Qus5. Write a Java program that reads an integer from the user and divides 100 by the entered number. Implement exception handling to manage scenarios where the user enters zero (which causes a division by zero) and when the user inputs a non-integer value.


import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) { // Keep asking until a valid integer is entered
            try {
                // Prompt user for input
                System.out.print("Enter an integer: ");

                if (!scanner.hasNextInt()) { // Check if input is NOT an integer
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                    continue; // Restart the loop
                }

                number = scanner.nextInt(); // Read integer

                // Perform division
                int result = 100 / number;
                System.out.println("100 divided by " + number + " is: " + result);
                break; // Exit loop if successful

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }

        scanner.close();
        System.out.println("Program execution completed.");
    }
}
