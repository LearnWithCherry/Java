class Demo {
    Demo() {
        System.out.print("Base ");
    }
}
public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = d1;
    }
}
