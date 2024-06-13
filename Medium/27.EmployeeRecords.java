import java.util.HashMap;
import java.util.Map;

public class EmployeeRecords {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Jane Smith");
        employeeMap.put(103, "Emily Davis");
        System.out.println("Employee Records: " + employeeMap);
        boolean isEmpty = employeeMap.isEmpty();
        System.out.println("Is the employee map empty? " + isEmpty);
        int employeeIdToRemove = 102; // Example employee ID to remove
        if (employeeMap.containsKey(employeeIdToRemove)) {
            String removedEmployee = employeeMap.remove(employeeIdToRemove);
            System.out.println("Removed Employee: " + removedEmployee);
        } else {
            System.out.println("Employee ID " + employeeIdToRemove + " not found.");
        }
        System.out.println("Employee Records after removal: " + employeeMap);
        employeeMap.clear();
        System.out.println("Employee map cleared.");
        System.out.println("Is the employee map empty after clearing? " + employeeMap.isEmpty());
    }
}
