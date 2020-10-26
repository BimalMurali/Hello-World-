import java.io.*;
 class FactorialOfnNumbers 
 {
   public static void main(String args[])
   { 
     int n=10,fact=1;
     for(int i=1;i<=n;i++)
     {
       fact=1;
       for(int j=1;j<=i;j++)
       {
         fact=fact*j;
       }
       System.out.println ("Factorial of " +i+ "is  :"+fact);
     }
   }
 }
