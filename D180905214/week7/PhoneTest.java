import java.io.*;
import java.util.*;

class Phone
{
	String brand;
	int memCapacity;

	interface Callable
	{
		void makeAudioCall(String cellNum);
		void makeVideoCall(String cellNum);
	}
}

class BasicPhone extends Phone implements Phone.Callable
{

	BasicPhone(String b,int m)
	{
		super.brand=b;
		super.memCapacity=m;	
	}

	public void Display()
	{
		System.out.println("For the basic phone: ");
		System.out.println("The brand is: "+super.brand);
		System.out.println("The memory is: "+super.memCapacity+ " GB");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println("Making a video call to cell number "+cellNum+" using a Basic Phone");
	}

	public void makeAudioCall(String cellNum)
	{
		System.out.println("Making an audio call to cell number "+cellNum+" using a Basic Phone");
	}
}

class SmartPhone extends Phone implements Phone.Callable
{
	SmartPhone(String b,int m)
	{
		super.brand = b;
		super.memCapacity = m;
	}

	public void Display()
	{
		System.out.println("For the Smart Phone: ");
		System.out.println("The brand is: "+super.brand);
		System.out.println("The memory is: "+super.memCapacity+" GB");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println("Making a video call to cell number "+cellNum+" using a Smart Phone");
	}

	public void makeAudioCall(String cellNum)
	{
		System.out.println("Making an audio call to cell number "+cellNum+" using a Smart Phone");
	}
}

public class PhoneTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a cell number ");
		String cellNum = sc.nextLine();

		System.out.print("Enter the basic phone brand: ");
		String b = sc.nextLine();
		System.out.println("Enter the memory capacity in GB: ");
		int m = sc.nextInt();

		BasicPhone bp = new BasicPhone(b,m);
		bp.Display();
		bp.makeAudioCall(cellNum);
		bp.makeVideoCall(cellNum);

		System.out.print("Enter the smart phone brand: ");
		b = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter the memory capacity in GB: ");
		m = sc.nextInt();
		
		SmartPhone sp = new SmartPhone(b,m);
		sp.Display();
		sp.makeVideoCall(cellNum);
		sp.makeVideoCall(cellNum);
	}
}