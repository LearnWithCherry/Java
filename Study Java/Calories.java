import java.util.Scanner;

class Person {
    String name;
    int duration;
    double burnRate;

    public Person(String name, int duration, double burnRate) {
        this.name = name;
        this.duration = duration;
        this.burnRate = burnRate;
    }
}

class FitnessEnthusiast extends Person {
    public FitnessEnthusiast(String name, int duration, double burnRate) {
        // Correctly calling the parent constructor
        super(name, duration, burnRate);
    }

    // Changed return type to double to match the calculation and the footer
    public double calculateCalories() {
        // Simple multiplication: int * double = double
        return duration * burnRate;
    }
}

// Fixed Footer - Provided for context
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int duration = sc.nextInt();
        double burnRate = sc.nextDouble();

        FitnessEnthusiast f = new FitnessEnthusiast(name, duration, burnRate);
        
        // The f.calculateCalories() now returns a double, which works with %.1f
        System.out.printf("Calories Burned: %.1f calories", f.calculateCalories());
        
        sc.close();
    }
}
