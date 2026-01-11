import java.util.Scanner;
public class video_16{
    public static void main(String[] args){
        int a = 10;
        if (a == 10){
            System.out.println("A is 10");
        }else{
            System.out.println("A is not 10");
        }    

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.print("You cannot Drive Your age is: " + age);
        }else if(age  >= 90){
            System.out.print("You are too Old to Drive..");
        }else if (age >= 18){
            System.out.print("You Can Drive..!");
        }else{
            System.out.print("Error..");
        }
    }
}