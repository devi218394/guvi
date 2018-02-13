import java.util.*;
import java.lang.*;
public class guvi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        String w=" ";
        String r=" ";
        for(int i=0;i<s1.length;i++)
        {
            String e=s1[i];
        
        for(int j=e.length()-1;j>=0;j--)
        {
            r=r+e.charAt(j);
        }
        
        w=w+r+" ";
        }
        System.out.println(w);
        
         
           
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

