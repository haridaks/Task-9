package javapackage;

import java.util.Scanner;

public class GradingSystemUsingSwitchCase {

	public static void main(String[] args) {
		// Q.5 Anna university grading system
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		int mark = sc.nextInt();
		 
		if(mark == 100) {
			System.out.println("Your grade is S");
			}
		if(mark>=90 && mark<=99) {
			System.out.println("Your grade is A");
		}
		if(mark>=80 && mark<=89) {
			System.out.println("Your grade is B");
		}
		if(mark>=70 && mark<=79) {
			System.out.println("Your grade is C");
		}
		if(mark>=60 && mark<=69) {
			System.out.println("Your grade is D");
		}
		if(mark>=50 && mark<=59) {
			System.out.println("Your grade is E");
		}
		if(mark < 50) {
			System.out.println("F");
		}

	}

}
