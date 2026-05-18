class Parent{

    void show(){

        System.out.println("Parent");
    }
}

class Child extends Parent{

    @Override
    void show(){

        System.out.println("Child");
    }
}
class Parent{

    void display(){

        System.out.println("Parent");
    }
}

class Child extends Parent{

    void show(){

        System.out.println("Child");
    }
}

public class Main{

    public static void main(String[] args){

        Child obj = new Child();

        obj.display();
        obj.show();
    }
}

class Test{

    void add(int a){

        System.out.println(a);
    }

    void add(int a, int b){

        System.out.println(a+b);
    }
}

class A{

    void show(){

        System.out.println("A");
    }
}

class B extends A{

    void show(){

        System.out.println("B");
    }
}

public class Main{

    public static void main(String[] args){

        A obj = new B();

        obj.show();
    }
}

class Parent{

    void show(){

        System.out.println("Parent");
    }
}

class Child extends Parent{

    void display(){

        super.show();

        System.out.println("Child");
    }
}
interface A{

    void show();
}

interface B{

    void display();
}

class Test implements A,B{

    public void show(){

    }

    public void display(){

    }
}

interface Animal{

    void sound();
}

class Dog implements Animal{

    public void sound(){

        System.out.println("Bark");
    }
}
abstract class Animal{

    abstract void sound();

    void eat(){

        System.out.println("Eating");
    }
}

class Dog extends Animal{

    void sound(){

        System.out.println("Bark");
    }
}
