class Animal {
    String type = "Generic Animal";
    
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        super.eat(); // Calls the parent method
        System.out.println("Dog eats bones.");
    }
}



--------------------------------------------------------
class A {
    int x = 10;
}
class B extends A {
    int x = 20;
    void display() {
        System.out.println(super.x);
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

----------------------------------------------------------
class Parent {
    void show() { System.out.print("Parent "); }
}
class Child extends Parent {
    void show() { System.out.print("Child "); }
}
public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
