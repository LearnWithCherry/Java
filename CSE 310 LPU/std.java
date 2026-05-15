class Student {
    String name;
    Student(String name) {
        name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Rajat");
        System.out.println(s.name);
    }
}
