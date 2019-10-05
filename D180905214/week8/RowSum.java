import java.util.*;
class RowSumThread implements Runnable
{
	int row[], i;
	int sum=0;
	Thread t;
	RowSumThread()
	{
		row=new int[10];
		i=0;
		t=new Thread();
		t.start();
	}
	RowSumThread(int r[],int i)
	{
		row=r;
		this.i=i;
		t=new Thread(this,"Thread-"+i);
		t.start();
	}
	int getsum(){return sum;}
	public void run()
	{
		for(int j=0;j<row.length;j++)
			sum+=row[j];
		System.out.println(t.getName()+" Sum = "+sum);
	}
}
class RowSum
{
	public static void main(String arg[])
	{
		int m,n;
		System.out.println("Enter number of rows and columns of the matrix");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt(); n=sc.nextInt();
		int mat[][]=new int[m][n];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				mat[i][j]=sc.nextInt();
		int tsum=0;
		RowSumThread rs[]=new RowSumThread[m];
		for(int i=0;i<m;i++)
			rs[i]=new RowSumThread(mat[i],i);
		//rs[m-1].t.setPriority(1);
		for(int i=0;i<m;i++)
		{	
			try{rs[i].t.join();}
			catch(InterruptedException e){System.out.println("Interrupted");}
		}
		/*try{rs[m-1].t.join();}
		catch(InterruptedException e){System.out.println("Interrupted");}*/
		for(int i=0;i<m;i++) tsum+=rs[i].getsum();
		System.out.println("Total sum: "+tsum);


	}
}