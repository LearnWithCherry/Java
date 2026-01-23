public class lec2 {
    public static void main(String[] args) {
        double radius = 7.5;
        double pi = 3.14;                
        double area = pi * radius * radius;

        int finalArea = (int) area;      

        System.out.println("Radius (double) = " + radius);
        System.out.println("Area (double) = " + area);
        System.out.println("Area after casting to int = " + finalArea);
    }
}


