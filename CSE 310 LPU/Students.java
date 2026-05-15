import java.util.Scanner;

class Student {
    // 1. The footer uses new Student(), so we don't need a custom constructor.
    // Java will provide a default empty one.

    // 2. The method must accept two parameters as seen in the footer
    public double calculatePercentage(int totalMarks, int obtainedMarks) {
        // Use (double) to prevent integer division (0.0 issue)
        return ((double) obtainedMarks / totalMarks) * 100;
    }
}

class ScholarshipStudent extends Student {
    // 1. No custom constructor needed (matches new ScholarshipStudent() in footer)

    @Override
    public double calculatePercentage(int totalMarks, int obtainedMarks) {
        // 3. Call the parent method correctly and add the 5% bonus
        return super.calculatePercentage(totalMarks, obtainedMarks) + 5;
    }
}

// Fixed Footer - Do not change
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Footer uses default constructors
        Student student = new Student();
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent();

        int totalMarks = scanner.nextInt();
        int obtainedMarks = scanner.nextInt();

        // Footer passes the values directly into the method
        double studentPercentage = student.calculatePercentage(totalMarks, obtainedMarks);
        double scholarshipStudentPercentage = scholarshipStudent.calculatePercentage(totalMarks, obtainedMarks);

        System.out.printf("Student Percentage: %.2f%%\n", studentPercentage);
        System.out.printf("Scholarship Student Percentage: %.2f%%\n", scholarshipStudentPercentage);

        scanner.close();
    }
}
