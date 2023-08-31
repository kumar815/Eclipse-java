//#1 Non-Daemon Thread
//#2 Daemon Thread

//#1 Non-Daemon Thread:-
// a thread thats run foor ground of the service to end user 
           //(or)
//a thread execute main logic of the project is called non-daemon thread

//#2 Daemon Thread:-
//a thread thats runs background of the app 
//provide service to floor ground running thread
				//(or)
//a thread that is running background to provide service to non-daemon threads
//is called daemon thread.so we can say daemon thread or sevice threads.

//abbasurations:-
//mainthread is a non-daemondthread
//garbage collector thread is a daemon thread
//daemon default valoue fasle
//group is name
//threadname ius a thread_0
//thread poriority is a 5
//traget is null
//thread stutus 0

//how to create daemon thread
class MyDaeamonThread1 extends Thread{
	public static void main(String[] args) {
		MyDaeamonThread1 Dm = new MyDaeamonThread1();
		 Dm.setDaemon(true);//declare true this thread daemon
		 Dm.start();
		 System.out.println("daemon thread");
	}
}