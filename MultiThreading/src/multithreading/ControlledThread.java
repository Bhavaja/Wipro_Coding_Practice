package multithreading;

public class ControlledThread extends Thread{
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" count: "+i);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main thread starts...");
		ControlledThread t1 = new ControlledThread();
		ControlledThread t2 = new ControlledThread();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		System.out.println("Starting threads...");
		t1.start();
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
		try {
			t2.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Is "+t1.getName()+" alive? "+t1.isAlive());
		System.out.println("Is "+t2.getName()+" alive? "+t2.isAlive());
		
		System.out.println("Main thread finished.");

	}

}
