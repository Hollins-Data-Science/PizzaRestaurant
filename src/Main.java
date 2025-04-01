/*
The Main class should handle running the point of sale system for the pizza restaurant.

You should allow the user to input multiple orders each with multiple pizzas. 
Pizzas can be either traditional or deep dish, and have a variety of toppings. 
You should have the user enter a string like "pm", where each letter stands for a topping, e.g. "pm" would be pepperoni and mushrooms. 
See the Topping class for an initial list of toppings. You are free to add more.

I recommend creating multiple static methods in this Main class for specific purposes. 
One might handle reading in a single pizza and adding it to the current order. 
Another might handle reading in an order of pizzas (and in doing so calling the previous method), adding that order to your restaurant. 
Break up the task like that.

After the user is done inputting all of their orders, the program should print out all of the orders
 (using the Restaurant's printOrders method) and the price of the priciest order (found using the Restaurant's priciestOrder method).

If you are working in a group (max size 2), add two extra features of your choice. 
Examples of features might be a new type of pizza or the ability to find the average price of a pizza.  
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Use a scanner to read in input.
    // I recommend passing this scanner into your methods that take orders and take pizzas.
    Scanner stdin = new Scanner(System.in);

    // Initial printing of the menu
    // Feel free to change this
    // Also feel free to comment it out while you are developing as printing output can be slow
    System.out.printf("\n%28s\n\n", "*** Pizzeria 217 ***");
    System.out.printf("%25s\n", "*** Menu ***");
    System.out.printf("%20s : %5.2f\n", "Traditional Pizza", 8.99);
    System.out.printf("%20s : %5.2f\n", "Deep-Dish Pizza", 10.99);
    Topping.printToppings();
    System.out.println();

    // Create your restaurant instance
    // You can name the variable whatever you want.

    // Insert your code for reading in the orders here

    // Closing the scanner
    stdin.close();
  }
}