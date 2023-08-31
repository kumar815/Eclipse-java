//import java.util.concurrent.callble;
import java.io.InterruptedIOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_FrameWork4 {
	public static void main(String[] args) throws InterruptedException{
		ExecutorService threadpool1 = Executors.newSingleThreadExecutor();
		ExecutorService threadpool2 = Executors.newFixedThreadPool(5);
		ExecutorService threadpool3 = Executors.newCachedThreadPool();
		ExecutorService threadpool4 = Executors.newScheduledThreadPool(5);
		
		System.out.println("threadpool1");
		System.out.println("threadpool2");
		System.out.println("threadpool3");
		System.out.println("threadpool4");	
//		
//		threadpool1.execute(
//				new Runnable() {
//					@Override
//					public void run() {
//						System.out.println(Thread.currentThread().getName() +":Hi");
//				}
//		});
//		threadpool1.execute(() ->{
//			System.out.println(Thread.currentThread().getName() +":Hello");	
//		});
//		for(int i=0;i<=10;i++) {
//		threadpool1.execute(() ->{
//			System.out.println(Thread.currentThread().getName() +":HRU?");				
//			
//			});
//	}
//		System.out.println();
//		for(int i=0;i<=10;i++) {
//		System.out.println(threadpool2);
//		threadpool2.execute(() ->{
//		System.out.println(Thread.currentThread().getName() +":WRU?");		
//	});
//}
//		Thread.sleep(2000);
//System.out.println();}}

		System.out.println();
		Future<Integer> res1 = threadpool1.submit(new Callable<Integer>(){
			public Integer call() throws Exception{
				System.out.println(Thread.currentThread().getName()+":from callable call");
				return 50;
			}
		});
		try {
		res1.get();
		}
		catch(InterruptedException | ExecutionException e){
			e.printStackTrace();
		}
	}
}
		
		
		
		
		