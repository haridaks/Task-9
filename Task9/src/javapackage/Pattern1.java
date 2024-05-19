package javapackage;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// Q.3 to write in number pattern half pyramid model
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows for which you need number pattern");
		int n = sc.nextInt(); //getting input
		int num = 1;
		
		//outer loop
		
		for(int i=1; i<=n; i++) {
			
			//inner loop
			
			for(int j=1; j<=i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}}


