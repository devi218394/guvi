import java.util.*;
public class Pal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m,rev=0;
int k;
k=n;
while(n>0)
{
m=n%10;
rev=(rev*10)+m;
n=n/10;
}
if(rev==k)
{
System.out.print("palindrome");
}
else
{
System.out.print("not palindrome");
}
}
}
