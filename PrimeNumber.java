import java.io.*;
 class PrimeNumber
 {
   public static void main(String args[])
   { 
     int a=13,count=0;
     for(int i=1;i<=a;i++)
     {
       if(a%i==0)
       {
         count++;
       }
     }
     if(count==2)
     {
       System.out.println("The number is Prime Number");
     }
     else
    System.out.println("The number is not a Prime Number");
   }
 }
