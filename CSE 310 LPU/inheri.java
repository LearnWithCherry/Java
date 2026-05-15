class Parent {
void show() {
System.out.print("Parent ");
}
}
class Child extends Parent {
void show() {
System.out.print("Child ");
}
}
public class Main {
public static void main(String[] args) {
Parent obj = new Child();
obj.show();
}
}
