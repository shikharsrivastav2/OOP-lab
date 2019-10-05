import java.util.Scanner;
class BubbleSort
{
	public static void main(String[]args)
	{
	int m,i,j,temp,n,x;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of integers to sort:");
	n=in.nextInt();
	int array[]=new int[n];
	System.out.println("Array before sorting:");
	for(i=0;i<n;i++)
	{
	System.out.println(array[i]+"");
	}
m=n;
System.out.println("Enter your choice");
x=in.nextInt(); 
switch(x)
  {
  case 1:
  {
   for(j=1;j<n;j++)
    {
    if(array[i]>array[i+1]);
    {
    temp=array[i];
    array[i]=array[i+1];
    array[i+1]=temp;
    }
    }
   System.out.println("Array after sorting:");
     for(i=0;i<n;i++)
     {
     System.out.println(array[i]+"\t");
     }
     } 
     break;
   case 2:
     {
      for(j=1;j<n;j++)
      for(i=0;i<n-1;i++)
        {
        	if(array[i]<array[i+1])
        	{
        		temp=array[i];
        		array[i]=array[i+1];
        		array[i+1]=temp;
        	}
        }     
     System.out.println("Array after Sorting:");
       for(i=0;i<n;i++)
       {
       	System.out.println(array[i]+"\t");
       }
   }
       break;
     default:
     System.out.println("wrong option");
    }
  }	
 }

