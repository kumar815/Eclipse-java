class Factory{
	private int items;
	private boolean itmesAvaiable;
	
	synchronized void produce(int items) {
		if(itmesAvaiable) {
			try {
			wait();
			}
			catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
		this.items =this.items+items; 
		System.out.println("produced items:" + items);
		
		itmesAvaiable = true;
		
		notify();
	}
	synchronized void consume(int items) {
		if(!itmesAvaiable) {
			try {
			wait();
			}
			catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
		this.items =this.items-items;
		System.out.println("consumed items:" + items);
		 itmesAvaiable = false;
		 notify();
	}
}
class producer implements Runnable{
	private Factory factory;
	public producer(Factory factory) {
		this.factory=factory;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			factory.produce(i);
		}
	}
}
class Consumer implements Runnable{
	private Factory factory;
	public Consumer(Factory factory) {
		this.factory=factory;
}
	public void run() {
		for(int i=1;i<=10;i++) {
		factory.consume(i);
		
	}
}
public class Test11_Itc {
	public static void main(String[] args) {
		Factory bajajFactory =new Factory();
		producer producer= new producer(bajajFactory);
		Consumer consumer =new Consumer(bajajFactory);
		
		Thread producerThread1 = new Thread(producer);
		Thread consumerThread1 = new Thread(consumer);
		
		Thread producerThread;
		producerThread1.start();
		consumerThread1.start();	
	}
}
