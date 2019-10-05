import java.util.*;
class A
{
	int n;
	boolean valueSet = false;
	int get()
	{
		if(!valueSet)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception Caught");
			}
			System.out.println("Got: "+n);;
			valueSet=false;
			notifyAll();
			return n;
	}
	//synchronized
	void put(int n)//called by Producer
	{
		if(valueSet)
			try{
				wait();
				//Thread.sleep(100);
			}
			catch(InterruptedException e)
			{System.out.println("Interrupted Exception caught");}
			this.n=n;//producing
			valueSet=true;
			System.out.println("Put: "+n);//producing
			notify();//wake up consumer
	}
}
class Producer implements Runnable
{
	A a;
	Producer(A a)
	{
		this.a=a;
		new Thread(this,"Producer").start();
	}
	public void run()
	{

		for(int i=0;i<4;i++)

		{
			synchronized(a){
			a.get();}

		}
	}
}
class Consumer implements Runnable
{
	A a;
	Consumer(A a)
	{
		this.a=a;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		int i=0;
		while(i!=4)
		{
			synchronized(a){
			a.put(i++);}

		}
	}
}
public class ProducerConsumerFixed
{
	public static void main(String arg[])
	{
		A a=new A();
		new Producer(a);
		new Consumer(a);
	}
}