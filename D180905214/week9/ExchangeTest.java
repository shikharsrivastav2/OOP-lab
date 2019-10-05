import java.io.*;
import java.util.*;
import java.lang.*;

class Array <T>
{
	public static <T> void swap(T [] arr,int a,int b)
	{
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static <T> void display(T [] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
}

public class ExchangeTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Integer intArray[] = {1, 2, 3, 4, 5, 6};
		Double doubleArray[] = {12.78, 63.41, 69.69};
		String strArray[] = {"Its", "me", "Shikhar", "Srivastav"};

		System.out.println("Before Exchanging: ");
		Array.display(intArray);
		Array.display(doubleArray);
		Array.display(strArray);

		System.out.print("Enter the two integers to be swapped: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("Swapping indices '%d' and '%d': ",a,b);
		System.out.println();
		
		Array.swap(intArray, a, b);
		Array.swap(doubleArray, a, b);
		Array.swap(strArray, a, b);

		Array.display(intArray);
		Array.display(doubleArray);
		Array.display(strArray);
	}
}