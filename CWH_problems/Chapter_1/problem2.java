import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks: ");
        int m3 = sc.nextInt();

        double CGPA = (m1 + m2 + m3) / 3;

        System.out.print("Total CGPA is: " + CGPA);
    }

}