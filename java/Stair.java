import java.io.*;
import java.util.*;
public class Stair
{
public static void main(String ar[])
{

Scanner in = new Scanner(System.in);
int n;
int i,j;
n = in.nextInt();
int space=n-1;
int line=1;
 for(i=0;i<n;i++)
 {
   for(j=0;j<space;j++)
   { 
    System.out.print(" ");
	}
	for(j=0;j<line;j++)
 {
	System.out.print("#");
	}
 
 
	System.out.println(" ");
	line++;
	space--;
 }
	}
	}