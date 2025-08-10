package multithreading;

public class MyThread2 implements Runnable{
	
	public void run() {
		
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" value: "+i);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		
		MyThread2 runnable = new MyThread2();
		Thread t1 = new Thread(runnable,"Thread-1");
		Thread t2 = new Thread(runnable,"Thread-2");
		
		t1.start();
		t2.start();

	}

}
