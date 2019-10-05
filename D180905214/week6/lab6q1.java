import java.util.Scanner;
class Person
{
	private String name;
	private int dd,mm,yyyy;
	Person(String name,int dd,int mm,int yyyy)
	{
       this.name=name;
       this.dd=dd;
       this.mm=mm;
       this.yyyy=yyyy;
	}
	void show()
	{
		System.out.println("Student name:"+name+"\nDOB:"+dd+"/"+mm+"/"+yyyy);
	}
}
class College_Graduate extends Person
{
	private float GPA;
	private int year_of_joining;
	College_Graduate(float GPA,int year_of_joining,String name,int dd,int mm,int yyyy)
	{
		super(name,dd,mm,yyyy);
        this.GPA=GPA;
        this.year_of_joining=year_of_joining;
	}
	void show()
	{
		super.show();
		System.out.println("GPA:"+GPA+"\n"+"year of joining:"+year_of_joining);
	}
}
class lab6q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Give Name");
		String name=sc.next();
		System.out.println("Give year of birth");
		int yyyy=sc.nextInt();
		System.out.println("Give month of birth");
		int mm=sc.nextInt();
		System.out.println("Give date of birth");
		int dd=sc.nextInt();
		System.out.println("Give GPA ");
		float GPA=sc.nextInt();
		System.out.println("Give year of joining");
		int year_of_joining=sc.nextInt();
		College_Graduate c=new College_Graduate(GPA,year_of_joining,name,dd mm yyyy);
		c.show();
	}
}