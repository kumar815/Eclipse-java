//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
public class Case8{
	public static void main(String[] args) {	
		//Approach #8: by using LE implementing Runnable interface
		new Thread( 
			() -> System.out.println("run from LamdaExpression implementing Runnable")
		).start();
	}
}