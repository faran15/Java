import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterCounter {

    public static int countSpecialCharacters(String statement) {
        // Define a regular expression to match special characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");
        Matcher matcher = pattern.matcher(statement);

        // Count the number of special characters
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String statement = "Modi Birthday @ September 17, #&$% is the wishes code for him.";
        int specialCharacterCount = countSpecialCharacters(statement);
        System.out.println("Number of special characters: " + specialCharacterCount);
    }
}
