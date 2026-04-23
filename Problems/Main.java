
public class Main{
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.start();
        B ob2 = new B();
        ob2.start();
        for(int i=0; i<25; i++){
            System.out.println("Task Done");
        }
    }
} 
class A extends Thread{
    public void run(){
        for(int i=0; i<25; i++){
            System.out.println("A"+i);
        }
    }
} 
class B extends Thread{
    public void run(){
        for(int i=0; i<25; i++){
            System.out.println("B"+i);
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2000; ++i) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2000; ++i) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.count());
    }
}

class Counter {
    int count;

    synchronized void increment() {
        count++;
    }

    synchronized int count() {
        return count;
    }
}
