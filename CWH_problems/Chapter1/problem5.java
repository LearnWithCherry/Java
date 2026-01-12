import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

        sc.close();
    }
}