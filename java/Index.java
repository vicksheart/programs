import java.io.*;
import java.util.*;
public class Index
{
 public static void main(String ar[])
 {
  Scanner in = new Scanner(System.in);
  int i,n,k;
  int index=0;
  int flag=0;
  n=in.nextInt();
  k=in.nextInt();
  int arr[] = new int[n];
  {
  for(i=0;i<n;i++)
  {
	  arr[i]=in.nextInt();
  }
  }
  for(i=0;i<n;i++)
  {
		  if(arr[i]==k)
		  {  
						index=i;
						flag=1;
                         break;		 
		 }
		  
 }
 if(flag==1)
 {
	 System.out.println("Your number found at "+index);
 }
 else
 {
	 System.out.println("Not found");
 }
}
}	  