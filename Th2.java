package threading;

public class Th2 implements Runnable{
	
	public void run() {


		for(char i='A';i<='J';i++) {
			
			System.out.println(i);
			
		System.out.println(Thread.currentThread());	
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		
	Th2 t=new Th2();
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	t1.start();
	t2.start();
	
		

	}

}
