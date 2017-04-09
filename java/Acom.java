import java.io.*;
import java.util.*;
public class Acom
{
public static void main(String ar[])
{
int i,j,n1,n2=0,temp=0;
Scanner in = new Scanner(System.in);
n1=in.nextInt();
int arr[]=new int[n1];
for(i=0;i<n1;i++)
{
 arr[i]=in.nextInt();
}
n2=in.nextInt();
int brr[]=new int[n2];
for(j=0;j<n2;j++)
{
	brr[j]=in.nextInt();
}
for(i=0;i<n1;j++)
{
	for(j=0;j<n2;j++)
	{
		if(arr[i]==brr[j])
		{
			temp=arr[i];
			arr[i]=brr[j];
			brr[j]=temp;
        }
    }
}
if(arr[i]||brr[j]==temp)
{
System.out.printf("%d",temp);	
}
}
}