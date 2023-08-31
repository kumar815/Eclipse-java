//import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Case9{
	public static void main(String[] args) {
//Approach #9: by using AIC implementing Callable interface
			ExecutorService service3 = Executors.newCachedThreadPool();
			service3.submit(
					() -> {
							System.out.println("call from LamdaExpression implementing Callable");
							return "hello";
						}
					);
			service3.shutdown();
	}
	}