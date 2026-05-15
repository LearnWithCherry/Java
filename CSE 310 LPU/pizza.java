import java.util.Scanner;
import java.text.DecimalFormat;

class Pizza {
    protected double basePrice;
    protected double toppingCost;

    // Constructor matching the Footer (2 arguments)
    Pizza(double basePrice, double toppingCost) {
        this.basePrice = basePrice;
        this.toppingCost = toppingCost;
    }

    // Method accepting numberOfToppings as an argument
    public double calculatePrice(int numberOfToppings) {
        return basePrice + (toppingCost * numberOfToppings);
    }
}

class DiscountedPizza extends Pizza {
    // Constructor calling the parent constructor
    DiscountedPizza(double basePrice, double toppingCost) {
        super(basePrice, toppingCost);
    }

    @Override
    public double calculatePrice(int numberOfToppings) {
        // Step 1: Calculate the regular price first
        double regularPrice = super.calculatePrice(numberOfToppings);
        
        // Step 2: Apply 10% discount if toppings > 3
        if (numberOfToppings > 3) {
            return regularPrice * 0.90; // 90% of the price
        } else {
            return regularPrice;
        }
    }
}
