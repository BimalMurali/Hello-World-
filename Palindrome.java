import java.io.*;
 class Palindrome
 {
   public static void main(String args[])
   { 
     int a=121, dig, rev=0;
     int temp=a;
     while(a>0)
     {
       dig=a%10;
       rev=rev*10+dig;
       a=a/10;
     }
     if(temp==rev)
    System.out.println("The number is palindrome ");
    else
    System.out.println("The number is not a palindrome ");
   }
 }
