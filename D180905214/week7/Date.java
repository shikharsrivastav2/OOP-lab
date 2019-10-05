import java.io.*;
import java.util.*;
import java.lang.*;

class MyException extends Exception
{
	private int detail;

	MyException(int error)
	{
		detail = error;
	}

	public String toString()
	{
		return "Invalid Date Entry";
	}
}

class CurrentDate
{
	private int day,month,year;

	CurrentDate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	private int flag = 0; //to check if year is leap year or not

	void LeapYearCheck(int year)
	{
		if(year % 400 == 0)
        {
            flag = 1;
        }
        else if (year % 100 == 0)
        {
            flag = 0;
        }
        else if(year % 4 == 0)
        {
            flag = 1;
        }
        else
        {
            flag = 0;
        }
	}

	void CheckDate() throws MyException
	{
		if(flag==1)
		{
			if(month>12)
				throw new MyException(month);

			if((month%2)!=0)
				if(day>31)
					throw new MyException(day);

			if(month == 2 && day>29)
				throw new MyException(day);

			if(month%2 == 0)
				if(day>30)
					throw new MyException(day);
		}

		else
		{
			if(month>12)
				throw new MyException(month);

			if((month%2)!=0)
				if(day>31)
					throw new MyException(day);

			if(month == 2 && day>28)
				throw new MyException(day);

			if(month%2 == 0)
				if(day>30)
					throw new MyException(day);
		}
	}

	void DisplayDate()
	{
		System.out.println("The date in dd/mm/yyyy form is: ");
		System.out.println(day+" / "+month+" / "+year);
	}
}

public class Date
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the day in dd");
		int day = sc.nextInt();

		System.out.println("Enter the month in mm");
		int month = sc.nextInt();

		System.out.println("Enter the year in yyyy");
		int	year = sc.nextInt();

		CurrentDate obj = new CurrentDate(day,month,year);
		obj.LeapYearCheck(year);

		try
		{
			obj.CheckDate();
		}

		catch(MyException e)
		{
			System.out.println(e);
			System.exit(0);
		}

		obj.DisplayDate();
	}
}