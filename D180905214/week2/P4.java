import java.util.Scanner;
public class P4
{
    //int a[][],int b[][]
    public static void add(int[][] a,int[][] b)
    {
        int ac=a[0].length;
        int ar=a.length;
        int bc=b[0].length;
        int br=b.length;
        if((ac==bc)&(ar==br))
        {
        	for(int i=0;i<ar;i++)
        	{
        		for(int j=0;j<ac;j++)
        		{
        			a[i][j]+=b[i][j];
        		}
        	}
        }
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter dimensions of the matrix A  :" );
    	int m=sc.nextInt();
    	int n=sc.nextInt();
    	int[][] a= new int[m][n];
    	int[][] b= new int[m][n];
    	for (int i = 0; i < m ; i++) 
        {
            for (int j = 0; j < n ; j++) 
            {
                System.out.print("Enter a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print("Enter b[" + i + "][" + j + "] : ");
                b[i][j] = sc.nextInt();
            }
        }
        add(a,b);
        System.out.println("\n\n\n\n\n\t\tResultant Matrix:");
        for (int i = 0; i < m; i++) 
        {
            System.out.print("\t\t");
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}