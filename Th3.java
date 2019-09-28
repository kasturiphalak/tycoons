package threading;

public class Th3 implements Runnable {

	public void run() {
		synchronized (this) {
			
		
	for(int i=1;i<=5;i++) {
			
			
			System.out.println("exe"+i);
			
		}
	System.out.println(Thread.currentThread());
	}
	}
	
	public static void main(String[] args) {
		
		Th3 t=new Th3();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		

	}

}
