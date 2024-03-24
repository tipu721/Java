package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {


    public static void main(String[] args) {

        Queue<Integer> myQueue = new PriorityQueue<>();

        myQueue.add(1);
        myQueue.add(5);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(3);

        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());

        Queue<Integer> myQueue2 = new LinkedList<>();

        myQueue2.add(5);
        myQueue2.add(3);
        myQueue2.add(2);
        myQueue2.add(4);
        myQueue2.add(1);

        System.out.println(myQueue2.peek());
    }
}
