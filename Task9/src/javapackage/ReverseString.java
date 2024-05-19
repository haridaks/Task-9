package javapackage;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the reverseString method to reverse the input string
        String reversed = reverseString(input);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the Scanner
        scanner.close();
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();

	}

}
