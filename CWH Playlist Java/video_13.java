// String a sequence of characters
/*  %d for int
    %f for float
    %c for char
    %s for string
*/
import java.util.Scanner;
public class video_13{
    public static void main(String[] args){
        // String name = new String("Rajat");
        String name = "Rajat Bhardwaj";
        // System.out.print("The name is: ");
        // System.out.print(name);

        // int a = 10;
        // float b = 1.23f;
        // System.out.printf("The value of a is %d and b is %f ",a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.printf("My name is: %s.",st);
    }
}