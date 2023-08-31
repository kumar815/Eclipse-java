import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MyCallable222 implements Callable<String> {
	public String call() throws Exception {
		System.out.println("call from MyCallable");
		return "Hi";
	}
}
public class Case4{
	public static void main(String[] args) {
										
		//Approach #4: Create class implementing Callable interface 
		//				by using Executor framework
			MyCallable222 mc = new MyCallable222();  
			ExecutorService service = Executors.newCachedThreadPool();
			service.submit(mc);
			service.shutdown();
	}
}
