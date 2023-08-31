//	
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//Approach #5: by using AIC extending Thread class
public class Case5{
	public static void main(String[] args) {
			new Thread() {
				public void run() {
					System.out.println("run from AIC extending Thread ");
				};
			}
			.start();
		}
	}