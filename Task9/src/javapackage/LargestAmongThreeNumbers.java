package javapackage;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// Q.7 Java program to find largest among three
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second num:");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		
		int largest = num1;
		
		if(num2 > largest) {
			
		   largest = num2;
		}
		if(num3 > largest) {
			
			largest = num3;
		}
		
		System.out.println("The largest number is " +largest);
		

	}

}
