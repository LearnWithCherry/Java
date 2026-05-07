import java.util.Scanner;

class WordEntry {
    private String word;

    // Constructor to store the input string
    public WordEntry(String word) {
        this.word = word;
    }

    // Overriding the equals method to compare based on custom rules
    @Override
    public boolean equals(Object obj) {
        // 1. Check if the other object is null or not a WordEntry
        if (obj == null || !(obj instanceof WordEntry)) {
            return false;
        }

        // 2. Cast the object to WordEntry so we can access its fields
        WordEntry other = (WordEntry) obj;

        // 3. Clean 'this' word: remove spaces and make lowercase
        String cleanThis = this.word.replace(" ", "").toLowerCase();

        // 4. Clean the 'other' word similarly
        String cleanOther = other.word.replace(" ", "").toLowerCase();

        // 5. Return the comparison result
        return cleanThis.equals(cleanOther);
    }
}

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Player 1 input
        String input1 = scanner.nextLine();
        // Player 2 input
        String input2 = scanner.nextLine();

        WordEntry word1 = new WordEntry(input1);
        WordEntry word2 = new WordEntry(input2);

        // This calls our overridden equals() method
        if (word1.equals(word2)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
        
        scanner.close();
    }
}
