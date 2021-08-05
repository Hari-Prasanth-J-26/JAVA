package mypack.thread;

public class ThreadMain {
	
	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		MyThread m1 = new MyThread();
		m1.setName("thread-1");
		MyThread m2 = new MyThread();
		m2.setName("thread-2");
		MyThread m3 = new MyThread();
		m3.setName("thread-3");
		MyThread m4 = new MyThread();
		m4.setName("thread-4");
		MyThread m5 = new MyThread();
		m5.setName("thread-5");
		m2.setPriority(10);
		m1.setDaemon(true);
		m2.setDaemon(true);
		m3.setDaemon(true);
		m4.setDaemon(true);
		m5.setDaemon(true);
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		System.out.println("Main ends here");
	}



}
