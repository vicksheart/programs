import java.io.*;
import java.util.*;
public class Ra
{
public static void main(String ar[])
{
 Scanner in = new Scanner(System.in);
 int i,j,n;
 n = in.nextInt();
 int a_count=0;
 int arr[]=new int[n];
 for(i=0;i<n;i++)
 {
  arr[i]=in.nextInt();
 }
 for(i=0;i<n;i++)
 {
  for(j=i+1;j<n;j++)
  {
   if(arr[i]>arr[j])
   {
    int temp;
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	}
	}
	for(i=0;i<n;i++)
	{
    if(arr[i]==arr[n-1])
	{
		a_count++;
	
	}
	}
	System.out.printf("%d",a_count);
	}
}