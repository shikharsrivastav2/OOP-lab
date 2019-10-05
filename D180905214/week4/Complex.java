import java.util.*;
class Complex
{
	float a,b;
	Complex()
	{
		a=0.0f;
		b=0.0f;
	}
	Complex(int x,int y)
	{
		a=x;
		b=y;
	}
	void disp()
	{
		if(b>0)
		System.out.println(a+" + i"+b);
		else if(b==0)
		System.out.println(a);
		else
		System.out.println(a+" - i"+Math.abs(b));
	}
	void read()
    {
    	System.out.println("enter real and imaginary parts of a+ib");
    	Scanner sc=new Scanner(System.in);
    	a=sc.nextFloat();
    	b=sc.nextFloat();
    }
    Complex add(Complex x)
    {
    	Complex c=new Complex();
    	c.a=a+x.a;
    	c.b=b+x.b;
    	return c;    	
    }
    Complex sub(Complex x)
    {
    	Complex c=new Complex();
    	c.a=a-x.a;
    	c.b=b-x.b;
    	return c;
    }
}
    class Complextest
    {
    public static void main(String args[])
    {
    	System.out.println("Enter the two complex numbers");
    	Complex x=new Complex();
    	Complex y=new Complex();
    	Complex z=new Complex();
    	x.read();
    	y.read();
    	System.out.println("x = ");
    	x.disp();
    	System.out.println("\ny = ");
    	y.disp();
    	z=x.add(y);
    	System.out.println("The sum of complex numbers is :");
    	z.disp();
    	System.out.println("The diffrence of the complex numbers is :");
    	z=x.sub(y);
    	z.disp();

    }	
}

