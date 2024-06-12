import java.util.Scanner;

public class BinaryConverter 
{
 public static int binaryToDecimal(String binary) {
 return Integer.parseInt(binary, 2);
}

 public static String binaryToOctal(String binary) 
{
        int decimal = binaryToDecimal(binary);
        return Integer.toOctalString(decimal);
}
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = scanner.nextLine();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);
        String octal = binaryToOctal(binary);
        System.out.println("Octal: " + octal);

        scanner.close();
    }
}
