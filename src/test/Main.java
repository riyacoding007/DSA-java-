package test;
import classes.ArrayQueue;
import classes.CircularQueue;
public class Main {
    public static void main(String[] args) {
        System.out.println("All interfaces are defined correctly.");

        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20
        System.out.println(q.isEmpty()); // false
        System.out.println(q.toString());


        CircularQueue cQueue = new CircularQueue(5);
        cQueue.enqueue(100);
        cQueue.enqueue(200);    
        cQueue.enqueue(300);
        System.out.println(cQueue.dequeue()); // 100
        System.out.println(cQueue.dequeue()); // 200
        System.out.println(cQueue.toString());
        cQueue.enqueue(400);
        cQueue.enqueue(500);
        System.out.println(cQueue.toString());
    }
}
