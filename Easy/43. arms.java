import java.util.Scanner;
class arms
{
public static void main(String args[])
{
int n,sum=0,i,m;
Scanner input=new Scanner(System.in);
n=input.nextInt();
m=n;
while(n>0){
i=n%10;
sum=sum+i*i*i;
n=n/10;
}
if(sum==m)
System.out.println(m + "is a armstorng number");
else
System.out.println(m + " is not a Armstrong number");
}
}



