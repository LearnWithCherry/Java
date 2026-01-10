import java.util.Scanner;
public class problem3{
    public static void main(String[] args){
        String letter = "Dear name\nYou are Selected in company\nThank you";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter Company: ");
        String company = sc.nextLine();
        String newletter = letter.replace("name",name).replace("company",company);
        System.out.println(newletter);

    }
}