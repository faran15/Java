import java.util.Scanner;

public class MenuSelection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. if statement");
            System.out.println("2. switch statement");
            System.out.println("3. for loop");
            System.out.println("4. while loop");
            System.out.println("5. do-while loop");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nSyntax of if statement:");
                    System.out.println("if (condition) {");
                    System.out.println("    // code block");
                    System.out.println("} else {");
                    System.out.println("    // code block");
                    System.out.println("}");
                    break;
                case 2:
                    System.out.println("\nSyntax of switch statement:");
                    System.out.println("switch (expression) {");
                    System.out.println("    case value1:");
                    System.out.println("        // code block");
                    System.out.println("        break;");
                    System.out.println("    case value2:");
                    System.out.println("        // code block");
                    System.out.println("        break;");
                    System.out.println("    default:");
                    System.out.println("        // code block");
                    System.out.println("}");
                    break;
                case 3:
                    System.out.println("\nSyntax of for loop:");
                    System.out.println("for (initialization; condition; update) {");
                    System.out.println("    // code block");
                    System.out.println("}");
                    break;
                case 4:
                    System.out.println("\nSyntax of while loop:");
                    System.out.println("while (condition) {");
                    System.out.println("    // code block");
                    System.out.println("}");
                    break;
                case 5:
                    System.out.println("\nSyntax of do-while loop:");
                    System.out.println("do {");
                    System.out.println("    // code block");
                    System.out.println("} while (condition);");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        input.close();
    }
}
