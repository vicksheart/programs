import java.io.*;
import java.util.*;
public class Arr2d
{
     public static void main(String ar[])
{
int i,j,n,sum=0,sum1=0;
Scanner in = new Scanner(System.in);
n = in.nextInt();
int arr[][]=new int[n][n];
for(i=0;i<n;i++)
 {
  for(j=0;j<n;j++)
   {
     arr[i][j]=in.nextInt();
   }
}  
for(i=0;i<n;i++)
{
 for(j=0;j<n;j++)
 {
	 if(arr[i]==arr[j])
	 {
		 sum = sum+arr[i][j];
     }
   	
}
}
int k=1;
for(i=0;i<n;i++)
{
	sum1= sum1+arr[i][n-i-k];
}
System.out.println(sum-sum1);
}
}