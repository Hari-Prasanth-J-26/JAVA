package mypack.thread;

public class Producer extends Thread {
	
	
	StringBuffer buffer = new StringBuffer(4);

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				buffer.append(i);
				System.out.println("Produced "+i);
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		System.out.println("Buffer is Full\n");
		
		Consumer c = new Consumer(this);
		
	}

}
