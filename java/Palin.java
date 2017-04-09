import java.io.*;
import java.util.*;
public class Palin
{
	public static void main(String ar[])
	{
		Scanner in = new Scanner(System.in);
		String n;
		int i;
		n = in.next();
		char ch[] =n.toCharArray();
		String nrev = "";
		for(i=n.length()-1;i>=0;i--)
		{
			nrev = nrev+ch[i];
		}
		if(n.equals(nrev))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}