import java.util.*;

class Bank {
    public double getRateOfInterest(String bankName) {
        Map<String, Double> interestRates = new HashMap<>();
        interestRates.put("SBI", 8.4);
        interestRates.put("ICICI", 7.3);
        interestRates.put("AXIS", 9.7);

        return interestRates.getOrDefault(bankName, 0.0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = scanner.next();

        Bank bank = new Bank();
        double rateOfInterest = bank.getRateOfInterest(bankName);
        if (rateOfInterest == 0.0) {
            System.out.println("Bank not found or rate not available");
        } else {
            System.out.println("Rate of interest for " + bankName + " is: " + rateOfInterest + "%");
        }

        scanner.close();
    }
}
