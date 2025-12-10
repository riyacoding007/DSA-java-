package test;
import classes.ArrayQueue;
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
    }
}
