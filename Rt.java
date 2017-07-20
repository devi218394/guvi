import java.util.*;

public class Rt{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

int s=sc.nextInt();
int rev=0;

while(s>0)
{
int m=s%10;
rev=(rev*10)+m;
s=s/10;
}

System.out.print(rev);
}
}
