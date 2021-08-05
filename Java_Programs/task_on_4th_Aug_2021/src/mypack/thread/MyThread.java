package mypack.thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing from thread : "+Thread.currentThread().getName()+" value of i : "+i);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
