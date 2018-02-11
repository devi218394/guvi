import java.util.*;
import java.lang.*;
public class guvi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
         int n=sc.nextInt();
         int a[]=new int[n];
         int f=0;
         //int b[]=new int[a.length];
         List<Integer> l=new ArrayList<Integer>();
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         if(a[i]==i)
         {
            
                l.add(a[i]);
                f++;
                
         }
         }
         Collections.sort(l);
         for(int b:l)
         {
             System.out.print(b+" ");
         }
         if(f==0)
         {
             System.out.print("-1");
         }
           
         //}
       
          
        //if(s.length()<=100000)
        //{
        //StringBuffer sb=new StringBuffer(s);
        //String s1=sb.reverse().toString();
        //int d=Integer.valueOf(s);
        //System.out.print(d);
        //}
    }
