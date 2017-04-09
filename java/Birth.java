import java.io.*;
import java.util.*;
public class Birth
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
 int max=1;
 for(i=0;i<n;i++)
 {
	 if(arr[i]>max)
	 {
		max=arr[i]; 
	 }
 }
System.out.println("max "+max);
	for(i=0;i<n;i++)
 {
	
	{
    if(arr[i]==max)
	{
		a_count++;
	}
	}
	}
	System.out.printf("%d",a_count);
	}
}

