class Test {
    int x;
    Test(int x) {
        this.x = x;
    }
    Test() {
        this(10);
    }
}
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }
}
