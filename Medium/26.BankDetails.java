import java.util.Hashtable;

public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();
        bankDetails.put(1001, "Alice Johnson");
        bankDetails.put(1002, "Bob Smith");
        bankDetails.put(1003, "Carol Williams");
        System.out.println("Bank Details: " + bankDetails);
        int size = bankDetails.size();
        System.out.println("Size of the Hashtable: " + size);
        bankDetails.clear();
        System.out.println("Hashtable cleared.");
        System.out.println("Size of the Hashtable after clearing: " + bankDetails.size());
    }
}
