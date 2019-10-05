import java.util.*;
class Counter
{
static int count=0;
Counter()
 {
 count++;
 }
public void display()

 {
System.out.println("counter value is "+Counter.count);
}
}
public class Static_counter_value{
public static void main(String args[])
{
 Counter c= new Counter();
 int n;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of objects you want");
n=sc.nextInt();

Counter[]c1=new Counter[n];
  for(int i=0;i<n;i++)
  {
  c1[i]=new Counter();
  }
  c.display();
}
}

