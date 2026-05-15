enum Day { MON, TUE, WED }
public class Main {
    public static void main(String[] args) {
        Day d1 = Day.MON;
        Day d2 = Day.MON;
        System.out.print((d1 == d2) + " ");
        System.out.print(d1.equals(d2));
    }
}
