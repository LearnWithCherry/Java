import java.util.Scanner;

class EnvironmentalMetrics {
    // Protected fields can be accessed by the child class
    protected double electricityUsage;
    protected double transportationEmissions;

    EnvironmentalMetrics(double electricityUsage, double transportationEmissions) {
        this.electricityUsage = electricityUsage;
        this.transportationEmissions = transportationEmissions;
    }
}

// Final class cannot be inherited further
final class CarbonFootprintCalculator extends EnvironmentalMetrics {
    // Final fields are constants and cannot be changed after initialization
    private final double electricityEmissionFactor = 0.4;
    private final double transportationEmissionFactor = 2.5;

    // Constructor matches the call in the Main class (2 parameters)
    CarbonFootprintCalculator(double electricity, double transportation) {
        super(electricity, transportation);
    }

    public void estimateCarbonEmissions() {
        // Calculation logic
        double electricityCarbon = electricityUsage * electricityEmissionFactor;
        double transportationCarbon = transportationEmissions * transportationEmissionFactor;
        double totalCarbonFootprint = electricityCarbon + transportationCarbon;

        // Output formatting to 2 decimal places
        System.out.printf("Electricity: %.2f kgCO2\n", electricityCarbon);
        System.out.printf("Transportation: %.2f kgCO2\n", transportationCarbon);
        System.out.printf("Total: %.2f kgCO2\n", totalCarbonFootprint);
    }
}

// Fixed Footer - Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()) {
            double electricity = sc.nextDouble();
            double transportation = sc.nextDouble();

            // Creating the object with two arguments
            CarbonFootprintCalculator calculator = 
                new CarbonFootprintCalculator(electricity, transportation);
                
            calculator.estimateCarbonEmissions();
        }
        sc.close();
    }
}
