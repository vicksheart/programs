import java.io.*;
import java.util.*;
public class Arm
{
public static void main(String ar[])
{
 Scanner in = new Scanner(System.in);
 int sum=0;
 String str = in.next();
 char c[]  = str.toCharArray();
 for(int i=0;i<str.length();i++)
 {
 Character ch = new Character(c[i]);
 String s = ch.toString();
 int n = Integer.parseInt(s);
 sum = sum+n*n*n;
 }
 Integer ii = new Integer(sum);
 String newstr = ii.toString();
 if(str.equals(newstr))
 {
	 System.out.println("Number is Armstrong number");
 }
 else
 {
	 System.out.println("no");
 }
}
} 