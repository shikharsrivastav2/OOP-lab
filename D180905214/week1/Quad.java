import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Quad
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the coefficients of the quadratic equation:");

	float a=sc.nextFloat();
	float b=sc.nextFloat();
	float c=sc.nextFloat();
	float d=b*b-4*a*c;
	
	int flag=0;
	
	if(d>0)
	
	flag=1;
	
	else if(d==0)
	
	flag=2;
	
	else
	
	flag=3;
	
	switch(flag)
	{
	case 1:
	float root1=(float)(-b-Math.sqrt(d))/(2*a);
	float root2=(float)(-b+Math.sqrt(d))/(2*a);
	System.out.println("The roots are real and distinct");
	System.out.println("The roots of the equation are:" +root2);
	
	break;

	case 2:
	float root=(-b)/(2*a);
	System.out.println("The roots are equal");
	System.out.println("The root is:" +root);

	break;

	case 3:
	System.out.println("The roots are imaginary");
	float real=(float)((-b)/(2*a));
	float im=(float)((Math.sqrt(Math.abs(d))/(2*a)));
	System.out.println("The roots pf quadratic equation are:+0'i"+im+""+real+"_i"+im);

    break;
     
	default:

	System.out.println("Error");
	}
 }
}
