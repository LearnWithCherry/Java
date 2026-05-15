// You are using Java
abstract class Employee {
    String name;
    double salary;

    // The Parent needs to store the data
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // This method is defined here so the Main class can see it
    abstract double calculateBonus();
}

class Manager extends Employee {
    // Rule: Constructor must match the 'new' call in Footer
    Manager(String name, double salary) {
        super(name, salary); // Pass data to Parent
    }

    // Rule: Method must return double and match the footer's name
    @Override
    double calculateBonus() {
        return salary * 0.20; // Logic: Managers get 20% bonus
    }
}
