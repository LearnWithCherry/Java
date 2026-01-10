import java.util.Scanner;

public class problem3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int computer_number = 20;
        System.out.print("Enter a number: ");
        int user_number = sc.nextInt();
        System.out.print("User is greater: " + (computer_number < user_number));


    }
}