package mypack.thread;

public class ProducerConsumerMain {

	public static void main(String[] args) {

		Producer p = new Producer();
		Thread t1 = new Thread(p);
		t1.start();

	}

}
