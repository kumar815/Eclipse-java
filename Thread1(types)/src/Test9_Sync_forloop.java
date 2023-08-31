class Table{
	synchronized void PrintTable(int n) {//synchronized method	
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
		}
	}
}
class Mythread111 extends Thread{
	Table t;
	Mythread111(Table t){
		this.t=t;
	}
	public void run() {
		t.PrintTable(5);
	}
}
class Mythread222 extends Thread{
	Table t;
	Mythread222(Table t){
		this.t=t;
	}
	public void run() {
		t.PrintTable(100);
	}
}
public class Test9_Sync_forloop {
	public static void main(String[] args){
		Table obj = new Table();
		Mythread111 t1 = new Mythread111(obj);
		Mythread222 t2 = new Mythread222(obj);
		t1.start();
		t2.start();
	}

}
