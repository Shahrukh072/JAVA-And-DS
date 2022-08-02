package priorityqueue;

public class PriorityQueueTest {

	public static void main(String[] args) throws priorityQueueException {
		Priority_Queue<String> pq = new Priority_Queue<String>();
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("fsas", 90);
		pq.insert("fsafsafa", 150);
		pq.insert("xvxxvx", 120);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}

	}

}
