import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Since main prints the result, return a String representing the ID
    public String generateScriptID() {
        return name + age;
    }
}

class EnigmaScribe extends Person {
    // This field exists but isn't passed via the constructor in your fixed main
    String personType = "EnigmaScribe"; 

    // MUST take only 2 arguments to match your fixed Main class
    public EnigmaScribe(String name, int age) {
        super(name, age);
    }

    @Override
    public String generateScriptID() {
        // You can customize the ID format for the subclass if needed
        return name + age; 
    }
}
