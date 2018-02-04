import java.util.*;
import java.lang.*;
public class guvi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int  s=sc.nextInt();
        int sum=0;
        while(s!=0)
        {
            int r=s%10;
            sum=sum+(r*r);
             s=s/10;
        }
            System.out.print(sum);
        
