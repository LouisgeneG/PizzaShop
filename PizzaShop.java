/* Chapter 3 extra project
   Starting price is $12.99
   Topping cost 50 cents each
*/

/* Author : Louisgene
   Date   : 5/15/23
*/

// importation of packages
import java.util.Scanner;

public class PizzaShop{

	public static void main(String[] args)
	{
		//Declaration of variables and constants
		String customer;
		int toppings;

		// Creation of object
		Scanner input = new Scanner(System.in);
		Pizza pizza1 = new Pizza();

		// Input phase
		Pizza .intro();
		System.out.print("What name will the order be under?>>");
		customer = input.nextLine();
		System.out.print("Please enter the number of toppings >>");
		toppings = input.nextInt();

		// Processing phase
		pizza1.enterName(customer);
		pizza1.addToppings(toppings);
		pizza1.calcPrice();

       // Display the details
		pizza1.summary();
		System.out.print("");




	}
}