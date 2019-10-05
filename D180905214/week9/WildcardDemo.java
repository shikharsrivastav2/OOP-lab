import java.io.*;
import java.lang.*;
import java.util.*;

class Stats<T extends Number>
{
	T[] nums; 

	Stats(T[] o)
	{
		nums = o;
	}

	double average()
	{
		double sum = 0;

		for (int i = 0;i<nums.length;i++) 
			sum += nums[i].doubleValue();

		return sum/nums.length;
	}

	boolean sameAvg(Stats<?>ob)
	{
		if(average() == ob.average())
			return true;
		return false;
	}
}

public class WildcardDemo
{
	public static void main(String[] args)
	{
		Integer inums[] = {1,2,3,4,5};

		Stats<Integer>iob = new Stats<Integer>(inums);

		double v = iob.average();

		System.out.println("Integer object average is "+v);

		Double dnums[] = {1.1,2.2,3.3,4.4,5.5};

		Stats<Double>dob = new Stats<Double>(dnums);

		double w = dob.average();

		System.out.println("Double object average is "+w);

		Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};

		Stats<Float>fob = new Stats<Float>(fnums);

		double x = fob.average();

		System.out.println("Float object average is "+x);

		System.out.print("Averages of Integer object and Double object ");
		if(iob.sameAvg(dob))
			System.out.println("are the same");
		else
			System.out.println("differ");

		System.out.print("Averages of Integer object and Float object ");
		if(iob.sameAvg(fob))
			System.out.println("are the same");
		else
			System.out.println("differ");
	}
}