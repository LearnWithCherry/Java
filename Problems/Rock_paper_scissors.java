import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
        int user = sc.nextInt();

        int computer = rand.nextInt(3); 

        if (user == 0) System.out.println("You chose: Rock");
        else if (user == 1) System.out.println("You chose: Paper");
        else if (user == 2) System.out.println("You chose: Scissors");
        else {
            System.out.println("Invalid input");
            return;
        }

        if (computer == 0) System.out.println("Computer chose: Rock");
        else if (computer == 1) System.out.println("Computer chose: Paper");
        else System.out.println("Computer chose: Scissors");

        // Game logic
        if (user == computer) {
            System.out.println("It's a Draw!");
        } 
        else if (
            (user == 0 && computer == 2) 
                        ||
            (user == 1 && computer == 0)        
                        ||
            (user == 2 && computer == 1)
        ) {
            System.out.println("You Win!");
        } 
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}
