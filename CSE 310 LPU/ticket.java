import java.util.Scanner;

class Ticket {
    // Base method for regular passengers
    public double calculatePrice(int distance) {
        return distance * 0.05;
    }
}

class SeniorCitizenTicket extends Ticket {
    // Overriding method for senior citizens
    @Override
    public double calculatePrice(int distance) {
        // Calculate regular price first, then apply 10% discount
        double regularPrice = super.calculatePrice(distance);
        return regularPrice * 0.9;
    }
}

// Fixed Footer - Provided for context
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int age = scanner.nextInt();

        Ticket ticketUtility;
        if (age >= 60) {
            // Must have a default constructor to match this
            ticketUtility = new SeniorCitizenTicket();
        } else {
            // Must have a default constructor to match this
            ticketUtility = new Ticket();
        }

        // Method name must be calculatePrice and accept distance
        double ticketPrice = ticketUtility.calculatePrice(distance);

        if (age < 60) {
            System.out.printf("Regular Passenger Ticket Price: %.1f" ,ticketPrice);
        } else {
            System.out.printf("Senior Citizen Ticket Price: %.1f" ,ticketPrice);
        }
    }
}
