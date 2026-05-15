public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) continue;
                count++;
            }
        }
        System.out.println(count);
    }
}
