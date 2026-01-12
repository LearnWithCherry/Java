import java.util.Scanner;

public class problem05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = sc.nextLine();

        if (url.endsWith(".com")){
            System.out.print("Commercial Website");
        }else if(url.endsWith(".org")){
            System.out.print("Organic Website");
        }else if(url.endsWith(".in")){
            System.out.print("Indian Website");
        }else{
            System.out.print("Unknown Website");
        }
    }
}