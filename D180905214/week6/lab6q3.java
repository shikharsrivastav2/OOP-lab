import java.util.Scanner;
abstract class properties
{
	int m1,m2;
	abstract float area();
}
class Rectangle extends properties
{
	
	Scanner sc=new Scanner(System.in);
   float area()
   {
   	System.out.println("Give base(m1) and height(m2)");
   	m1=sc.nextInt();
   	m2=sc.nextInt();
		return (m1*m2);
	}
}

class Square extends properties
{
	
	Scanner sc=new Scanner(System.in);
   float area()
   {
   	System.out.println("Give:base");
   	m1=sc.nextInt();
   	m1=sc.nextInt();
		return m1*m1;
	}
}

class Triangle extends properties
{
	Scanner sc=new Scanner(System.in);
   float area()
   {
   	System.out.println("Give base(m1) and height(m2)");
   	m1=sc.nextInt();
   	m2=sc.nextInt();
   	return ((float)0.5*m1*m2);
   }
}

class lab6q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		loop:
		while(true)
		{
			System.out.println("enter your choice:\n1.Rectangle area\n2.Square\n3.Triangle area\n4.exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					Rectangle r=new Rectangle();
					System.out.println(r.area());
					break;
				}
				case 2:

				{
					Square s=new Square();
					System.out.println(s.area());
					break;
				}
				case 3:
				{
					Triangle t=new Triangle();
					System.out.println(t.area());
					break;
				}

				case 4:
				break loop;
				default:
				System.out.println("Incorrect option:");
			}
		}
	}
}