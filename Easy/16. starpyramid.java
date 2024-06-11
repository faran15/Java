import java.util.Scanner;
class starpyramid 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
int m= 1;
for (int i = 0; i < rows; i++) {
for (int j = rows - i; j > 1; j--) {
System.out.print(" ");
}
for (int l = 0; l <m; l++) {
System.out.print("*");
}
m=m+ 2;
System.out.println();
        }
    }
}
