import java.util.Scanner;

public class video_6 {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator..\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String studentName = sc.nextLine();

        System.out.println("Student name: " + studentName);
        System.out.println("Enter " + studentName + "'s marks for 5 subjects (out of 100 each):\n");

        System.out.print("Subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int marks3 = sc.nextInt();

        System.out.print("Subject 4: ");
        int marks4 = sc.nextInt();

        System.out.print("Subject 5: ");
        int marks5 = sc.nextInt();

        // Calculate total and percentage correctly
        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (totalMarks / 500.0) * 100;  // Use 500.0 to make it double division

        System.out.println("\n--- Result ---");
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.println("Percentage: " + percentage + " %");

        sc.close();
    }
}