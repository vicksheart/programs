import java.io.*;
import java.util.*;
public class Alice
{
	public static void main(String ar[])
	{	int i;
	Scanner in = new Scanner(System.in);
	int a[] = new int[3];
	int b[] = new int[3];
	for(i=0;i<3;i++)
	{
		a[i]=in.nextInt();
	}
	for(i=0;i<3;i++)
	{
		b[i]=in.nextInt();
	}
	int a_count=0;
	int b_count=0;
	{
	for(i=0;i<3;i++)
	{	if(a[i]>b[i])
	{
		a_count++;
	}
	else if(b[i]>a[i])
	{
		b_count++;
	}
	}
	System.out.printf("%d%d",a_count,b_count);
}
}
}
