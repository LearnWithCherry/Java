// do not forget to write f in float numbers
import java.util.Scanner;
public class video_27{
    public static void main(String[] args){
        // int [] numbers = new int[5];   
        // int [] numbers = {12,34,45,67,7,89,034};   
        // float [] numbers = {12.34f,34,4.5f,67,7.0f,89,034};   
        // System.out.print(numbers.length);
        // System.out.print(numbers[2]);
        // String [] student = {"a","b","c","d"};
        // System.out.print(student.length);
        // System.out.print(student[1]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int n = sc.nextInt();
        int [] number = new int[n];
        System.out.print("Enter array Elements: ");
        for (int i=0; i<number.length; i++){
            number[i] = sc.nextInt();
        } 

        // forward order
        // System.out.print("Array in forward: ");
        // for (int i=0; i<number.length; i++){
        //     System.out.print(number[i] + " ");
        // }

        // reverse order
        // System.out.println(" ");
        // System.out.print("Array in reverse: ");
        // for (int i=number.length-1; i>=0; i--){
        //     System.out.print(number[i] + " ");
        // } 

        System.out.print("Array in forward: ");
        for (int element : number){
            System.out.print(element + " ");
        } 


    }
} 