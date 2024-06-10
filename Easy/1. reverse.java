import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int n,i,rev=0;
Scanner input=new Scanner(System.in);
n=input.nextInt(); 
while(n>0){
i=n%10;
rev=rev*10+i;
n=n/10;
}
System.out.println("the reverse of is" +rev);
}
}
