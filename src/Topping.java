import java.util.ArrayList;

// A class for holding the information about a particular topping.
// The constructor is private, so you cannot instantiate toppings, instead use the getTopping method
// to retrieve the Topping instance corresponding to a particular topping.
public class Topping {

    // An array of all the toppings.
    // Note that is a static variable.
    // Feel free to add toppings.
    final static public Topping[] all = {
            new Topping("pepperoni", 'p', 1.29),
            new Topping("extra cheese", 'e', 1.29),
            new Topping("green pepper", 'g', 0.99),
            new Topping("mushroom", 'm', 0.99)
    };

    // The variables in Topping are all final meaning they can't be changed.
    final public String name;
    final public char code;
    final public double price;

    // Constructor is private, meaning outside users can't create Topping instances
    // Instead they should call getTopping to retrieve the Topping instance they
    // need
    // This allows all pizzas to share the same set of Topping instances as needed
    private Topping(String name, char code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    // String conversion override
    public String toString() {
        return String.format("%s : %c : %5.2f", name, code, price);
    }

    // Print all the toppings in a nice fashion
    static void printToppings() {
        System.out.printf("%27s\n", "--- Toppings ---");
        for (Topping topping : all) {
            System.out.printf("%28s\n", topping);
        }
    }

    // Get a single topping from a code character
    static Topping getTopping(char code) {
        for (Topping topping : all) {
            if (topping.code == code) {
                return topping;
            }
        }
        return null;
    }
}