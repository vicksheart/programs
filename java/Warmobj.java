import java.io.*;
import java.util.*;
public class Warmobj
  {
    public void Man(int a,int b)
	{
	  System.out.println(a+b);
	  }
	  public static void main(String ar[])
	  {
		  
	   Warmobj c = new Warmobj();
	   Scanner in = new Scanner(System.in);
	   int a = in.nextInt();
	    int b = in.nextInt();
	   c.Man(a,b);
	   }
	   }
  