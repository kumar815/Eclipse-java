import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Case7{
	public static void main(String[] args) {	
//Approach #7: by using AIC implementing Callable interface
			ExecutorService service2 = Executors.newCachedThreadPool();
			service2.submit(
					new Callable<String>() {
						public String call() throws Exception {
							System.out.println("call from AIC implementing Callable");
							return "hello";
						}
					}
			);
			service2.shutdown();
	}
}