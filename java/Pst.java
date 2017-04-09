import java.io.*;
import java.util.*;
public class Pst
{
 public static void main(String ar[])
 {
 Scanner in = new Scanner(System.in);
 int i,j;
 int n=0;
 int space = n-1;
 int line=1;
 n = in.nextInt();
 for(i=0;i<n;i++)
 {
  for(j=0;j<space;j++)
  {
   System.out.print(" ");
   }
   for(j=0;j<line;j++)
   {
   System.out.print("#");
   }
   System.out.println("");
   line++;
   space--;
   }}}							         