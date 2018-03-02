import java.util.*;
import java.lang.*;
public class guvi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length()-1;i=i+2)
        {
            char a=s.charAt(i);
            int c=s.charAt(i+1)-'0';
            for(int j=0;j<c;j++)
            {
                sb.append(a);
            }
        }
                System.out.print(sb.toString());
            
        
        
            
         
           
         //}
       
          
        //if(s.length()<=100000)
        //{
        //StringBuffer sb=new StringBuffer(s);
        //String s1=sb.reverse().toString();
        //int d=Integer.valueOf(s);
        //System.out.print(d);
        //}
    }
}
















