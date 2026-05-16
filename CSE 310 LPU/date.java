import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
    public static String convertDateFormat(String inputDateStr) {
        // Step 1: Define the formatter that matches your incoming text pattern
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Step 2: Parse the input string into a neutral LocalDate object
        LocalDate date = LocalDate.parse(inputDateStr, inputFormatter);
        
        // Step 3: Define the formatter for your desired output pattern
        // Note: Java's standard ISO format is yyyy-MM-dd
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Step 4: Convert the LocalDate object into the new string format
        String outputDateStr = date.format(outputFormatter);
        
        return outputDateStr;
    }

    public static void main(String[] args) {
        // Test Case
        String originalDate = "15/08/1947";
        String convertedDate = convertDateFormat(originalDate);
        
        System.out.println("Original: " + originalDate); // Output: 15/08/1947
        System.out.println("Converted: " + convertedDate); // Output: 1947-08-15
    }
}
