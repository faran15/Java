import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Date (dd/MM/yyyy): ");
        String date = input.next();

        int year = getYearFromDate(date);

        if (isLeapYear(year)) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }

        input.close();
    }

    public static int getYearFromDate(String date) {
        String[] parts = date.split("/");
        return Integer.parseInt(parts[2]);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
