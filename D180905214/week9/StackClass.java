import java.io.*;
import java.util.*;
import java.lang.*;

interface operation<T> 
{
	public boolean isEmpty();
	public boolean isFull();
	public void push(T data) throws StackOverflowExc ; 
	public T pop() throws StackUnderflowExc;
}


class GenStack<T> implements operation<T>
{
	T[] st;
	int top;
	int capacity;

	GenStack(int capacity)
	{
		top = -1;
		st = (T[]) new Object[capacity]; 
	}

	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	} 

	public boolean isFull()
	{
		if(top == capacity-1)
			return true;
		return false;
	}

	public void push(T data) 
	{
		if(isFull())
			throw new StackOverflowExc("Stack Overflow");

		else
		{
			st[++top] = data;
		}
	}

	public T pop() 
	{
		if(isEmpty())
			throw new StackUnderflowExc("Stack Underflow");

		else
		{
			return st[top--];
		}
	}
}

class StackOverflowExc extends Exception
{
	private String exc;

	StackOverflowExc(String exc)
	{
		this.exc = exc;
	}

	public String toString()
	{
		return ("Stack is Full. Exception: "+exc);
	}
}

class StackUnderflowExc extends Exception
{
	private String exc;

	StackUnderflowExc(String exc)
	{
		this.exc = exc;
	}

	public String toString()
	{
		return ("Stack is Empty. Exception: "+exc);
	}
}

class Student
{
	String name;
	int rollno;

	Student(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
}

class Employee
{
	String name;
	int empId;

	Employee(String name,int empId)
	{
		this.name = name;
		this.empId = empId;
	}
}

public class StackClass
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements in the stack: ");
		int capacity = sc.nextInt();
	}
}