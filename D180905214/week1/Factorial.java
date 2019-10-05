import java.io.*;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N:");
	int n=sc.nextInt();
	System.out.println("Enter R:");
	int r=sc.nextInt();
	int res=Fact(n)/(Fact(r)*Fact(n-r));
	System.out.println("The answer of "+n+"c"+r+"is"+res);
	System.out.println("The factorial of "+n+" is "+Fact(n));
    }
	public static int Fact(int num)
	{
		int F=1;
	for (int i=1;i<=num;i++)
	{
	F=F*i;
	}
	return F;
	}
}