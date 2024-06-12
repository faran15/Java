import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1: Check if a given string is a palindrome");
        System.out.println("2: Check if a given number is a palindrome");
        int choice = scanner.nextInt();
        scanner.nextLine();  

        switch (choice) {
            case 1:
                System.out.print("Enter the string: ");
                String str = scanner.nextLine();
                if (isPalindrome(str)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
                
            case 2:
                System.out.print("Enter the number: ");
                String num = scanner.nextLine();
                if (isPalindrome(num)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
                
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
