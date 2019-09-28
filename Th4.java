package threading;

public class Th4 implements Runnable 
{

	public void run() 
	{
		
		synchronized (this)
		{
			
			for(int i=1;i<=10;i++)
			{
						
						
						System.out.println(i);
						
					}
					
		}

	}
	public static void main(String[] args) {

		Th4 t=new Th4();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
	}

}
