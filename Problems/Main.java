import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
/*
class outer{
    static String staticMsg = "Static Hello";
    String instanceMsg = "instance Hello";

    static class StaticNested{
        void show(){
            System.out.println(staticMsg);
        }
    }

    class Inner {
        void show(){
            System.out.println(instanceMsg);
        }
    }
}

 public class unit{
     public static void main(String [] args){
         outer.StaticNested oobj = new outer.StaticNested();
         oobj.show();    

         outer myouter = new outer();
         outer.Inner iobj = myouter.new Inner();
         iobj.show();
     }
 }


class a{
    public void showA(){
        System.out.println("Outer class A.");
    }class b{
        public void showB(){
            System.out.println("Inner class B.");
        }class c{
            public void showC(){
                System.out.println("Inner class C.");
            }
        }
    }
}

 public class unit{
     public static void main(String[] args){
         a A = new a();
         A.showA();

         a.b B = A.new b();
         B.showB();  

         a.b.c C = B.new c();
         C.showC();
     }    
 }


 public class unit{
     public static void main (String[]args){
         try{
             try{
                 String x = null;
                 System.out.println(x.length());
             }catch(NullPointerException e){
                 System.out.println("Null Pointer Error.");
                 System.out.println(e.getMessage());
             }
             int a = 10/0;
         }catch(ArithmeticException e){
             System.out.println(e.getMessage());
             System.out.println("Arithmetic Execption handled.");
         }catch(Exception e){
             System.out.println("Exception Handled.");
             System.out.println(e.getMessage());
         }finally{
             System.out.println("Hello From Finally.");
         }
     }
 }
 public class unit{
     public static void main (String [] args){
         try{
              String s = null;
             throw new ArithmeticException("!!");
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
     }
 }

 public class unit{
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
         try( Scanner sc = new Scanner(System.in);){
             int a = 10/0;
         }catch(Exception e){
             System.out.println(e.getMessage());
         }finally{
             System.out.println("Finally Automatically called..");
         }
          sc.close();
     }
 }
 class cusRes implements AutoCloseable{
     cusRes(){
         System.out.println("Custom resource created");
     }public void close(){
         System.out.println("finally block ");
     }
 }

 pratice 
class outer1{
    class inner1{
        void show(){
            System.out.println("Inner class");
        }
    }
}

 class unit{
     public static void main(String[] args) {
         outer1 o = new outer1();
         outer1.inner1 i = o.new inner1();
         i.show();
     }
 }

class outer2{
    static class inner2{
        void display(){
            System.out.println("Inner");
        }
    }
}


 class unit{
     public static void main(String[] args) {
          outer2 o = new outer2();
         outer2.inner2 i = new outer2.inner2();
         i.display();   
     }
 }

class outer3{
    int x = 10;
    class inner3{
        void show(){
            System.out.println("value of X: "+x);
        }
    }
}

 public class unit{
     public static void main(String[] args) {
         outer3 o = new outer3();
         outer3.inner3 i = o.new inner3();
         i.show();
     }    
 }

class outer4{
    void display(){
        class local{
            void msg(){
                System.out.println("Local class");
            }
        }
        local l = new local();
        l.msg();
    }
}



class uni{
    String name = "LOVELY PROFESSIONAL UNIVERSITY";
    class std{
        void details_(){
            System.out.println("University name: "+name);
        }
    }

}
 public class unit{
     public static void main(String[] args) {
     uni u = new uni();
     uni.std s = u.new std();
     s.details_();
     }
 }

class Library {

    static class Book {
        void displayBook() {
            System.out.println("Book available");
        }
    }

    class Member {
        void displayMember() {
            System.out.println("Member registered");
        }
    }
}

class Person {
}

class Student extends Person {
    void show() {
        System.out.println("Student method called");
    }
}

 public class unit {
     public static void main(String[] args) {

          Static nested class
         Library.Book b = new Library.Book();
         b.displayBook();

          Inner class
         Library lib = new Library();
         Library.Member m = lib.new Member();
         m.displayMember();

          Upcasting
         Person p = new Student();

          Downcasting
         Student s = (Student) p;
         s.show();c
     }
 }


class Customer {
     write method here
    int calculatePrice(int price){
        return price - (price * 10 / 100);
    }
}
class PremiumCustomer extends Customer {
     override method here
    @Override
    int calculatePrice(int price){
         return (price*0.20)/100;    
        return price - (price * 20 / 100);
    } 
}
public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        String isPremium = scanner.next().toLowerCase();

        Customer customer;

        if (isPremium.equals("yes")) {
            customer = new PremiumCustomer();
        } else {
            customer = new Customer();
        }

        int finalPrice = customer.calculatePrice(price);
        System.out.println(finalPrice);
    }
}



class Employee {
     write method here
    int calculateSalary(int baseSalary){
        return baseSalary + (baseSalary * 10 / 100);
    }
}

class Manager extends Employee {
     override method here
    @Override
    int calculateSalary(int baseSalary){
        return baseSalary + (baseSalary * 20 / 100);
    }
}

public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseSalary = scanner.nextInt();
        String role = scanner.next().toLowerCase();

        Employee emp;

        if (role.equals("manager")) {
            emp = new Manager();
        } else {
            emp = new Employee();
        }

        int salary = emp.calculateSalary(baseSalary);
        System.out.println(salary);
    }
}

class Account {
     write method
    int calculateInterest(int principal, int time){
        int interest;
        return interest = (((principal * 5) * time) / 100);
    } 
}

class PremiumAccount extends Account {
     override method
    @Override
    int calculateInterest(int principal, int time){
        int interest;
        return interest = (((principal * 8) * time) / 100);
    } 
}
public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = scanner.nextInt();
        int time = scanner.nextInt();
        String type = scanner.next().toLowerCase();

        Account acc;

        if (type.equals("premium")) {
            acc = new PremiumAccount();
        } else {
            acc = new Account();
        }

        int interest = acc.calculateInterest(principal, time);
        System.out.println(interest);
    }
}
class BillCalculator {
    public static int calculateBill(int units) throws Exception {
         write logic

        if(units < 0 ){
            throw new Exception("Invalid units");
        }
        if(units <= 100){
            return units * 5;
        }else{
            int rm = units - 100;
            return (100 * 5) + (rm * 8);
        }
    }
}
public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int units = scanner.nextInt();
            int bill = BillCalculator.calculateBill(units);
            System.out.println(bill);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class ParkingSystem {
    public static int calculateFee(int hours, String type) throws Exception {
        if(hours < 0){
            throw new Exception ("Invalid hours");
        }
        if(type.equals("bike")){
            return hours *  10;
        }else if(type.equals("car")){
            return (hours * 20);
        }else{
            return((hours * 30)+50);
        }
    }
}
public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int hours = scanner.nextInt();
            String type = scanner.next().toLowerCase();
            int fee = ParkingSystem.calculateFee(hours, type);
            System.out.println(fee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class newException extends Exception{
    public newException(String message){
        super(message);
    }
}
public class unit{
    public static void main(String[] args) {
        try{
            int n = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide with Zero");
        }catch(Exception e){
            System.out.println("Error...");
        }finally{
            System.out.println("Program Ended....");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

public class unit{
    static void checkAccount(int age, int balance) throws InvalidAgeException,InsufficientFundsException{
        if(age < 18){
            throw new InvalidAgeException ("Age must be Greater the 18 years..");    
        }
        if(balance < 500){
            throw new InsufficientFundsException ("Minimum deposit of 500 required.");
        }
        System.out.println("Account Created Successfully!...");
    }
    public static void main(String[] args) {
        try{
            checkAccount(19,1000);
        }catch(InvalidAgeException e){
            System.out.println("Age Error: "+e.getMessage());
        }catch(InsufficientFundsException e){
            System.out.println("Balance Error: "+e.getMessage());
        }finally{
            System.out.println("Program Exceuted Successfully!..");
        }
    }
}

class negativeException extends Exception{
    public negativeException(String message){
        super(message);
    }
}

public class unit{
    static void checkValue(int number) throws negativeException{

        if(number < 0){
            throw new negativeException("Value Cannot be Negative.");
        }
        System.out.println("Square of " +number + " is: "+number*number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try{ 
            checkValue(number);
        }catch(negativeException e){
            System.out.println("Negative Value Error: "+e.getMessage());    
        }
    }
}
try {
    int num = scanner.nextInt();
    NumberCheck.check(num);
} catch (OddException e) {
    System.out.println(e.getMessage());
}
class NegativeException extends Exception{
    public NegativeException(String message){
        super(message);
    }
}
class OddException extends Exception{
    public OddException(String message){
        super(message);
    }
}
class NumberCheck{
    static void check(int number) throws OddException,NegativeException{
        if(number < 0){
            throw new NegativeException("Value Cannot be Less-Then-Zero.");
        }
        if(number % 2 != 0){
            throw new OddException("Value is Odd Enter Even value.");
        }
        System.out.println("Value is Even..");
    }
}
public class unit{
    public static void main(String[] args) {
         System.out.println("--- STARTING NEW RUN ---");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try{
            NumberCheck.check(number);
        }catch(NegativeException e){
            System.out.println("Error: "+e.getMessage());
        }catch(OddException e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            System.out.println("Program Executed Successfully.");
        }
    }
}

class A{}
class B extends A{}
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Shape {
    int calculateArea(int a, int b) {
        return a * b;  rectangle
    }
}

class Square extends Shape {
    @Override
    int calculateArea(int a, int b) {
        return a * a;  square
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String type = scanner.next().toLowerCase();

        Shape s;

        if(type.equals("square")){s = new Square();}
        else{s = new Shape();}
        
        System.out.println(s.calculateArea(x, y));
        scanner.close();
    }
}
class Payment {

    public int calculate(int amount) throws Exception {
         default (UPI)
        if(amount < 0){
            throw new Exception("Invalid amount");
        }
        return amount;
    }
}
class CreditPayment extends Payment {

    @Override
    public int calculate(int amount) throws Exception {
        int base = super.calculate(amount);  reuse validation
        return base + (base * 2 / 100);
    }
}

class DebitPayment extends Payment {

    @Override
    public int calculate(int amount) throws Exception {
        int base = super.calculate(amount);  reuse validation
        return base + (base * 1 / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int amount = scanner.nextInt();
            String type = scanner.next().toLowerCase();

            Payment p;

            if (type.equals("credit")) {
                p = new CreditPayment();
            } else if (type.equals("debit")) {
                p = new DebitPayment();
            } else {
                p = new Payment();
            }

            int result = p.calculate(amount);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

interface animal(){
    void sound();  //abstract method
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Bark..!!!");
    }
}

interface A{
    void show();
}

interface B{
    void display();
}

class Main implements A,B{
    public void show(){};
    public void display(){};
}

interface A{
    default void show(){
        System.out.println("this is a Default method");
    }
}
interface A{
    static void test(){
        System.out.println("This is a Static Method...");
    }
}

interface Vehicle{
    int getSpeed();    
}
class car implements Vehicle{
    public int getSpeed(){
        return 60;
    }
}
class bike implements Vehicle{
    public int getSpeed(){
        return 40;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next().toLowerCase();

        Vehicle v;
        if(type.equals("car")){
            v = new car();
        }else if (type.equals("bike")){
            v = new bike();
        }
        System.out.println(v.getSpeed());
    }
}

class NegativeValueError extends Exception{
    public NegativeValueError(String message){
        super(message);
    }
}
interface Payment {
    int pay(int amount)throws NegativeValueError;
    
}

class Cash implements Payment {
    public int pay(int amount)throws NegativeValueError{
        if(amount < 0){
            throw new NegativeValueError("Value Cannot be Zero.");
        }
        return amount;
    }
}

class Card implements Payment {
    public int pay(int amount){
        return amount = amount+(amount*2/100);
    }
}

class Wallet implements Payment {
    public int pay(int amount){
        return amount = amount+(amount*1/100);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        String type = sc.next().toLowerCase();

        Payment p;

        if(type.equals("cash")){
            p = new Cash();    
        }else if(type.equals("card")){
            p = new Card();
        }else{
            p = new Wallet();
        }
        try{    
            int result = p.pay(amount);
            System.out.println(result);
        }catch(NegativeValueError e){
            System.out.println("Error: "+e.getMessage());    
        }finally{
            System.out.println("Program Exceuted Successfully.");
        }
    }
}


public class Main {
    public static void main(String[] args) {

        // 1. Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // 2. Custom Date
        LocalDate customDate = LocalDate.of(2025, 5, 20);
        System.out.println("Custom Date: " + customDate);

        // 3. Add / Subtract
        System.out.println("After 5 days: " + today.plusDays(5));
        System.out.println("Before 2 months: " + today.minusMonths(2));

        // 4. Get values
        System.out.println("Day: " + today.getDayOfMonth());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Year: " + today.getYear());

        // 5. Period (Date difference)
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        LocalDate d2 = LocalDate.of(2025, 1, 1);

        Period p = Period.between(d1, d2);
        System.out.println("Years difference: " + p.getYears());

        // 6. Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // 7. Custom Time
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(15, 30);

        // 8. Duration (Time difference)
        Duration d = Duration.between(t1, t2);
        System.out.println("Hours difference: " + d.toHours());

        // 9. Date + Time
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("DateTime: " + dt);
    }
}

class Main{
    static void check(int Number) throws Exception{
        if(Number < 0){
            throw new Exception("Value Cannot be Zero..");     
        }else{
            System.out.println("Valid Value!..");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int number = sc.nextInt();
            check(number);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());    
        }
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}

class Payment{
    public int process(int amount) throws InvalidAmountException{
        if(amount < 0){
            throw new InvalidAmountException("Value Cannot be Zero.");
        }return amount;
    }
}
class CreditCard extends Payment{
    @Override
    public int process(int amount) throws InvalidAmountException{
        int base = super.process(amount);
        return base + (base * 2 / 100);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        Payment p = new CreditCard();
        try{
            int result = p.process(amount);
            System.out.println(result);
        }catch(InvalidAmountException ia){
            System.out.println("Error: "+ia.getMessage());
        }finally{
            System.out.println("Program Compiled Successfully..!!");
        }
    }
}
import java.util.Scanner;
class animal{
    void eat (){
        System.out.print("This animal eating food.\n");
    }
}
class Dog extends animal{
    void bark(){
        System.out.print("The dog barks.\n");
    }
}
class Cat extends animal{
    void meow(){
        System.out.print("The cat is sleeping,\n");
    }
}
class pet extends Dog{
    void weep(){
        System.out.print("The puppy is weeping.\n");
    }
}
 public class unit3{
     public static void main(String [] args){
         pet x = new pet();
         x.eat();
         x.bark();
         x.weep();
     }
 }


 Create a class name Device with a field brand and a method powerOn() that prints "Device is now ON".
 Create a subclass named Smartphone that extends Device.
 Add a field model to Smartphone and a method displayDetails() that prints both the brand and the model.

class Device {
    public String brand = "Iphone";
    void powerOn(){
        System.out.print("Device is now ON.\n");
    }
}
class Smartphone extends Device{
    public String model = "15 Pro Max";
    void displayDetails(){
        System.out.print("Brand: "+brand);
        System.out.print("\nModel: "+model);
    }
}
 public class unit3{
     public static void main(String [] args){
         Smartphone x = new Smartphone();
         x.powerOn();
         x.displayDetails();
     }
 }


class vehical {
    String type = "Generic Vehical.\n";
    void move(){
        System.out.print("The Vehical is Moving.\n");
    }
}
class Car extends vehical{
    @Override
    void move(){
        super.move();
        System.out.print("The Car Drives on Four wheels.\n");
    }
    @Override
    public String toString(){
        return "This is a Car Object.\n";
    }
}
 public class unit3{
     public static void main(String  [] args){
         Car x = new Car();
         x.move();
         System.out.print(x.toString());

     }
 }

 Task: 
 1.  Create a class Employee with a method getSalary() that returns 0.
 2.  Create a subclass Manager.
 3.  In Manager, override getSalary() to return 50000.
 4.  In Manager, override the toString() method to return the string: "I am a Manager".
 5.  In your main method, create a Manager object, call getSalary(), and print the object itself (which triggers toString()).


class Employee{
    int getSalary(){
        return 0;
    }
}
class Manager extends Employee{
    @Override
    int getSalary(){
        super.getSalary();
        return 5000;    
    }
    @Override
    public String toString(){   
        return"I am a Manager.";
    }
}
 public class unit3{
     public static void main(String [] args){
         Manager m = new Manager();

         System.out.println(m.getSalary());
         System.out.println(m.toString());
     }
 }

 final keyword.. 

final class secretservice{
    final void displaycode(){
        System.out.println("TOP Secret..");
    }
}
class tool{}
class hammer extends tool {}

 public class unit3{
     public static void main (String [] args){
         secretservice ss = new secretservice();
         void displaycode(){
             System.out.println("chec");
         }
         ss.displaycode();
         hammer hm = new hammer();
         System.out.println(hm instanceof hammer);
         System.out.println(hm instanceof tool);
     }
 }

 task - The "Security System"

class library{
    final void openingHours(){
        System.out.println("9AM to 5AM");
    }
} 
class ScienceLibrary extends library{
    void checkType(library lib){
        if(lib instanceof ScienceLibrary){
            System.out.println( "Science Library");
        }else{
            System.out.println( "General Library");
        }
    }
}

 public class unit3{
     public static void main (String [] args){
         library l = new library();
         ScienceLibrary s = new ScienceLibrary();

         l.openingHours();
         s.openingHours();

         s.checkType(l);
         s.checkType(s);
     }
 }


abstract class shape{
    String color;

    abstract double area();
    void display(){
        System.out.println("This is a shape.");
    }
}
class Circle extends shape{
    double radius;

    Circle(double r){
        this.radius = r;
    }
    @Override
    double area(){
        return 3.14 * radius * radius;
    }
}
 public class unit3{
     public static void main(String [] args){
         Circle c = new Circle(5);
         System.out.println("Area: " + c.area());
         c.display();
     }
 }


abstract class basepayemt{
    abstract void processpayment(double amount);

    void printrecept(double amount){
        System.out.print("Recept Generated for: $"+amount);
    }
}
class creditcardpayment extends basepayemt{
    @Override
    void processpayment(double amount){
        System.out.println("Processng credit card payment for: $"+amount);
    }
}
 public class unit3{
     public static void main(String [] args){
         creditcardpayment cc = new creditcardpayment();

         cc.processpayment(250.75);

         cc.printrecept(250.75);
     }
 }

abstract class Bird{
    abstract void fly();
    void eat(){
        System.out.println("This Bird is Eating..");
    }
}
class eagle extends Bird{
    @Override
    void fly(){
        System.out.print("The Eagle files at high altitudes..");
    }
}
 public class unit3{
     public static void main(String [] args){
         eagle e = new eagle();
         e.eat();
         e.fly();
     }
 }


interface camera{
    void takephoto();

    default void opengallery(){
        System.out.println("Opening Gallery...");
    }
    static void checkHardware(){
        System.out.println("Checking camera hardware intergrity..");
    }
}

class SmartPhone implements camera{
    public void takephoto(){
        System.out.println("Taking Photo..");
    }   
}

 public class unit3{
     public static void main(String [] args){
         SmartPhone ss = new SmartPhone();
         ss.takephoto();
         ss.opengallery();
         camera.checkHardware();
     }
 }

interface printer {
    void printDocument();
    default void Scan(){
        System.out.println("Scanning...");
    }
    static void powerInfo(){
        System.out.println("Printer required 220V..");
    }
}

class hp_printer implements printer{
    public void printDocument(){
        System.out.println("Printing Document...");
        }
}

 public class unit3{
     public static void main(String [] args){
         hp_printer  hp = new hp_printer();
         hp.Scan();
         hp.printDocument();
         printer.powerInfo();
     }
 }

interface GPS{
    default void getCoordinates(){
        System.out.println("Fetching Location...");

    }
}

abstract class Vehicle{
    abstract void Move();
}

final class Tesla extends Vehicle implements GPS{
    void Move(){
        System.out.println("Driving Silently on Electrictiy..");
    }
}
 public class unit3{
     public static void main(String [] args){
         Tesla t = new Tesla();
         t.getCoordinates();
         t.Move();
         System.out.println(t instanceof Tesla);
         System.out.println(t instanceof Vehicle);
     }
 }


 import java.util.function.Predicate;

 @FunctionalInterface
 interface Calculator {
     int operate(int a, int b);
 }

 public class LambdaDemo {
     public static void main(String[] args) {
        
          Anonymous class implementation
         Calculator addAnon = new Calculator() {
             @Override
             public int operate(int a, int b) {
                 return a + b;
             }
         };
         System.out.println("Anonymous class sum: " + addAnon.operate(5, 3));

          Lambda implementation (concise)
         Calculator addLambda = (a, b) -> a + b;
         System.out.println("Lambda sum: " + addLambda.operate(5, 3));

          Multi-parameter lambda with return statement
         Calculator diff = (a, b) -> {
             System.out.println("Subtracting...");
             return a - b;
         };
         System.out.println("Lambda with return: " + diff.operate(10, 4));

          Predicate example
         Predicate<Integer> isEven = n -> n % 2 == 0;
         System.out.println("Is 10 even? " + isEven.test(10));
         System.out.println("Is 7 even? " + isEven.test(7));

          Effectively final variable usage
         int base = 10;  effectively final
         Calculator addBase = (x, y) -> x + y + base;
         System.out.println("Sum with base: " + addBase.operate(2, 3));

          Comparison: Anonymous vs Lambda
         System.out.println("\n--- Comparison ---");
         System.out.println("Anonymous class: verbose, creates new class");
         System.out.println("Lambda: concise, optimized, cleaner syntax");
     }
 }
class calc{
    public int add(int a,int b){
        return a+b;    
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class advcalc extends calc{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class sciCalc extends advcalc{
    public double power(int a,int b){
        return Math.pow(a,b);   
    }
}
 public class unit3{
     public static void main (String [] args){
         sciCalc obj = new sciCalc();
         System.out.println("Answer: "+obj.add(3,2));    
         System.out.println("Subtraction: "+obj.sub(20,10));    
         System.out.println("Multiplication: "+obj.mul(3,5));    
         System.out.println("Divison: "+obj.div(100,5));    
         System.out.println("Power: "+obj.power(2,10));    
     }
 }


 Practice unit 3 
class employee{
    String name = "Rajat";
    void work(){
        System.out.println("working");
    }
}

class dev extends employee{
    String tech = "java";
    void display(){
        System.out.println("name: "+name);
        System.out.println("tech: "+tech);
    }    
}

 public class unit3{
     public static void main(String[] args) {
         dev d = new dev();
         d.display();

     }
 }

class Book {
    String title;
    public Book(String title) {
        this.title = title;
    }
}
class Ebook extends Book{
    int size;
    public Ebook(String title,int size){
        super(title);
        this.size = size;
    }
    void setter(int size,String title){
        this.size = size;
        this.title = title;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Size:"+size+" MB");
    }
}

 public class unit3{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String title = sc.nextLine();
         int size = sc.nextInt();
        Ebook eb = new Ebook("Not Defined",0);
        eb.setter(size,title);
        eb.display();
     }
 }

class book{
    void printInfo(){
        System.out.println("This is a Printed Book");    
    }
}
class E_book extends book{
    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("This is the Electronic Print of the Book");
    }
}
 public class unit3{
     public static void main(String[] args) {
         E_book e = new E_book();
         e.printInfo();
     }
 }



class Account {
    void showType() {
        System.out.print("Account Type: ");
    }
}
class SavingsAccount extends Account{
    @Override
    void showType(){
        super.showType();
        System.out.println("This is a Savings Account");
    } 
}

 class unit3{
     public static void main(String[] args) {
         SavingsAccount sa = new SavingsAccount();
         sa.showType();
     }
 }

 class Student{
     String name;
     int id;
     Student (String name, int id){
         this.name = name;
         this.id = id;
     }
     @Override
     public String toString(){
         return "Student[Name= "+name+" , Id= "+id+" ]";
     }
     @override
     public boolean equals(Object obj){
         if(this == obj) return true;
         if(obj == null || getClass() != obj.getClass()) return false;
         Student s = (Student) obj;
         return this.id = id;      
     }
 }

 class unit3{
     public static void main(String[] args) {
         Student s = new Student();
         s.boolean();
         s.String("Rajat",19);   
     }
 }

 final class s{  cannot be extends
     final void display(){  cannot be override
         System.out.println("Code: 1234");
     }
 }

abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("ZzZZzzZZzz....");
    }
}
class dog extends Animal{
    void makeSound(){
        System.out.println("Baw Baw Baw..");
    }
}

 class unit3{
     public static void main(String[] args) {
         dog d = new dog();
         d.makeSound();
         d.sleep();
     }
 }

abstract class payment{
    abstract void processPayment(double amount);
}
class CashPayment extends payment{
    void processPayment(double amount){
        System.out.println("Processing cash payment of $ "+amount);
    }
}
 class unit3{
     public static void main(String[] args) {
         CashPayment cp = new CashPayment();
         cp.processPayment(50.0);
     }
 }
*/


