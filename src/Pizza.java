import java.util.ArrayList;

// A public abstract class that described a generic pizza.
// This class, as abstract, cannot be instantiated. 
// Instead use one of its subclasses to create a specific type of pizza.
public abstract class Pizza {
    // All of the toppings on this pizza.
    // As a protected instance variable it can be only be accessed by subclasses.
    protected ArrayList<Topping> toppings = new ArrayList<>();

    // Takes a String containing toppings code characters and adds the corresponding toppings to the toppings ArrayList. 
    // Uses the Topping getTopping method to get the toppings correpsonding to the code letters.
    void addToppings(String toppingsCodes) {
        for (char codeLetter : toppingsCodes.toCharArray()) {
            Topping topping = Topping.getTopping(codeLetter);
            if (topping != null) {
                toppings.add(topping);
            }
        }
    }

    // Returns the toppings code from the pizza's arraylist of toppings
    String getToppingsCode() {
        String code = "";
        for (Topping topping : toppings) {
            code += Character.toString(topping.code);
        }
        return code;
    }

    // Toppings price is the sum of the prices of the toppings on the pizza.
    double toppingsPrice() {
        double total = 0.0;
        for (Topping topping : toppings) {
            total += topping.price;
        }
        return total;
    }

    // Total price is the sum of the basePrice and the toppingsPrice.
    double totalPrice() {
        return basePrice() + toppingsPrice();
    }

    // An abstract method that returns a double that is the base price of the the pizza. 
    // This method will be implemented by the subclasses of Pizza: TraditionalPizza and DeepDishPizza.
    abstract double basePrice();
}