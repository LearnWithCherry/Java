// data types of experssion and increment and decrement operatos

public class video_10{
    public static void main(String[] args){
        int a = 654 + 6;
        float b = 65.4f + 6;
        double c = 654 + 6.789;
        float d = 654 + 6.125f;
        int e = 65 + 6;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    
    // increment operator 
        int f = 10;
        System.out.println(f++); // print then increment 
        System.out.println(f); // print
        System.out.println(++f); // increment then print 
        System.out.println(f); // print

    // decrement operator
        int g = 10;
        System.out.println(g--); // print then decrement 
        System.out.println(g); // print
        System.out.println(--g); // decrement then print 
        System.out.println(g); // print
    }
}
