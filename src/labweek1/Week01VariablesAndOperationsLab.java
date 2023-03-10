//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package labweek1;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight
		
		int seatsLeft = 20;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		
		double checkOTot = 108.04;

		
		// 3. Create a variable to hold a person's middle initial
		
		char midInitial = 'I';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
		boolean isItHot = true;

		
		// 5. Create a variable to hold a customer's first name
		
		String firstName = "Ana";

		
		// 6. Create a variable to hold a street address

		String stAddress = "742 Evergreen Terrace";
		
		// 7. Print all variables to the console
		
		System.out.println("Seats left: " +seatsLeft + " Check out Total: $"+ checkOTot +
		" Middle Initial: "+ midInitial +" Is it hot outside? "+ isItHot +" First Name: "
		+ firstName +" Street Addres: "+ stAddress);
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		
		seatsLeft -= 2;
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		
		checkOTot += 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		midInitial = 'F';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		
		isItHot = false;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		
		String fullName = firstName +" " +midInitial +" "+ "Smith";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
				
		System.out.println("Hello, I am "+ fullName + " and I live at "+stAddress);

		
		
	}
}