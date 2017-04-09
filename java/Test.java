import java.io.*;
import java.util.*;
public class Test
{
public static void main(String ar[])
{
 Scanner in = new Scanner(System.in);
 int i,j,k,sum=0;
 int n;
 int a_count=0;
 n = in.nextInt();
 k = in.nextInt();
 int arr[] = new int[n];
 for(i=0;i<n;i++)
 {
   arr[i]=in.nextInt();
  }
  for(i=0;i<n;i++)
  {
   for(j=i+1;j<n;j++)
   {
    sum = arr[i]+arr[j];
	if(sum==k)
	{
		a_count++;
	}
	
	}
  }
  System.out.printf("%d",a_count);
}
}
  
  