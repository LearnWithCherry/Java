public class StringProcessor {
    public static void main(String[] args) {
        String input = "rainy day"; // Change this to test different cases
        System.out.println(processString(input));
    }

    public static String processString(String str) {
        // Trim to remove leading/trailing accidental spaces
        String trimmed = str.trim();
        
        // Split by whitespace to count words
        String[] words = trimmed.split("\\s+");

        if (words.length == 1) {
            // Case 1: Single word -> Reverse it
            return new StringBuilder(trimmed).reverse().toString();
            
        } else if (words.length == 2) {
            // Case 2: Two words -> Remove space only
            return trimmed.replace(" ", "");
            
        } else {
            // Case 3: Three or more words -> Invalid
            return "Invalid input";
        }
    }
}
