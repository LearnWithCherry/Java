public class video_17{
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        if (a == true || b == false){
            System.out.println("Both are true");
        }else{
            System.out.println("One is false");
        }
        if (a == true && b == false){
            System.out.println("Both are true");
        }else{
            System.out.println("One is false");
        }
        if (a != true || b != false){
            System.out.println("Both are true");
        }else{
            System.out.println("One is false");
        }
    }
}


// AND - true if both are true else false
// OR - true even one is false 