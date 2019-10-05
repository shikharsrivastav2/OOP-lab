import java.util.*;
class TableP extends Thread
{
	int num;
	TableP()
	{
		num=1;
		start();
	}
	TableP(int n)
	{
		num=n;
		start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(num+" * "+i+" = "+(num*i));
	}
}
class Tables
{
	public static void main(String arg[])
	{
		TableP t1=new TableP(5);
		try{t1.join();}
		catch(InterruptedException e){System.out.println("InterruptedException");}
		TableP t2=new TableP(7);
	}
}
