
import java.util.Scanner;

// Step 1: Define the StepCounter interface
interface StepCounter {
    void countSteps(int steps);
}

// Step 2: Define the CalorieCalculator interface
interface CalorieCalculator {
    double calculateCaloriesBurned(int totalSteps);
}

// Step 3: Implement both interfaces inside the FitnessTracker class
class FitnessTracker implements StepCounter, CalorieCalculator {
    // Instance variable to accumulate steps across loop cycles
    private int totalSteps = 0;

    @Override
    public void countSteps(int steps) {
        this.totalSteps += steps; // Add daily steps to the running total
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    @Override
    public double calculateCaloriesBurned(int totalSteps) {
        // Apply the exact formula required: (total steps / 100.0) * 20.0
        return (totalSteps / 100.0) * 20.0;
    }
}

// Step 4: The Main runner class to process console I/O
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the fitness tracker object
        FitnessTracker tracker = new FitnessTracker();

        // Read the number of days
        int n = scanner.nextInt();

        // Loop through and accumulate steps for each day
        for (int i = 0; i < n; i++) {
            int steps = scanner.nextInt();
            tracker.countSteps(steps);
        }

        // Retrieve values and print outputs
        int totalSteps = tracker.getTotalSteps();
        System.out.println("Total Steps: " + totalSteps);

        double caloriesBurned = tracker.calculateCaloriesBurned(totalSteps);
        // Format precisely to two decimal places using %.2f
        System.out.printf("Calories Burned: %.2f\n", caloriesBurned);

        scanner.close();
    }
}
