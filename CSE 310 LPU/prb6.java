public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        System.out.println(arr[1] + arr[2]);
    }
}
