import java.io.*;
import java.util.*;
public class Max
{
public static void main(String ar[])
{
Scanner in = new Scanner(System.in);
int i,j,n;
n=in.nextInt();
Vector<Integer> v = new Vector<Integer>();
int arr[]=new int[n];
boolean b[]=new boolean[n];
for( i=0;i<n;i++)
{
	arr[i]=in.nextInt();
}



		for(i=0;i<n;i++)
			{
				int sum=0;
			for(j=0;j<n;j++)
					{
b[i]=true;

if(b[j]==false)
{
sum=sum+arr[j];
}


}
v.add(sum);
b[i]=false;
}


int varr[]=new int[v.size()];
Iterator ii=v.iterator();
	m=0;
while(ii.hasNext())
{
	 int val = (int)ii.next();
	 
	 varr[m]=val;
	 m++;
}

for(i=0;i<varr.length;i++)
{
	for(j=i+1;j<varr.length;j++)
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
System.out.printf("%d %d",varr[0],varr[v.size()-1]);
}
}

