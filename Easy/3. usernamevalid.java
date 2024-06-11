import java.util.Scanner;
public class usernameValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is invalid.");
        }
        scanner.close();
    }
    public static boolean isValidUsername(String username) {
        int minLength = 5;
        int maxLength = 15;
        if (username == null || username.length() < minLength || username.length() > maxLength) {
            return false;
        }
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
