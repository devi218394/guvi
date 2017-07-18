import java.util.*;
public class Pri
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=sc.nextInt();
int count=0;
for(int i=n;i<n1;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count=0;
break;
}
else
{
count=1;
}
}
if(count==1)
{
System.out.print(i);
}
}
}
}
