import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Namesorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        System.out.print("Order(A/D): ");
        char order = scanner.nextLine().charAt(0);

        if (order == 'A' || order == 'a') {
            Collections.sort(names);
        } else if (order == 'D' || order == 'd') {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid order choice. Please enter 'A' for ascending or 'D' for descending.");
            scanner.close();
            return;
        }

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
