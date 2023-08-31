//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

class MyRunnable221 implements Runnable {
	public void run() {
		System.out.println("run from MyRunnable");
	}
}
public class Case2 {
	public static void main(String[] args) {
		//Approach #2: Create a class implementing Runnable interface
		MyRunnable221 mr = new MyRunnable221();
		Thread th3 = new Thread(mr);
		th3.start();
		//Problem in this approach: 
			//1. can not return value or exception
			//2. thread is not reusable
	}
	}