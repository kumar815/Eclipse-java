class Addition {
	private int a;
	private int b;

	public void add(int a, int b) {
		this.a = a;
		this.b = b;
		int res = this.a + this.b;
		System.out.println(Thread.currentThread().getName() + "result:" + res);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
class Mythread extends Thread {
       Addition a;
       Mythread(Addition a){
    	   this.a=a;    	   
	}
       public void run() {
    	   a.add(40,60);
       }
}
class Mythread1 extends Thread{
    Addition a;
    Mythread1(Addition a){
 	   this.a=a;    	   
	}
    public void run() {
 	   a.add(30,40);
    }
}
public class Test7_Sync1{
public  static void main(String[] args) {
	Addition a1 = new Addition();//only one object 
	Mythread mt1=new Mythread(a1);
	//Mythread1 mt2=new Mythread1(a1);
	mt1.start();
    //mt2.start();
}
}
