//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
public class Case6{
	public static void main(String[] args) {
		//Approach #6: by using AIC implementing Runnable interface
			new Thread(
					new Runnable() {
						public void run() {
							System.out.println("run from AIC implementing Runnable");
						}
					}
			).start();
 	}
}