package javapackage;

import java.util.Scanner;

public class HotelTariffUsingSwitchCase {

	public static void main(String[] args) {
		// Q.6 Hotel tariff using switch case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter(1-12) indicating month of the year");
		int month = sc.nextInt();
		/*System.out.println("Hotel Rent per day based on the selected month");
		float rent = sc.nextFloat();*/
	    System.out.println("Enter Number of days stayed");
	    int days = sc.nextInt();
	    
	     double rentperday = 1500;
	     double rent;
	     
	     switch(month){
	    	 case 4: rentperday *= 1.2; break;
	    	 case 5: rentperday *= 1.2; break;
	    	 case 6: rentperday *= 1.2; break;
	    	 case 11: rentperday *= 1.2; break;
	    	 case 12: rentperday *= 1.2; break;  
	    }
	     
	     rent = rentperday * days;
	     
	     System.out.println("Hotel Tariff to be paid is "+rent);
	}

}
