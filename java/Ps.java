import java.util.*;
import java.io.*;
 
 class Ps
 {
   public static void main(String ar[])
   {
     Scanner in = new Scanner(System.in);
	 int i,j;
	 for(i=1;i<=5;i++)
	 {
	  for(j=1;j<=5;j++)
	  {
	    if(i>1 && i<5)
		{
			if(j>1 && j<5)
			{
				System.out.print(" ");
			}
			  else
			  {
				  System.out.print("*");
		      }
	  }
	 else
	  {
	    System.out.print("*");
	  }
	  }
	  System.out.println(" ");
		}}}
	