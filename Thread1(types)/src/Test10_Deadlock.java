class A{
	void m1(B b1) {
		System.out.println("A m1 start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("before calling b1.m4()");
		b1.m4();
		System.out.println("A m1 end");
	}
	void m2() {
		System.out.println("B m2");
	}
}
class B{
	void m3(A a1) {
		System.out.println("B m3 start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("before calling s1.m2()");
		a1.m2();
		System.out.println("B m3 end");
	}
	void m4() {
		System.out.println("B m4");
	}
}
class AThread extends Thread{
	private A a1;
	private B b1;
	
	public AThread(A a1,B b1) {
		this.a1=a1;
		this.b1=b1;
	}
	@Override
	public void run() {
		a1.m1(b1);	
	}
}
class BThread extends Thread{
	private A a1;
	private B b1;
	
	public BThread(B b1, A a1) {
		this.b1=b1;
		this.a1=a1;
	}
	@Override
	public void run() {
		b1.m3(a1);
		
	}
	
}
public class Test10_Deadlock{
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		
		AThread th1 = new AThread(a1, b1);
		BThread th2 = new BThread(b1, a1);
		th1.start();
	 	th2.start();	
	}
}