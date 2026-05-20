import java.util.*;

public class Main {

    static Set<String> words = new HashSet<>(
        Arrays.asList(
            "hello", "world",
            "how", "are", "you"
        )
    );

    static void splitWords(String str) {

        String result = "";

        int i = 0;

        while (i < str.length()) {

            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (words.contains(sub)) {

                    result += sub + " ";
                    i = j - 1;
                    break;
                }
            }

            i++;
        }

        System.out.println("Output: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String input = sc.nextLine();

        splitWords(input);

        sc.close();c
    }
}
