import java.io.*;
import java.util.*;
public class Arr
{
	public static void main(String ar[])
	{
  long n,i,j,sum=0;
  Scanner in = new Scanner(System.in);
  n = in.nextLong();

  Long arr[]=new Long[n];
  for(i=0;i<n;i++)
     {
      arr[i] = in.nextLong();
	 }
for(i=0;i<n;i++)
{
 sum = sum+arr[i];
}
System.out.println(sum);

} 
}