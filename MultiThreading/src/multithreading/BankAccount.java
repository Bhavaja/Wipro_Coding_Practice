package multithreading;

class BankAccount{
	private int balance = 1000;
	
	public synchronized void deposit(int deposit_amount) {
		balance = balance + deposit_amount;
		System.out.println(Thread.currentThread().getName()+" deposited amount "+deposit_amount);
		System.out.println("Balance: "+balance);
	}
	public synchronized void withdraw_amount(String user,int withdraw_amount) {
		if (balance >= withdraw_amount) {
			balance = balance - withdraw_amount;
			System.out.println(user+ " withdrawn amount " + withdraw_amount);
			System.out.println("Balance : " +balance);
		} else {
			System.out.println("Insufficient balance.");
		}
	}
	public int getBalance() {
		return balance;
	}
	public static void main(String[] args){
		BankAccount  account = new BankAccount();
		Thread t1 =new Thread(
				()-> {
					for(int i=1;i<5;i++){
						account.withdraw_amount("user1",500);
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){
						ie.printStackTrace();	
					}
					}				
				});
		Thread t2 =new Thread(
				()-> {
					for(int i=1;i<5;i++){
						account.withdraw_amount("user2",700);
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){
						ie.printStackTrace();	
					}
					}				
				});		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException ie){
				ie.printStackTrace();	
		}
	System.out.println("Balance Left: "+account.getBalance());
	}
}
 
	
	
	
