import java.util.Scanner;
public class problem1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // System.out.print("Check");

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();

        double sum = (a + b + c)/ 3;

        System.out.print("Sum of all Number are: " + sum);
    }
}