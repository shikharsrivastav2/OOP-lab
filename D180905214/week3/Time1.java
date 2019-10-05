import java.util.*;

class Time
{
	int hr;
	int min;
	int sec;

	Time(int h, int m, int s)
	{
		hr=h;
		min=m;
		sec=s;
	}

	public void display()
	{
		System.out.println(""+hr+":"+min+":"+sec);
	}	

	public static Time add(Time t1, Time t2)
	{
		Time t3 = new Time(0,0,0);
		t3.sec = (t1.sec+t2.sec)%60;
		t3.min = ((t1.sec+t2.sec)/60 + t1.min + t2.min)%60;
		t3.hr = (t1.hr+t2.hr + (t1.min+t2.min)/60)%24;

		return t3;
	}

	public static Time sub(Time t1, Time t2)
	{
		Time t3 = new Time(0,0,0);
		int x = (t1.hr*3600 - t2.hr*3600 + t1.min*60 - t2.min*60 + t1.sec - t2.sec);
		t3.hr = x/3600;
		x=x%3600;
		t3.min=x/60;
		t3.sec=x%60;

		return t3;
	}

	public static void comp(Time t1, Time t2)
	{
		int x1 = (t1.hr*3600 + t1.min*60 + t1.sec);
		int x2 = (t2.hr*3600 + t2.min*60 + t2.sec);
		if(x1>x2)
			System.out.println("1 > 2");
		else if(x1==x2)
			System.out.println("1 = 2");
		else 
			System.out.println("1 < 2");
	}
}

public class Time1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hr min sec");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		Time obj1 = new Time(x,y,z);
		Time obj2 = new Time(1,1,1);
		Time obj3 = new Time(0,0,0);
		obj3 = Time.add(obj1,obj2);
		obj3.display();
		obj3 = Time.sub(obj1,obj2);
		obj3.display();
		Time.comp(obj1,obj2);
	}
}