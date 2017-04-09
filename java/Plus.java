import java.io.*;
import java.util.*;
public class Plus
{
	public static void main(String ar[])
	{
  Scanner in = new Scanner(System.in);
  int n=0,i;
  double p,ne,z;
  n = in.nextInt();
  int arr[]=new int[n];
  for(i=0;i<n;i++)
  {
	  arr[i]=in.nextInt();
  }
  int a_count=0;
  int b_count=0;
  int c_count=0;
  
	  for(i=0;i<n;i++)
	  {
		  if(arr[i]>0)
		  {
			  a_count++;
		  }
		  else if(arr[i]<0)
		  {
			  b_count++;
		  }
		  else if(arr[i]==0)
          {
			  c_count++;
		  }
	  }
  p = (double)a_count/n; 
  ne = (double)b_count/n;
  z = (double)c_count/n;
  System.out.printfln("%.6f\n%.6f\n%.6f\n",p,ne,z);
  }
}
	  
  