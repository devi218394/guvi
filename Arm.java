import java.util.*;
public class Arm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp,sum=0;
temp=n;
while(n>0)
{
int b=n%10;
n=n/10;
sum=sum+(b*b*b);
}
if(temp==sum)
{
System.out.print("Armstrong number");
}
else
{
System.out.print("not an Armstrong number");
}
}
}
