import java.io.*;
 class Armstrong 
 {
   public static void main(String args[])
   { 
     int a=407;
     int rem, dig=0, num, temp;
     temp=a;
     while (a>0)
     {
       rem=a%10;
       dig=dig+(rem*rem*rem);
       a=a/10;
     }
     if(temp==dig)
    System.out.println("The given number is an armstrong number");
   else 
   System.out.println("The given number is not an armstrong number ");
   }
 }
