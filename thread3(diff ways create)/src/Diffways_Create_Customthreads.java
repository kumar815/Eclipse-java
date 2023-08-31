import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Q) In how many ways we can create custom thread?
 *  - Basically a custom thread is created by using Thread class
 *  we must create Thread class object and must call start() method
 *    
 *  - But the problem in this approach is we can not execute 
 *  our logic in this custom thread
 *  
 *  - To execute logic in custom thread, we must override run() method
 *  
 *  - To override run() method and to create custom thread we have 3 ways
 *  	1. extending Thread class  
 *  	2. implementing Runnable interface
 *  	3. implementing Callable<T> interface
 *  
 *  - Callable<T> interface approach is available from Java 5v 
 *  - in Callable<T> interface approach we must override call() method
 *   
 * Q) In how many ways we can supply logic to execute in custom thread?
 *  in 10 ways
 *  	1. OC extending from Thread class	
 *  	2. OC implementing from Runnable interface	
 *  	3. OC implementing from Callable<V> interface
 *  			+
 *  	4. AIC extending Thread class
 *  	5. AIC implementing Runnable interface
 *  	6. AIC implementing Callable<V> interface
 *  			+
 *  	7. LE implementing Runnable interface
 *  	8. LE implementing Callable<V> interface
 *  			+
 *  	9. MR implementing Runnable interface
 *  	10. MR implementing Callable<V> interface
 *  
 *  Q) Which approach best to create custom thread?
 *  	Priority #1. Through Executors either by implementing Runnable or Callable<T> interfaces 
 *  	Priority #2. Through Thread class by implementing Runnable interface
 *  
 *  	extending Thread class is no good approach because
 *  		1. It does not support multiple inheritance
 *  		2. It implementation code is not reusable 
 */ 
class MyThread22 extends Thread {
	@Override
	public void run() {
		System.out.println("run from MyThread");
	}
}

class MyRunnable22 implements Runnable {
	@Override
	public void run() {
		System.out.println("run from MyRunnable");
	}
}

class MyCallable22 implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("call from MyCallable");
		return "Hi";
	}
}

public class Diffways_Create_Customthreads {
	public static void main(String[] args) {
		//Approach #1: by using Thread class directly
			Thread th1 = new Thread();
			th1.start();
			//problem in this approach: We can run our task in this thread
			
		//Approach #2: Create a class extending Thread class
			MyThread22 th2 = new MyThread22();
			th2.start();
			//Problem in this approach: no M I, no code reusability
			
		//Approach #3: Create a class implementing Runnable interface
			MyRunnable22 mr = new MyRunnable22();
			Thread th3 = new Thread(mr);
			th3.start();
			//Problem in this approach: 
				//1. can not return value or exception
				//2. thread is not reusable
											
		//Approach #4: Create class implementing Callable interface 
		//				by using Executor framework
			MyCallable22 mc = new MyCallable22();  
			ExecutorService service = Executors.newCachedThreadPool();
			service.submit(mc);
			service.shutdown();
			
		//Approach #5: by using AIC extending Thread class
			new Thread() {
				public void run() {
					System.out.println("run from AIC extending Thread ");
				};
			}.start();
			
		//Approach #6: by using AIC implementing Runnable interface
			new Thread(
					new Runnable() {
						@Override
						public void run() {
							System.out.println("run from AIC implementing Runnable");
						}
					}
			).start();
			
		//Approach #7: by using AIC implementing Callable interface
			ExecutorService service2 = Executors.newCachedThreadPool();
			service2.submit(
					new Callable<String>() {
						@Override
						public String call() throws Exception {
							System.out.println("call from AIC implementing Callable");
							return "hello";
						}
					}
			);
			service2.shutdown();
			
		//Approach #8: by using LE implementing Runnable interface
			new Thread( 
				() -> System.out.println("run from LE implementing Runnable")
			).start();
			
		//Approach #9: by using AIC implementing Callable interface
			ExecutorService service3 = Executors.newCachedThreadPool();
			service3.submit(
					() -> {
							System.out.println("call from LE implementing Callable");
							return "hello";
						}
					);
			service3.shutdown();
	}
}