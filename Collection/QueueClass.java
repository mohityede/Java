import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String args[]) {
        // QueueDemo();
        PriorityQueueDemo();
        // ArrayDequeDemo();
    }

    public static void QueueDemo() {
        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(23);
        q.offer(82);
        q.offer(92);
        q.offer(19);

        System.out.println("q:" + q);
        // poll function remove front and return it
        System.out.println(q.poll());
        System.out.println("q:" + q);
        // peek returns null if queue is empty
        System.out.println(q.peek());

    }

    public static void PriorityQueueDemo() {
        // by default it implement min-heap
        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(23);
        pq.offer(82);
        pq.offer(92);
        pq.offer(19);

        System.out.println("pq:" + pq);
        pq.poll();
        System.out.println("pq:" + pq);

        // add comparator to create max-heap
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(23);
        pq2.offer(82);
        pq2.offer(92);
        pq2.offer(19);

        System.out.println("pq2:" + pq2);
        pq2.poll();
        System.out.println("pq2:" + pq2);
    }

    public static void ArrayDequeDemo() {
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        // offer work same as queue
        aq.offer(23);
        // offerFirst add element to start of queue
        aq.offerFirst(82);
        // offerLast same as offer
        aq.offerLast(92);
        aq.offer(19);

        System.out.println("aq:" + aq);
        System.out.println("aq.poll():" + aq.poll());
        System.out.println("aq:" + aq);
        System.out.println("aq.peekFirst :" + aq.peekFirst());
        System.out.println("aq.peekLast :" + aq.peekLast());
        System.out.println("aq:" + aq);
        System.out.println("aq.pollFirst():" + aq.pollFirst());
        System.out.println("aq.pollLast():" + aq.pollLast());
    }
}