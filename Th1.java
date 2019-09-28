package threading;

public class Th1 extends Thread{
	
	
	
	public void run() {
		
	
		for(char i='A';i<='J';i++) {
			
			System.out.println(i);
			
		System.out.println(Thread.currentThread());	
			
		}
		
	}

	public static void main(String[] args) {
Th1 t=new Th1();


Th1 t1=new Th1();
t.setName("first");
t1.setName("second");

t.start();
t1.start();




	}

}
