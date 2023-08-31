//static varible from multiple thread 
//sequantailly execution flow(used to Synchronized method)
//synchronized used to method ,block,main method,
class Addition2{
	private static int x;
	private static int y;
	
	public static synchronized void add(int x, int y) {
		Addition2.x = x;
		Addition2.y = y;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res = Addition2.x + Addition2.y;
		System.out.println(Thread.currentThread().getName() + "result:"+ res);
	}
}
class Thread3 extends Thread{
		@Override
	public void run(){
		Addition2.add(56,60);
	}
}
class Thread4 extends Thread{
		@Override
	public void run(){
		Addition2.add(70,80);
	}
}
public class Test8_Sync1{
	public static void main(String[] args)throws InterruptedException{
				
		Thread3 th1 = new Thread3();
		Thread4 th2 = new Thread4();
		
		th1.start();
		th2.start();
		
	}
}