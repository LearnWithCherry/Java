import java.util.Scanner;

// The parent class
class SuperClass {
    int value;

    // Constructor to set the initial value
    SuperClass(int value) {
        this.value = value;
    }
}

// SubClass inheriting from SuperClass
class SubClass extends SuperClass {
    int subValue;

    SubClass(int value) {
        // Use 'super' to call the parent class constructor
        super(value); 
        this.subValue = value * 2; // Arithmetic operator
    }

    public void displayVariables() {
        // Accessing the value from the SuperClass
        System.out.println("The value of SuperClass: " + super.value);
        System.out.println("The value of SubClass: " + this.subValue);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int value = sc.nextInt();
            // Create an instance of the SubClass identifier
            SubClass obj = new SubClass(value);
            obj.displayVariables();
        }
        sc.close();
    }
}
