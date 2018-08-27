import java.io.*;
import java.util.Scanner;
class far
{
    public static void main(String args[])
    { 
        int temp=0,sum=0,b;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
         String k=String.valueOf(n);
         String l=String.valueOf(m);
         int f=k.length();
         int g=l.length();
          b=n;
         int c=m;
         while(n>0)
         for(int i=n;i>=m;i++)
         {
            temp=n%10;
            sum = sum + (int) Math.pow(temp,f);
            n=n/10;
         }
       // System.out.println(a);
       if(b==sum)
       {
           System.out.println(b);
       }
       else
       {
         System.out.println("Not an amstrong number");
       }
    }
}
