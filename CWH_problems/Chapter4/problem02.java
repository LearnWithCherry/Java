import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        float totalmarks = ((sub1 + sub2 + sub3) / 300.0f) * 100;

        float sub1marks = sub1;
        float sub2marks = sub2;
        float sub3marks = sub3;

        if (sub1marks >= 33) {
            System.out.println("Student passed in Subject 1");
        } else {
            System.out.println("Student failed in Subject 1");
        }

        if (sub2marks >= 33) {
            System.out.println("Student passed in Subject 2");
        } else {
            System.out.println("Student failed in Subject 2");
        }

        if (sub3marks >= 33) {
            System.out.println("Student passed in Subject 3");
        } else {
            System.out.println("Student failed in Subject 3");
        }

        if (totalmarks >= 40) {
            System.out.println("Student passed with " + totalmarks + "%");
        } else {
            System.out.println("Student failed with " + totalmarks + "%");
        }

        sc.close();
    }
}
