//sleep method used for pusing 
//a therad exection(current running thread execution)(indipendently pass)

class MyThread5 extends Thread{
	public void run() {
		System.out.println("run");
	}
}
public class Test4_Sleep {
	public static void main(String[] args)throws InterruptedException { 
		System.out.println("Main start");
		Thread.sleep(3000);
		MyThread5 mt1 = new MyThread5();
		mt1.start();
	Thread.sleep(5000);

		
		
		System.out.println("Main end");
	}

}
