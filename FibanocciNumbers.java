import java.io.*;
 class FibanocciNumbers
 {
   public static void main(String args[])
   { 
     int n=10;
     int first=0,second=1,third;
     for(int i=0;i<n;i++)
     {
    System.out.println(+first);
       third=first+second;
  //     System.out.println(+first);
       first=second;
       second=third;
   }
 }
 }