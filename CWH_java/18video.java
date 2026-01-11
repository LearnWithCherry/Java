// switch case..
import java.util.Scanner;
public class video_18{
    public static void main(String[] args){
        // Simple Switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Age: ");
        int age = sc.nextInt(); 
        switch(age){
            case 18:
                System.out.println("You can apply for license");
                break;                 
            case 10:
                System.out.println("You cannot apply for license");
                break;
            case 80:
                System.out.println("You cannot apply for license too old to drive");
                break;
            default:
                System.out.println("Error.");
                break;
        }

         // Advance Switch case - does not required break

        System.out.print("Enter your name: ");
        String roll = sc.nextLine(); 
        switch(roll){
            case "rajat" -> {
                System.out.println("Teacher");
                System.out.println("Mentor");
                System.out.println("Friend");
            }
            case "tisha" -> System.out.print("Student");
            case "rohan" -> System.out.print("Student");
            case "isha" -> System.out.print("Student");
            case "ruhi" -> System.out.print("Student");
            default -> System.out.print("Error");
        }
    }
}