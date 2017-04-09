import java.util.*;
import java.io.*;
import java.util.Scanner.*;
class Pat1
{
  public static void main(String ar[])
{
 int n;
 Scanner in = new Scanner(System.in);
 n=in.nextInt();
 for(int i=n;i>=1;i--)
{
   for(int j=n;j>=i;j--)
   {
    System.out.print("*");
   }
System.out.println(" ");
}
}
}