package javapackage;

import java.util.Scanner;

public class PallindromeOrNot {

	public static void main(String[] args) {
		  
		 String original, reverse = ""; // Objects of String class  
		  Scanner sc = new Scanner(System.in);//It is the number variable to be checked for palindrome  
		  System.out.println("Enter any string/number to know if it is pallindrome or not: ");
		  original = sc.nextLine();  
		    
		      int length = original.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");       
		}  
		}  
