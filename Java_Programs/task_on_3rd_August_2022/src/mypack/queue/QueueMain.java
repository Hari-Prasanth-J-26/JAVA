package mypack.queue;


import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
        pq.add("abi");
        pq.add("567");
        pq.add("123");
        pq.add("saho");
        pq.add("dinesh");

        System.out.println("Sorted in natural ordering");
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
		
	}
		
}
