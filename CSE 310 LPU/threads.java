import java.util.Scanner;

class NumberProcessor {
    private final int limit;
    private int current = 1;

    public NumberProcessor(int limit) {
        this.limit = limit;
    }

    // Synchronized method for the Square Thread (Handles ODD numbers)
    public synchronized void printSquare() {
        while (current <= limit) {
            // If the number is even, this thread must wait for the cube thread to finish it
            if (current % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                // Confirming boundary check before execution inside loop
                if (current <= limit) {
                    System.out.println("Square: " + (current * current));
                    current++;
                    notifyAll(); // Wake up the Cube thread
                }
            }
        }
    }

    // Synchronized method for the Cube Thread (Handles EVEN numbers)
    public synchronized void printCube() {
        while (current <= limit) {
            // If the number is odd, this thread must wait for the square thread to finish it
            if (current % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                // Confirming boundary check before execution inside loop
                if (current <= limit) {
                    System.out.println("Cube: " + (current * current * current));
                    current++;
                    notifyAll(); // Wake up the Square thread
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // One shared processing instance coordinates both threads
        NumberProcessor processor = new NumberProcessor(n);

        // Define threads to target their specific tasks
        Thread squareThread = new Thread(processor::printSquare);
        Thread cubeThread = new Thread(processor::printCube);

        // Fire both threads concurrently
        squareThread.start();
        cubeThread.start();
    }
}
