// Array
import java.util.Scanner; 
public class video_26{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int [] marks = new int[n];

        System.out.print("Enter " + n + " Elements: ");
        for (int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        
        System.out.print("Array Values are: ");
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");  
        }


    }
}
