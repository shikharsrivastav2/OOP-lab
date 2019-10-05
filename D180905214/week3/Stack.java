import java.util.*;
class Stack
{
	int arr[],tos;
	Stack()
	{
		tos=-1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of stack ");
		arr=new int[sc.nextInt()];
	}
	void push(int x)
	{
		if(tos<arr.length-1)
		arr[++tos]=x;
		else
			System.out.println("Stack Overflow");
	}
	void pop()
	{
		if(tos==-1){
			System.out.println("Stack Underflow");
			return;
		}
		else
		tos--;
	}
	void disp()
	{
		for(int i=0;i<=tos;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String arg[])
	{
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		int num,sw;
		loop1: while(true)
		{
			System.out.println("1. Push\t2. pop\t3.exit");
			sw=sc.nextInt();
			switch(sw)
			{
				case 1: System.out.println("Enter number to push");
				s.push(sc.nextInt()); break;
				case 2: s.pop(); break;
				case 3: break loop1;
				default: System.out.println("Invalid Input"); 
			}
		}
		s.disp();
	}
}
