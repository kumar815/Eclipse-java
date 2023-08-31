//import java.util.concurrent.callble;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_FrameWork {
	public static void main(String[] args) {
		ExecutorService threadpool1 = Executors.newSingleThreadExecutor();
		ExecutorService threadpool2 = Executors.newFixedThreadPool(5);
		ExecutorService threadpool3 = Executors.newCachedThreadPool();
		ExecutorService threadpool4 = Executors.newScheduledThreadPool(5);
		
		System.out.println("threadpool 1");
		System.out.println("threadpool 2");
		System.out.println("threadpool 3");
		System.out.println("threadpool 4");	
		
		}
}
