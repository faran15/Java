import java.util.Scanner;
class fact
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner input =new Scanner(System.in);
n=input.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial of "+ n + "is" + fact );
}
}