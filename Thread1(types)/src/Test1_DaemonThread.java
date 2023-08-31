class MyThread1 extends Thread{
	public void run() {
		System.out.println(getName() + "i"
				+ " is startred as" + (isDaemon()? "Daemon":"Non-Daemon"));
	for(int i=1; i<=20;i++) {
		System.out.println("run"+ i);
		}
	System.out.println( getName()+"run end");
	}
}

public class Test1_DaemonThread{
	public  static void main(String[] args) {
		
		Thread th1 = new Thread();
		System.out.println(th1.isDaemon());
		
		th1.setDaemon(true);
		System.out.println(th1.isDaemon());
		
		MyThread1 mt1 =  new MyThread1();
		mt1.start();
		mt1.setDaemon(true);//illegalthreadstateException
		
		System.out.println("main end");
		
	
	}
}
