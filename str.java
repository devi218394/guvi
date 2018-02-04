import java.util.*;
import java.lang.*;
public class guvi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
         String s=sc.next();
         String r=s.replaceAll("[aeiouAEIOU]","");
         
         StringBuffer sb=new StringBuffer(r);
         
         
             System.out.print(sb.reverse().toString());
         
