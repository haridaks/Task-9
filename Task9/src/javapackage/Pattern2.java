package javapackage;

public class Pattern2 {

	public static void main(String[] args) {
		// Q.4 Pattern star
		int size = 3;
		
		// Upper part of the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}