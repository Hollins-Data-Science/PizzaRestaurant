# Restaurant Project

In this project you will be creating a point-of-sale system for a pizza restaurant. Your restaurant will keep track of multiple orders, each of which have multiple pizzas with different toppings.

There are three primary classes in our organizational structure, each of which has an ArrayList and some associated methods. 

The Restaurant class keeps track of an ArrayList of Order instances. The Order class keeps track of an ArrayList of Pizza instances. The Pizza class keeps track of an ArrayList of Topping instances. Restaurant and Order each have an associated Java file with a description of the code you need to implement.

The Pizza class is a bit different. Pizza is an abstract class, meaning it cannot be instantiated but it can serve as the parent class to a subclass. Here, Pizza has two subclasses, DeepDishPizza and TraditionalPizza. Abstract classes are handy when classes share common instance variables and you only want to write the code that works with those variables once. DeepDishPizza and TraditionalPizza share most of their functionality, but also they also each have a bit of specialized information unique to them. The Pizza class is given to you, but you need to write the two subclasses.

The Topping class is also given to you. The Topping class is a bit unusual too. You won't be creating instances of the Topping class either. Instead, the Topping class maintains a static ArrayList of all of the Topping instances for each topping the restuarant offers. You can retrieve a Topping instance from class by giving it a topping code character, e.g. 'p' for the Topping instance corresponding to pepperoni. In this way, all the pepperoni pizzas can share the same Topping instance and there aren't tons of pepperoni Topping instances floating around. You won't need to interact with the Topping class much, instead you will create instances of Pizza and call their addToppings method and pass it a code string like "pm" for pepperoni and mushrooms.

The Main class will need some methods for reading the orders of pizzas. Be sure to break this task up sensibly. Have a method for reading in a single Pizza, then a method for reading in an Order of pizzas, then a method for reading in all of the orders in a loop.

You are welcome to name your restaurant whatever you like and customize the toppings as you wish. You are allowed to work on this project with a partner, but if you then you need to add some extra features to your restaurant. Examples of features might be a new type of pizza or the ability to find the average price of a pizza.  

Be sure to review all of the code files and implement the described work.

See the InventorySystem repository system as an example of similar project, albeit on a smaller scale.