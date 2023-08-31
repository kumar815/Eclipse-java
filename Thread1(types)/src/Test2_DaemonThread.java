//using to yelid expression ?:
//main thread(Exception in thread "main" Thread-0i is but not end the pro)
//completed execution progrmae after thread terminated
class MyThread3 extends Thread{
	public void run() {
		System.out.println(getName() + "i"
				+ " is startred as" + (isDaemon()? "Daemon":"Non-Daemon"));
	for(int i=1; i<=100;i++) {
		System.out.println("run"+ i);
		}
	System.out.println( getName()+"run end");
	}
}

public class Test2_DaemonThread{
	public  static void main(String[] args) {
		System.out.println("main start");
				
		MyThread3 mt1 =  new MyThread3();
		mt1.setDaemon(true);
		mt1.start();
		mt1.setDaemon(true);
		
		System.out.println("main end");
		
	
	}
}
