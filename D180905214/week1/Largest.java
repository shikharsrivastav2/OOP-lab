import java.io.*;
import java.util.Scanner;
public class Largest
{
	public static void main(String[]args)
	
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("The Largest number is:");
	System.out.println(Largest(a,b,c));
	}
  public static int Largest(int a,int b,int c)
  {
  int ans=(a>b)?((a>c)?a:c):((b>c)?b:c);
  return ans;
  }

}