import java.util.Scanner;
interface Callable
{
	public void makeAudioCall(String cellNum);
	public void makeVideoCall(String cellNum);
}
class Phone implements Callable
{
  String brand;
  int memCapacity;
  public void makeAudioCall(String cellNum)
  {
  	System.out.println("AudioCall making to:"+cellNum+"....");
  }
 public void makeVideoCall(String cellNum)
 {
 	if(brand=="BasicPhone")
 		System.out.println("VideoCall not possible to"+cellNum);
 	else
 		System.out.println("videocall to"+cellNum+"...");
 }
}
class BasicPhone extends Phone
{
	BasicPhone()
	{
		brand="BasicPhone";
		memCapacity=0;
	}
}
class SmartPhone extends Phone
{
	SmartPhone()
	{
		brand="SmartPhone";
		memCapacity=0;
	}
}
class lab7_1
{
  public static void main(String []args)
  {
  	Scanner sc=new Scanner(System.in);
  	BasicPhone b=new BasicPhone();
  	SmartPhone s=new SmartPhone();
  	loop:while(true)
  	{
  		System.out.println("enter your choice:\n1.AudioCall\n2.VideoCall\n3.exit");
  		int ch=sc.nextInt();
  		switch(ch)
  		{
  			case 1:
  			{
  				String cellNum;
  		     System.out.println("enter a cellNum to make a AudioCall:");
  			cellNum=sc.next();
  			System.out.println("BasicPhone:");
  			b.makeAudioCall(cellNum);
  			System.out.println("SmartPhone:");
  			s.makeAudioCall(cellNum);
  			break;
  		    }
  		    case 2:
  		    {
  		    	String cellNum1;
  		    	System.out.println("enter a cellNum to make videocallv");
  		    	cellNum1=sc.next();
  		    	System.out.println("BasicPhone:");
  		    	b.makeVideoCall(cellNum1);
  		    	System.out.println("SmartPhone:");
  		    	s.makeVideoCall(cellNum1);
  		    	break;
  		    }
  		    case 3:
  		    break loop;
  		    default:System.out.println("invalid option");
  		}
  	}

  }
}