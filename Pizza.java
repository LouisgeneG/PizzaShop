
/* Chapter 3 extra project
   Starting price is $12.99
   Topping cost 50 cents each
*/


/* Author : Louisgene
   Date   : 5/15/23
*/

// Create a class called Pizza
public class Pizza
{
	// Declaration of variables
	private String custName;
	private double price;
	private int numToppings;

	// new constructor method for the Pizza class
	public Pizza()
	{
		custName = "Customer";
		price = 12.99;
		numToppings = 0;
	}// end of constructor method

	// basic static method for this class
	public static void intro()
	{
      System.out.println("*********************************");
      System.out.println("Welcom to the Digital Pizza Shop!");
      System.out.println("*********************************");
	}// end of intro() method

//  <editor-fold defaultstate="collapsed" desc="Mutator">

   // mutator (setter) methods for the Pizza class
	public void enterName(String name)
	{
		 custName = name;

	}// end of enterName() method

     
	 public void addToppings(int number)
	 {
	 	numToppings = number;

	 } //end of addToppings() method

	 public void calcPrice()
	 {
	 	price = price + (numToppings * .50);
	 }// end of calcPrice() method


   // accessor (getter) methods fot the Pizza class
	 public void summary()
	 {
	 	System.out.println();
	 	System.out.println("Thank you," + custName);
	 	System.out.println("A Pizza with " + numToppings + "topping(s) will cost: $" + price);
	 } // end of summary() method




}// end of Pizza class

