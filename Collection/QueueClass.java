import java.util.Queue;
import java.util.LinkedList;

public class QueueClass{
    public static void main(String args[]){
        QueueDemo();
    }

    public static void QueueDemo(){
        Queue<Integer> q= new LinkedList<Integer>();

        q.offer(23);
        q.offer(82);
        q.offer(92);
        q.offer(19);

        System.out.println("q:"+q);
        // poll function remove front and return it
        System.out.println(q.poll());
        System.out.println("q:"+q);
        // peek returns null if queue is empty
        System.out.println(q.peek());

    }
}