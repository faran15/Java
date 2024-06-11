import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("Is customer senior citizen (y/n): ");
        char seniorCitizen = input.next().charAt(0);

        double rateOfInterest = (seniorCitizen == 'y' || seniorCitizen == 'Y') ? 12 : 10;

        double simpleInterest = calculateSimpleInterest(principal, years, rateOfInterest);

        System.out.println("Simple Interest: " + simpleInterest);

        input.close();
    }

    public static double calculateSimpleInterest(double principal, int years, double rate) {
        return (principal * years * rate) / 100;
    }
}
