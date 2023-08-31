//Interrput method used for distup to the other thread
// interrput used for requst to the thread schedular to pauseing 
//excetute thread sleep state using interrput.
//
class MyThread6 extends Thread{
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("IE is raised");
		}
		System.out.println("run end");
	}
}
public class Test5_interrput {
	public static void main(String[] args ) throws InterruptedException{
		System.out.println("Main start");
		
		MyThread6 mt1 = new MyThread6();
		mt1.start();
		mt1.interrupt();
		
		Thread.sleep(2000);
		//mt1.interrupt();
		System.out.println("Main end");
	}
	

}
