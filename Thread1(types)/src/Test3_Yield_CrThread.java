//yield:- using for  pausing current running thread
//and allowoing other thread to execute
//yield can not execute pausing gyarenty not good.
//use to sleep method

class MyThread4 extends Thread{
	public void run() {
		System.out.println("run");
	}
}
public class Test3_Yield_CrThread {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread4 mt1 = new MyThread4();
		mt1.start();
		
		Thread.yield();
		
		
		System.out.println("Main end");
	}

}
