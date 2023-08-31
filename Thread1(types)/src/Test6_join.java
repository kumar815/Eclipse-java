//join method used for
class MyThread5_join extends Thread{
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run end");
	}
}

public class Test6_join{
	public  static void main(String[] args) throws InterruptedException {
		System.out.println("main start");

		MyThread5_join mt1 =  new MyThread5_join();
		mt1.start();
		
		//mt1.join();
		mt1.join(3000);
		//mt1.join(1000,500);
/*join of 100 will pause currently running thread 
 further current thread object 100 milli sec 
*/
		mt1.join(10000);
/*
 * sleep will not wait for current thread object it will wait
 for the given time less then given time current thread object
 completed also it will not resume.besuce it is not not 
 consider other object
 */
		Thread.sleep(10000);
		System.out.println("main end");
	}
}
