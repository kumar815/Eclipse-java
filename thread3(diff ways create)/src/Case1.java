//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

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
class MyThread0_1 extends Thread {
	@Override
	public void run() {
		System.out.println("run from MyThread");
	}
}


public class Case1 {
	public static void main(String[] args) {
		//Approach #1: Create a class extending Thread class
				MyThread22 th2 = new MyThread22();
				th2.start();
				//Problem in this approach: no M I, no code reusability
	}
}