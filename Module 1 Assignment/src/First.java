//Qus1. Write a Java method that takes a character input parameter and determines whether it's a vowel (a, e, i, o, u) or a consonant using a switch statement.

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        VowelOrConsonant(ch); // Call the method

        scanner.close();
    }

    // Method to determine if a character is a vowel or consonant
    public static void VowelOrConsonant(char ch) {
        char lowerCh = Character.toLowerCase(ch); // Convert to lowercase to handle uppercase input

        switch (lowerCh) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                // Check if it's an alphabet character
                if ((lowerCh >= 'a' && lowerCh <= 'z')) {
                    System.out.println(ch + " is a consonant");
                } else {
                    System.out.println(ch + " is not a letter");
                }
        }
    }
}
