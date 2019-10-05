import java.util.*;

class Table
{
	public static void printTable(int n,int k)
	{
		for(int i = 1;i<=k;i++)
		{
			System.out.println(i+" "+(n*i));
		}
	}
}


class TableThread extends Thread {

	Table table;
	int n;
	int k;
	
	public TableThread (String threadName, int n, int k, Table table)throws InterruptedException
	 {
		super(threadName);
		this.n = n;
		this.k = k;
		this.table = table;
		start();
	}

	@Override
	public void run () {
		
			Table.printTable(n, k);	

}
}

public class TableTest {

	public static void main (String [] args)throws InterruptedException {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tHow many tables do you want to print: ");
		int l = sc.nextInt();
		int arr[] = new int[l];
		
		System.out.print("\tEnter the elements: ");
		for (int i = 0; i < l; ++i)
			arr[i] = sc.nextInt();
			
		System.out.print("\tEnter the table limit: ");
		int k = sc.nextInt();
		
		System.out.println();
		
		Table table = new Table();
		
		TableThread tableThreads[] = new TableThread[l];
		
		for (int i = 0; i < l; ++i)
		{
			tableThreads[i] = new TableThread("Thread"+arr[i], arr[i], k, table);
		}

	}

}