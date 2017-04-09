import java.io.*;
import java.util.*;
public class Sumarray
{
public static void main(String ar[])
{
int n;
Scanner in = new Scanner(System.in);
n = in.nextInt();
int arr[] = new int[n];
int sum = 0;
for(int i=0;i<n;i++)

	arr[i] = in.nextInt();

  for(int i=0;i<n;i++)
  {
	  sum = sum+arr[i];
}
  System.out.println(sum);
  
  }
}