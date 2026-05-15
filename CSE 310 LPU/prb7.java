class Box {
    int length;
    Box(int length) {
        this.length = length;
    }
}
public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b.length);
    }
}
