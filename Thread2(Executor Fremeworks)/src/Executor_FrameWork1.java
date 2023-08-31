//import java.util.concurrent.callble;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_FrameWork1 {
	public static void main(String[] args) throws InterruptedException{
		ExecutorService threadpool1 = Executors.newSingleThreadExecutor();
		ExecutorService threadpool2 = Executors.newFixedThreadPool(5);
		ExecutorService threadpool3 = Executors.newCachedThreadPool();
		ExecutorService threadpool4 = Executors.newScheduledThreadPool(5);
		
		System.out.println("threadpool1");
		System.out.println("threadpool2");
		System.out.println("threadpool3");
		System.out.println("threadpool4");	
		
		threadpool1.execute(
				new Runnable() {
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName() +":Hi");
				}
		});
		threadpool1.execute(() ->{
			System.out.println(Thread.currentThread().getName() +":Hello");	
		});
		for(int i=0;i<=10;i++) {
			threadpool1.execute(() ->{
				System.out.println(Thread.currentThread().getName() +":HRU?");				
			});
	}
		System.out.println();
for(int i=0;i<=10;i++) {
	threadpool2.execute(() ->{
		System.out.println(Thread.currentThread().getName() +":WRU?");				
	});
}
System.out.println("");}}

